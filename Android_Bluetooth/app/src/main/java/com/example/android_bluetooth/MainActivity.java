package com.example.android_bluetooth;

import static android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Set;
public class MainActivity extends AppCompatActivity {
    BluetoothAdapter myBluetooth = null;
    Set<BluetoothDevice> pairedDevices;
    ArrayAdapter<String> adapter;
    public static String EXTRA_ADDRESS = "device_address";
    final String ACTION_REQUEST_DISABLE = "android.bluetooth.adapter.action.REQUEST_DISABLE";
    Button buttonToggle, buttonPair, buttonIzin;
    ListView device_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myBluetooth = BluetoothAdapter.getDefaultAdapter();
        buttonToggle = findViewById(R.id.buttonToggle);
        buttonPair = findViewById(R.id.buttonPair);
        device_list = findViewById(R.id.device_list);

        buttonToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleBluetooth();
            }
        });
        buttonPair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listDevices();
            }
        });
    }
    private void toggleBluetooth() {
        if (myBluetooth == null)
        {
            Toast.makeText(this, "Cihazda bluetooth bulunmamaktadır!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!myBluetooth.isEnabled())
        {
            try
            {
                Intent intent = new Intent(ACTION_REQUEST_ENABLE);
                startActivity(intent);
                Log.e("DURUM", "Bluetooth başlatıldı!");
            }
            catch (SecurityException se)
            {
                BT_HATA_VER("Açmak");
            }
        }
        else if (myBluetooth.isEnabled())
        {
            Intent intent = new Intent(ACTION_REQUEST_DISABLE);
            startActivity(intent);
            Log.e("DURUM", "Bluetooth kapatıldı!");
        }
    }
    private void listDevices() {
        if (!myBluetooth.isEnabled())
        {
            Toast.makeText(this, "Bluetooth kapalı!", Toast.LENGTH_SHORT).show();
            return;
        }
        try {
            pairedDevices = myBluetooth.getBondedDevices();
            ArrayList list = new ArrayList();

            if(pairedDevices.size() > 0)
            {
                for(BluetoothDevice BTD:pairedDevices)
                {
                    list.add(BTD.getName() + "\n" + BTD.getAddress());
                }
            }
            else
            {
                Toast.makeText(this, "Etrafta eşleşecek cihaz yok!", Toast.LENGTH_SHORT).show();
            }
            final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
            device_list.setAdapter(adapter);
            device_list.setOnItemClickListener(selectDevice_Func);
        }
        catch (SecurityException se)
        {
            BT_HATA_VER("Cihaz eşleme");
        }

    }
    public AdapterView.OnItemClickListener selectDevice_Func = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String info = ((TextView) view).getText().toString();
            String address = info.substring(info.length()-17);
            Intent com = new Intent(MainActivity.this, Comunication.class);
            com.putExtra(EXTRA_ADDRESS, address);
            startActivity(com);
        }
    };
    private void BT_HATA_VER(String msg)
    {
        Log.e("DURUM", "Bluetooth \"" + msg + "\" için hata verdi!!!");
    }
}