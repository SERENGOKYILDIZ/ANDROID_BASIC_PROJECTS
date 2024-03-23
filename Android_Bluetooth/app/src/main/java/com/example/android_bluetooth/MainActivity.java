package com.example.android_bluetooth;

import static android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Set;
public class MainActivity extends AppCompatActivity {
    SharedPreferences sp;
    SharedPreferences.Editor editor;
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

        sp = getSharedPreferences("mySettings", MODE_PRIVATE);

        ////////////////-> PERMISSIONS CODES <-////////////////
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            checkPermissions();
        }
        ///////////////////////////////////////////////////////

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

    @Override
    protected void onResume() {
        super.onResume();
        sp = getSharedPreferences("mySettings", MODE_PRIVATE);
        editor = sp.edit();
        ////////////////-> PERMISSIONS CODES <-////////////////
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            checkPermissions();
        }
        ///////////////////////////////////////////////////////
        editor = sp.edit();
        if (sp.getBoolean("Isdevice", true))
        {
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
            String address = sp.getString("deviceAddress", "NULL");
            Intent com = new Intent(MainActivity.this, Comunication.class);
            com.putExtra(EXTRA_ADDRESS, address);
            startActivity(com);
        }
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

            editor = sp.edit();
            editor.putString("deviceAddress", address);
            editor.putBoolean("Isdevice", true);
            editor.commit();

            com.putExtra(EXTRA_ADDRESS, address);
            startActivity(com);
        }
    };
    private void BT_HATA_VER(String msg)
    {
        Log.e("DURUM", "Bluetooth \"" + msg + "\" için hata verdi!!!");
    }
    @RequiresApi(api = Build.VERSION_CODES.S)
    private void checkPermissions() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M)
        {
            int permissionCheck;
            permissionCheck = this.checkSelfPermission("Manifest.permission.ACCESS_FINE_LOCATION");
            permissionCheck += this.checkSelfPermission("Manifest.permission.ACCESS_COARSE_LOCATION");
            permissionCheck += this.checkSelfPermission("Manifest.permission.BLUETOOTH_CONNECT");
            permissionCheck += this.checkSelfPermission("Manifest.permission.BLUETOOTH_SCAN");
            if (permissionCheck != 0) {
                this.requestPermissions(new String[]{
                        android.Manifest.permission.ACCESS_FINE_LOCATION,
                        android.Manifest.permission.ACCESS_COARSE_LOCATION,
                        android.Manifest.permission.BLUETOOTH_CONNECT,
                        Manifest.permission.BLUETOOTH_SCAN,
                }, 1001);
            }
        } else {
            Log.d("DURUM", "checkPermissions: No need to check permissions. SDK version < M");
        }
    }
}