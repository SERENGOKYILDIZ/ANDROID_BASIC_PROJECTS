package com.example.android_widgets_imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button buttonRes1, buttonRes2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        buttonRes1 = findViewById(R.id.buttonRes1);
        buttonRes2 = findViewById(R.id.buttonRes2);

        buttonRes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1
                imageView.setImageResource(R.drawable.resim1);
            }
        });
        buttonRes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //2
                imageView.setImageResource(getResources().getIdentifier(
                        "resim2",
                        "drawable",
                        getPackageName()));
            }
        });
    }
}