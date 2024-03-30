package com.example.android_md_toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);

        toolbar.setTitle("Özel Başlık");
        toolbar.setSubtitle("Özel Altbaşlık");
        toolbar.setLogo(R.drawable.resim);
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorAccent));
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);

        MenuItem item = menu.findItem(R.id.action_ara);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(MainActivity.this);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.action_bilgi)
        {
            Toast.makeText(getApplicationContext(), "Bilgi tıklandı", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(item.getItemId() == R.id.action_ayar)
        {
            Toast.makeText(getApplicationContext(), "Ayarlar tıklandı", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(item.getItemId() == R.id.action_cikis)
        {
            Toast.makeText(getApplicationContext(), "Çıkış tıklandı", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(item.getItemId() == R.id.action_ekle)
        {
            Toast.makeText(getApplicationContext(), "Ekle tıklandı", Toast.LENGTH_SHORT).show();
            return true;
        }
        else
        {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        Log.e("Gönderilen arama sonucu", query);
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        Log.e("Harf girdikçe sonucu", newText);
        return true;
    }
}