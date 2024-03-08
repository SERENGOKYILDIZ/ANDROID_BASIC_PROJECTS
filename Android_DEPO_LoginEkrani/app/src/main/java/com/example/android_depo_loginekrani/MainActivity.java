package com.example.android_depo_loginekrani;

import static android.widget.Toast.LENGTH_SHORT;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextUsername, editTextPassword;
    Button buttonGiris;
    SharedPreferences sp;
    SharedPreferences.Editor editor;
    String username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonGiris = findViewById(R.id.buttonGiris);

        sp = getSharedPreferences("GirisBilgi", MODE_PRIVATE);
        editor = sp.edit();

        username = sp.getString("username", "NULL");
        password = sp.getString("password", "NULL");

        if(username.equals("admin") && password.equals("123"))
        {
            startActivity(new Intent(MainActivity.this, AnaEkranActivity.class));
            finish();
        }

        buttonGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextUsername.getText().toString().equals("admin")
                        && editTextPassword.getText().toString().equals("123"))
                {
                    editor.putString("username", editTextUsername.getText().toString());
                    editor.putString("password", editTextPassword.getText().toString());
                    editor.commit();
                    startActivity(new Intent(MainActivity.this, AnaEkranActivity.class));
                    finish();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Giriş hatalı", LENGTH_SHORT).show();
                }
            }
        });
    }
}