package com.example.android_proje_dizini.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.android_proje_dizini.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int rengim = R.color.turuncu;
        String yapimci = getResources().getString(R.string.yapimci);

        Log.e("Mesaj", "Uygulama çalıştı");
        Log.e("Mesaj", "Uygulama yapımcısı : " + yapimci);
    }
}