package com.example.android_ke_snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button buttonNormal, buttonGeriDonus, buttonOzel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNormal = findViewById(R.id.buttonNormal);
        buttonGeriDonus = findViewById(R.id.buttonGeriDonus);
        buttonOzel = findViewById(R.id.buttonOzel);

        buttonNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Merhaba", Snackbar.LENGTH_SHORT).show();
            }
        });
        buttonGeriDonus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Mesaj silinsin mi?", Snackbar.LENGTH_SHORT).setAction("Evet", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(view, "Mesaj silindi!", Snackbar.LENGTH_SHORT).show();
                    }
                }).show();
            }
        });
        buttonOzel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view, "İnternet bağlantısı yok", Snackbar.LENGTH_LONG).setAction("Tekrar dene", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                snackbar.setActionTextColor(Color.RED);
                snackbar.setBackgroundTint(Color.WHITE);
                snackbar.setTextColor(Color.BLUE);
                snackbar.show();
            }
        });
    }
}