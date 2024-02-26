package com.example.android_widgets_sayitahminoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Sonuc_Activity extends AppCompatActivity {
    ImageView imageViewSonuc;
    TextView textViewSonuc;
    Button buttonTekrar;
    boolean gelen_sonuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc);

        imageViewSonuc = findViewById(R.id.imageViewSonuc);
        textViewSonuc = findViewById(R.id.textViewSonuc);
        buttonTekrar = findViewById(R.id.buttonTekrar);

        gelen_sonuc = getIntent().getBooleanExtra("sonuc", false);
        if(gelen_sonuc){
            textViewSonuc.setText("KAZANDINIZ");
            imageViewSonuc.setImageResource(R.drawable.mutlu_resim);
        }else{
            textViewSonuc.setText("KAYBETTİNİZ");
            imageViewSonuc.setImageResource(R.drawable.uzgun_resim);
        }
        buttonTekrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sonuc_Activity.this, Tahmin_Activity.class));
                finish();
            }
        });
    }
}