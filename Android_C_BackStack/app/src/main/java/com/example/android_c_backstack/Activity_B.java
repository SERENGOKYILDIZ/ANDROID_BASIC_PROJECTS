package com.example.android_c_backstack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_B extends AppCompatActivity {
    Button buttonGec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        buttonGec = findViewById(R.id.buttonGec);
        buttonGec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yeniIntent = new Intent(Activity_B.this, Activity_C.class);
                startActivity(yeniIntent);
            }
        });
    }
}