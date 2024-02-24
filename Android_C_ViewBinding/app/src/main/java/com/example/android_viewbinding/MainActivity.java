package com.example.android_viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android_viewbinding.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());

        tasarim.buttonYap.setOnClickListener(view ->{
            Snackbar.make(view, "Merhaba", Snackbar.LENGTH_SHORT).show();
        });
    }
}