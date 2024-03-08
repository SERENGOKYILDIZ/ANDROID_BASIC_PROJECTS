package com.example.android_depo_sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    Button buttonKaydet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonKaydet = findViewById(R.id.buttonKaydet);

        SharedPreferences sp = getSharedPreferences("KisiselBilgiler", MODE_PRIVATE);
        SharedPreferences.Editor e = sp.edit();

        buttonKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.putString("isim", "Eren");
                e.putInt("yas", 22);
                e.putFloat("boy", 1.78f);
                e.putBoolean("durum", true);

                Set<String> arkadasListesi = new HashSet<>();
                arkadasListesi.add("Zeynep");
                arkadasListesi.add("Osman");
                arkadasListesi.add("Ali");
                e.putStringSet("arkadaslar", arkadasListesi);

                e.commit();
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }
}