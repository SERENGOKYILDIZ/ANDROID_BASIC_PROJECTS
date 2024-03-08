package com.example.android_depo_loginekrani;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AnaEkranActivity extends AppCompatActivity {
    Button buttonCikis;
    TextView textViewCikti;
    SharedPreferences sp;
    SharedPreferences.Editor editor;
    String username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_ekran);

        buttonCikis = findViewById(R.id.buttonCikis);
        textViewCikti = findViewById(R.id.textViewCikti);

        sp = getSharedPreferences("GirisBilgi", MODE_PRIVATE);
        editor = sp.edit();

        username = sp.getString("username", "NULL");
        password = sp.getString("password", "NULL");

        textViewCikti.setText("Username : " + username + "\n" + "Password : " + password);

        buttonCikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.remove("username");
                editor.remove("password");
                editor.commit();

                startActivity(new Intent(AnaEkranActivity.this, MainActivity.class));
            }
        });
    }
}