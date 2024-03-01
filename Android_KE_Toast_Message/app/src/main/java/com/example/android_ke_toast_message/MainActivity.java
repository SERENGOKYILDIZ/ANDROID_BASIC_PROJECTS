package com.example.android_ke_toast_message;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonNormal, buttonOzel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNormal = findViewById(R.id.buttonNormal);
        buttonOzel = findViewById(R.id.buttonOzel);

        buttonNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Merhaba", Toast.LENGTH_SHORT).show();
            }
        });
        buttonOzel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View tasarim = getLayoutInflater().inflate(R.layout.toast_tasarim, null);
                TextView textViewMesaj = tasarim.findViewById(R.id.textViewMesaj);

                textViewMesaj.setText("Merhaba özel tasarım");
                Toast toastOzel = new Toast(getApplicationContext());

                toastOzel.setView(tasarim);

                toastOzel.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);

                toastOzel.setDuration(Toast.LENGTH_SHORT);

                toastOzel.show();
            }
        });
    }
}