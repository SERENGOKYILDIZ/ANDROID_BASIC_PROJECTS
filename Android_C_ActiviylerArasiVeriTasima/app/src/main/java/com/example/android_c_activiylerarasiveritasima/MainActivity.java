package com.example.android_c_activiylerarasiveritasima;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android_c_activiylerarasiveritasima.Classes.Kisiler;

public class MainActivity extends AppCompatActivity {
    private Button buttonGec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGec = findViewById(R.id.buttonGec);
        buttonGec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yeniIntent = new Intent(MainActivity.this, MainActivity2.class);

                //Putting data
                String data = "Hello World!";
                int num = 4345;
                double pi = 3.14;
                Kisiler kisi = new Kisiler("Eren", 1234, 1.75);

                yeniIntent.putExtra("datam", data);
                yeniIntent.putExtra("numaram", num);
                yeniIntent.putExtra("pi_sayisi", pi);
                yeniIntent.putExtra("nesne", kisi);

                startActivity(yeniIntent);
            }
        });
    }
}