package com.example.android_depo_sharedpreferences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Set;

public class SecondActivity extends AppCompatActivity {
    Button buttonSil, buttonGuncelle;
    TextView textViewCikti;
    SharedPreferences sp;
    SharedPreferences.Editor e;

    String ad;
    int yas;
    float boy;
    boolean durum;
    Set<String> arkadasListesi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        buttonSil = findViewById(R.id.buttonSil);
        buttonGuncelle = findViewById(R.id.buttonGuncelle);
        textViewCikti = findViewById(R.id.textViewCikti);
        sp = getSharedPreferences("KisiselBilgiler", MODE_PRIVATE);
        e = sp.edit();

        ad = sp.getString("isim", "isimsiz");
        yas = sp.getInt("yas", 0);
        boy = sp.getFloat("boy", 0.0f);
        durum = sp.getBoolean("durum", false);
        arkadasListesi = sp.getStringSet("arkadaslar", null);
        final StringBuilder sb = new StringBuilder();
        for(String ark:arkadasListesi)
        {
            sb.append(ark + " ");
        }

        textViewCikti.setText("AD : " + ad + " Yaş : " + yas + " Boy : " + boy + " Durum : "
                + durum + " Arkadaşlar : " + sb.toString());
        buttonSil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.remove("isim");
                e.commit();

                ad = sp.getString("isim", "isimsiz");
                textViewCikti.setText("AD : " + ad + " Yaş : " + yas + " Boy : " + boy + " Durum : "
                        + durum + " Arkadaşlar : " + sb.toString());
            }
        });
        buttonGuncelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.putInt("yas", 12);
                e.commit();

                yas = sp.getInt("yas", 0);
                textViewCikti.setText("AD : " + ad + " Yaş : " + yas + " Boy : " + boy + " Durum : "
                        + durum + " Arkadaşlar : " + sb.toString());
            }
        });
    }
}