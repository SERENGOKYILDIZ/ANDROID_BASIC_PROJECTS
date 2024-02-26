package com.example.android_widgets_videoview;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    Button buttonBasla, buttonDur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);
        buttonBasla = findViewById(R.id.buttonBasla);
        buttonDur = findViewById(R.id.buttonDur);

        buttonBasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri adres = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video1);
                videoView.setVideoURI(adres);
                videoView.start();
            }
        });
        buttonDur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.stopPlayback();
            }
        });
    }
}