package com.example.android_c_activiylerarasiveritasima;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.android_c_activiylerarasiveritasima.Classes.Kisiler;

public class MainActivity2 extends AppCompatActivity {
    private Button buttonGec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Getting data
        String gelen_data = getIntent().getStringExtra("datam");
        int gelen_num = getIntent().getIntExtra("numaram", 0);
        double gelen_pi = getIntent().getDoubleExtra("pi_sayisi", 0.0);
        Kisiler gelen_kisi = (Kisiler) getIntent().getSerializableExtra("nesne");

        Log.e("Gelen veriler", "Gelen data : \"" + gelen_data + "\", gelen sayi : " + gelen_num + ", gelen pi : " + gelen_pi);
        Log.e("Gelen veriler", "Gelen kişinin adı : \"" + gelen_kisi.getIsim() + "\", nosu : " + gelen_kisi.getNum() + ", boyu : " + gelen_kisi.getBoy());

        buttonGec = findViewById(R.id.buttonGec);
        buttonGec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yeniIntent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(yeniIntent);
            }
        });
    }
}