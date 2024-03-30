package com.example.android_md_edittextfloattinglabels;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    TextInputEditText editTextAd;
    TextInputEditText editTextSifre;
    Button buttonGir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAd = findViewById(R.id.editTextAd);
        editTextSifre = findViewById(R.id.editTextSifre);
        buttonGir = findViewById(R.id.buttonGir);

        buttonGir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ad, sifre;
                ad = editTextAd.getText().toString();
                sifre = editTextSifre.getText().toString();
                Toast.makeText(getApplicationContext(), "Adınız : " + ad + ", Şifreniz : " + sifre, Toast.LENGTH_SHORT).show();
            }
        });
    }
}