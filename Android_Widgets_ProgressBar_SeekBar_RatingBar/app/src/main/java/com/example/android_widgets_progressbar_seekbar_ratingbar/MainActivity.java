package com.example.android_widgets_progressbar_seekbar_ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button buttonBasla, buttonDur, button;
    ProgressBar progressBar;
    TextView textView_Sonuc;
    SeekBar seekBar;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBasla = findViewById(R.id.buttonBasla);
        buttonDur = findViewById(R.id.buttonDur);
        button = findViewById(R.id.button);
        progressBar = findViewById(R.id.progressBar);
        textView_Sonuc = findViewById(R.id.textView_Sonuc);
        seekBar = findViewById(R.id.seekBar);
        ratingBar = findViewById(R.id.ratingBar);

        buttonBasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
            }
        });
        buttonDur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.INVISIBLE);
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView_Sonuc.setText("Sonuç : " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float verilen_yildiz = ratingBar.getRating();
                int gelen_sonuc = seekBar.getProgress();
                Toast.makeText(MainActivity.this, "Verilen yıldız : " + verilen_yildiz + " Sonuç : " + gelen_sonuc, Toast.LENGTH_SHORT).show();
            }
        });
    }
}