package com.example.android_depo_girissayac;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView textViewSayac;
    SharedPreferences sp;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewSayac = findViewById(R.id.textViewSayac);

        sp = getSharedPreferences("GirisSayac", MODE_PRIVATE);
        editor = sp.edit();

        int sayac = sp.getInt("sayac", 0);

        editor.putInt("sayac", ++sayac);

        editor.commit();

        textViewSayac.setText("Sayaç : " + String.valueOf(sayac));
    }
}