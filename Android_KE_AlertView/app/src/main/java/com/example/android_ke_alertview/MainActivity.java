package com.example.android_ke_alertview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
                AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity.this);

                ad.setMessage("Mesaj: ");
                ad.setTitle("Başlık");
                ad.setIcon(R.drawable.resim);

                ad.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Tamam Tıklandı", Toast.LENGTH_SHORT).show();
                    }
                });

                ad.setNegativeButton("İptal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "İptal Tıklandı", Toast.LENGTH_SHORT).show();
                    }
                });
                ad.create().show();
            }
        });
        buttonOzel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View tasarim = getLayoutInflater().inflate(R.layout.alert_tasarim, null);
                EditText editTextAlert = tasarim.findViewById(R.id.editTextAlert);

                AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity.this);
                ad.setMessage("Mesaj: ");
                ad.setTitle("Başlık");
                ad.setView(tasarim);

                ad.setPositiveButton("Kaydet", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String gelen_Veri = editTextAlert.getText().toString();
                        Toast.makeText(MainActivity.this, "Kaydet Tıklandı Veri : " + gelen_Veri, Toast.LENGTH_SHORT).show();
                    }
                });

                ad.setNegativeButton("İptal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Özel İptal Tıklandı", Toast.LENGTH_SHORT).show();
                    }
                });
                ad.create().show();
            }
        });
    }
}