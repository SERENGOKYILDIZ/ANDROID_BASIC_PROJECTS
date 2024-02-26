package com.example.android_widgets_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    Button button;
    ArrayList<String> ulkeler = new ArrayList<>();
    ArrayAdapter<String> veriAdaptoru;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.button);

        ulkeler.add("Türkiye");
        ulkeler.add("Amerika");
        ulkeler.add("Fransa");
        ulkeler.add("İspanya");
        ulkeler.add("Danimarka");
        ulkeler.add("Rusya");
        ulkeler.add("Almanya");
        ulkeler.add("Çin");

        veriAdaptoru = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                ulkeler);

        spinner.setAdapter(veriAdaptoru);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(
                        MainActivity.this,
                        "Seçilen ülke : " + ulkeler.get(position),
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        MainActivity.this,
                        "Seçilen ülke : " + ulkeler.get(spinner.getSelectedItemPosition()),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}