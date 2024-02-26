package com.example.android_widgets_gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<String> ulkeler = new ArrayList<>();
    ArrayAdapter<String> veriAdaptoru;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        ulkeler.add("Türkiye");
        ulkeler.add("Amerika");
        ulkeler.add("Almanya");
        ulkeler.add("Rusya");
        ulkeler.add("Çin");
        ulkeler.add("İran");
        ulkeler.add("Japonya");
        ulkeler.add("İngiltere");
        ulkeler.add("Fransa");
        ulkeler.add("İtalya");
        ulkeler.add("Suriye");
        ulkeler.add("Mısır");

        veriAdaptoru = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, ulkeler);

        gridView.setAdapter(veriAdaptoru);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Seçtiğiniz ülke : " + ulkeler.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}