package com.example.android_bluetooth;

import android.bluetooth.BluetoothSocket;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

public class Led {
    private static final String TAG = "DURUM";
    public static BluetoothSocket socket;
    Button buttonLed;
    ImageView imageViewLed;
    boolean state;

    public Led(Button buttonLed, ImageView imageViewLed) {
        this.buttonLed = buttonLed;
        this.imageViewLed = imageViewLed;
        off();
        state = false;
    }
    private void on()
    {
        imageViewLed.setImageResource(R.drawable.green_light);
    }
    private void off()
    {
        imageViewLed.setImageResource(R.drawable.red_light);
    }
    public void toggle_led(String led)
    {
        if(state)
        {
            off();
            dataWrite(led + " off");
            state = false;
        }
        else
        {
            on();
            dataWrite(led + " on");
            state = true;
        }

    }
    private void dataWrite(String datam)
    {
        Log.d(TAG, "dataWrite: Data : \"" + datam + "\", Data size : " + datam.length());
        if(socket == null)
        {
            Log.d(TAG, "dataWrite: socket is null");
        }
        if(socket != null)
        {
            try
            {
                socket.getOutputStream().write(datam.getBytes(),0, datam.length());
                Log.d(TAG, "dataWrite: Data writed");
                /*
                byte[] mmBuffer = new byte[1024];
                int datalar = socket.getInputStream().read(mmBuffer);
                for(byte by:mmBuffer)
                {
                    Log.d(TAG, "dataWrite: " + by);
                }
                */
            }
            catch (IOException e)
            {
                Log.d(TAG, "dataWrite: error, " + e.toString());
            }
        }
    }
}
