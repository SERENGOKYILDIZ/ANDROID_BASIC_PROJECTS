package com.example.android_bluetooth;

import android.app.ProgressDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.UUID;

public class Comunication extends AppCompatActivity {
    String address = null;
    ProgressDialog progress;
    BluetoothAdapter myBluetooth = null;
    BluetoothSocket btSocket = null;
    BluetoothDevice remoteDevice = null;
    BluetoothServerSocket mmServer;
    boolean isBtConnected = false;
    static final UUID myUUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    Button buttonOn, buttonOff, buttonTouch;
    Button buttonLed1, buttonLed2, buttonLed3, buttonLed4;
    ImageView imageViewLed1, imageViewLed2, imageViewLed3, imageViewLed4;
    Led led1, led2, led3, led4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunication);

        Intent newInt = getIntent();
        address = newInt.getStringExtra(MainActivity.EXTRA_ADDRESS);
        buttonOn = findViewById(R.id.buttonOn);
        buttonOff = findViewById(R.id.buttonOff);
        buttonTouch = findViewById(R.id.buttonTouch);

        buttonLed1 = findViewById(R.id.buttonLed1);
        buttonLed2 = findViewById(R.id.buttonLed2);
        buttonLed3 = findViewById(R.id.buttonLed3);
        buttonLed4 = findViewById(R.id.buttonLed4);

        imageViewLed1 = findViewById(R.id.imageViewLed1);
        imageViewLed2 = findViewById(R.id.imageViewLed2);
        imageViewLed3 = findViewById(R.id.imageViewLed3);
        imageViewLed4 = findViewById(R.id.imageViewLed4);

        led1 = new Led(buttonLed1, imageViewLed1);
        led2 = new Led(buttonLed2, imageViewLed2);
        led3 = new Led(buttonLed3, imageViewLed3);
        led4 = new Led(buttonLed4, imageViewLed4);

        Led.socket = btSocket;
        led1.buttonLed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                led1.toggle_led("led1");
            }
        });
        led2.buttonLed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                led2.toggle_led("led2");
            }
        });
        led3.buttonLed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                led3.toggle_led("led3");
            }
        });
        led4.buttonLed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                led4.toggle_led("led4");
            }
        });
        buttonOn.setOnClickListener(v -> {
            if(btSocket != null)
            {
                try
                {
                    String data = "led on";
                    btSocket.getOutputStream().write(data.getBytes(),0, data.length());
                }
                catch (IOException e)
                {
                    //ERROR
                }
            }
        });
        buttonOff.setOnClickListener(v -> {
            if(btSocket != null)
            {
                try
                {
                    String data = "led off";
                    btSocket.getOutputStream().write(data.getBytes(),0, data.length());
                }
                catch (IOException e)
                {
                    //ERROR
                }
            }
        });
        buttonTouch.setOnTouchListener((v, event) -> {
            if(btSocket != null)
            {
                switch (event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                    try {
                        String data = "led on";
                        btSocket.getOutputStream().write(data.getBytes(),0, data.length());
                    }catch (IOException e)
                    {
                        //ERROR
                    }
                    break;

                    case MotionEvent.ACTION_UP:
                        try {
                            String data = "led off";
                            btSocket.getOutputStream().write(data.getBytes(),0, data.length());
                        }catch (IOException e)
                        {
                            //ERROR
                        }
                        break;
                }
            }
            return false;
        });
        MyBluetoothService.ConnectedThread bt = new MyBluetoothService.ConnectedThread(btSocket);
        bt.start();
        new BTbaglan().execute();
    }
    private void Disconnect(){
        if(btSocket != null)
        {
            try
            {
                btSocket.close();
            }
            catch (IOException ex)
            {
                //ERROR
            }
        }
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Disconnect();
    }
    private class BTbaglan extends AsyncTask<Void, Void, Void> {
        private boolean ConnectSuccess = true;

        @Override
        protected void onPreExecute() {
            progress = ProgressDialog.show(Comunication.this, "Connecting...", "Please Wait");
        }


        @Override
        protected Void doInBackground(Void... devices) {
            try {
                if (btSocket == null || !isBtConnected) {
                    try {
                        myBluetooth = BluetoothAdapter.getDefaultAdapter();
                        BluetoothDevice cihaz = myBluetooth.getRemoteDevice(address);
                        btSocket = cihaz.createInsecureRfcommSocketToServiceRecord(myUUID);
                        BluetoothAdapter.getDefaultAdapter().cancelDiscovery();
                        btSocket.connect();
                        Led.socket = btSocket;
                        Log.e("DURUM", "Bağlantı oldu");
                    }
                    catch (SecurityException ex)
                    {
                        //ERROR
                        Log.e("DURUM", "Bağlantı hatası: " + ex.toString());
                    }
                }
            } catch (IOException e) {
                ConnectSuccess = false;
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            if (!ConnectSuccess) {
                // msg("Baglantı Hatası, Lütfen Tekrar Deneyin");
                Toast.makeText(getApplicationContext(),"Connection Error Try Again",Toast.LENGTH_SHORT).show();
                finish();
            } else {
                //   msg("Baglantı Basarılı");
                Toast.makeText(getApplicationContext(),"The Connection Is Successful",Toast.LENGTH_SHORT).show();

                isBtConnected = true;
            }
            progress.dismiss();
        }
    }
}