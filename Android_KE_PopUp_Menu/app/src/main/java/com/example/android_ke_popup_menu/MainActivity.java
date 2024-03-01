package com.example.android_ke_popup_menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonMenuAc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMenuAc = findViewById(R.id.buttonMenuAc);
        buttonMenuAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this, buttonMenuAc);

                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        if(item.getItemId() == R.id.action_sil)
                        {
                            Toast.makeText(MainActivity.this, "Sil seçildi", Toast.LENGTH_SHORT).show();
                            return true;
                        }
                        else if (item.getItemId() == R.id.action_duzenle)
                        {
                            Toast.makeText(MainActivity.this, "Düzenle seçildi", Toast.LENGTH_SHORT).show();
                            return true;
                        }
                        else if (item.getItemId() == R.id.action_goster)
                        {
                            Toast.makeText(MainActivity.this, "Göster seçildi", Toast.LENGTH_SHORT).show();
                            return true;
                        }
                        else {
                            return false;
                        }
                    }
                });

                popup.show();
            }
        });
    }
}