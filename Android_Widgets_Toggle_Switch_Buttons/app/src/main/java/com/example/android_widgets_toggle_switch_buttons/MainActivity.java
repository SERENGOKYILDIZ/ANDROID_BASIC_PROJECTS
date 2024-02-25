package com.example.android_widgets_toggle_switch_buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Switch switch2;
    ToggleButton toggleButton2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch2 = findViewById(R.id.switch2);
        toggleButton2 = findViewById(R.id.toggleButton2);
        button = findViewById(R.id.button);

        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Log.e("Mesaj", "Switch aktif");
                }else{
                    Log.e("Mesaj", "Switch pasif");
                }
            }
        });

        toggleButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Log.e("Mesaj", "Toggle aktif");
                }else{
                    Log.e("Mesaj", "Toggle pasif");
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean toggle_durum = toggleButton2.isChecked();
                boolean switch_durum = switch2.isChecked();

                Log.e("Mesaj", "Switch durum : " + switch_durum + ", Toggle durum : " + toggle_durum);
            }
        });
    }
}