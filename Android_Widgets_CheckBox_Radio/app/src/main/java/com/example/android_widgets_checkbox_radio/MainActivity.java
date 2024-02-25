package com.example.android_widgets_checkbox_radio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox_Java;
    CheckBox checkBox_Kotlin;
    RadioButton radioButton_kedi;
    RadioButton radioButton_kopek;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox_Java = findViewById(R.id.checkBox_Java);
        checkBox_Kotlin = findViewById(R.id.checkBox_Kotlin);
        radioButton_kedi = findViewById(R.id.radioButton_kedi);
        radioButton_kopek = findViewById(R.id.radioButton_kopek);
        button = findViewById(R.id.button);

        radioButton_kedi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    Toast.makeText(MainActivity.this, "Vay kedici. Kedici olduğuna göre 30 yaşında bir kadınsın", Toast.LENGTH_SHORT).show();
                    //Log.e("Mesaj", "Vay kedici");
            }
        });
        radioButton_kopek.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    Toast.makeText(MainActivity.this, "Köpekler sadıktır. Keşke herkes \"Köpek\" olabilse.", Toast.LENGTH_SHORT).show();
                    //Log.e("Mesaj", "Köpekler sadıktır");
            }
        });
        checkBox_Java.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    Toast.makeText(MainActivity.this, "Java iyidir. Ama mobil uygulama zordur.", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Ama Javadan başka seçeneğin yok!", Toast.LENGTH_SHORT).show();
            }
        });
        checkBox_Kotlin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    Toast.makeText(MainActivity.this, "Kotlin iyidir. Ama javanın çakmasıdır.", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Güzel ara sıra laf dinliyorsun :)", Toast.LENGTH_SHORT).show();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mesaj = "";
                if (checkBox_Java.isChecked() && checkBox_Kotlin.isChecked())
                    mesaj += "Sen hem Java hem de Kotlin bilen ve ";
                else if (checkBox_Java.isChecked())
                    mesaj += "Sen Java bilen ve ";
                else if (checkBox_Kotlin.isChecked())
                    mesaj += "Sen Kotlin bilen ve ";
                else
                    mesaj += "Sen yazılım bilmeyen ve ";

                if (radioButton_kedi.isChecked())
                    mesaj += "kedi seven ";
                else if (radioButton_kopek.isChecked())
                    mesaj += "köpek seven ";
                else
                    mesaj += "hiç birşey sevmeyen ";

                mesaj += "bir insansın";
                Toast.makeText(MainActivity.this,  "Sonuc : " + mesaj, Toast.LENGTH_SHORT).show();
            }
        });
    }
}