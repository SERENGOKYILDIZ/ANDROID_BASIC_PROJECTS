package com.example.android_c_yenisayfaolusturma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android_c_yenisayfaolusturma.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    //private ActivityMainBinding tasarim;
    private TextView Benim_textView;
    private Button Benim_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(tasarim.getRoot());
//        tasarim.buttonYap.setOnClickListener(v -> {
//            Snackbar.make(v, "Merhaba", Snackbar.LENGTH_SHORT).show();
//        });
        //
        Benim_textView = findViewById(R.id.Benim_textView);
        Benim_button = findViewById(R.id.Benim_button);

        Benim_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Benim_textView.setText("Tıklandı!");
                Log.e("Mesaj", "Butona tıklandı!");
            }
        });
    }
}