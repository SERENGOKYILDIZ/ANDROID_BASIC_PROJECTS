package com.example.android_c_backstack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_D extends AppCompatActivity {
    Button buttonGec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        buttonGec = findViewById(R.id.buttonGec);
        buttonGec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yeniIntent = new Intent(Activity_D.this, MainActivity.class);
                startActivity(yeniIntent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent yeniIntent = new Intent(Activity_D.this, Activity_B.class);
        yeniIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(yeniIntent);
    }
}