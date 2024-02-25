package com.example.android_widgets_button_textview_edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonum;
    TextView textView_alici;
    EditText editText_verici;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonum = findViewById(R.id.buttonum);
        textView_alici = findViewById(R.id.textView_alici);
        editText_verici = findViewById(R.id.editText_verici);

        buttonum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String yazi = editText_verici.getText().toString();
                textView_alici.setText(yazi);
            }
        });
    }
}