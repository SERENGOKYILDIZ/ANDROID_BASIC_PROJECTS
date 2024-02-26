package com.example.android_widgets_sayitahminoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Tahmin_Activity extends AppCompatActivity {
    TextView textViewKalanHak, textViewYardim;
    EditText editTextGirdi;
    Button buttonTahmin;

    int rastgele_sayi;
    int sayac = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahmin);

        textViewKalanHak = findViewById(R.id.textViewKalanHak);
        textViewYardim = findViewById(R.id.textViewYardim);
        editTextGirdi = findViewById(R.id.editTextGirdi);
        buttonTahmin = findViewById(R.id.buttonTahmin);

        Random r = new Random();
        rastgele_sayi = r.nextInt(101);
        Log.e("Mesaj", "Rastgele sayı : " + String.valueOf(rastgele_sayi));

        buttonTahmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayac--;
                int tahmin = Integer.parseInt(editTextGirdi.getText().toString());
                if(tahmin == rastgele_sayi)             //Answer is true!
                {
                    Intent i = new Intent(Tahmin_Activity.this, Sonuc_Activity.class);
                    i.putExtra("sonuc", true);
                    startActivity(i);
                    finish();
                }
                if(tahmin > rastgele_sayi)              //Answer is bigger than result
                {
                    textViewYardim.setText("Azalt");
                    textViewKalanHak.setText("Kalan Hak : " + sayac);
                }
                if(tahmin < rastgele_sayi)              //Answer is smaller than result
                {
                    textViewYardim.setText("Arttır");
                    textViewKalanHak.setText("Kalan Hak : " + sayac);
                }
                if(sayac == 0)
                {
                    Intent i = new Intent(Tahmin_Activity.this, Sonuc_Activity.class);
                    if(tahmin == rastgele_sayi)             //Answer is true!
                    {
                        i.putExtra("sonuc", true);
                    }
                    else
                    {
                        i.putExtra("sonuc", false);
                    }
                    startActivity(i);
                    finish();
                }
                editTextGirdi.setText("");
            }
        });
    }
}