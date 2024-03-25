package com.example.android_md_giris;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Look at the "colors.xml" and "themes.xml"
         * Look at "https://www.materialpalette.com/"
         * Can you look "https://www.uplabs.com/"
         */

        RecyclerView recyclerView;
        CardView cardView;
        Snackbar snackbar;
    }
}