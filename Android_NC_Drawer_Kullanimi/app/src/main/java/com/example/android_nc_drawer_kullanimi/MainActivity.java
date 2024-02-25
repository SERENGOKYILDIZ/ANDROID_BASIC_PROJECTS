package com.example.android_nc_drawer_kullanimi;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    NavigationView navigationView;
    DrawerLayout drawer;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = findViewById(R.id.navigationView);
        drawer = findViewById(R.id.drawer);
        toolbar = findViewById(R.id.toolbar);

        NavHostFragment navHostFragment =
                (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);

        NavigationUI.setupWithNavController(navigationView, navHostFragment.getNavController());

        //For ToolBar Header
        toolbar.setTitle("Başlık");

        //For ToolBar NavToggle
        ActionBarDrawerToggle toggle =
                new ActionBarDrawerToggle(this, drawer, toolbar,0, 0);

        drawer.addDrawerListener(toggle);
        toggle.syncState();

        //For NavHeader
        View baslik = navigationView.inflateHeaderView(R.layout.navigation_baslik);
        TextView textViewBaslik = baslik.findViewById(R.id.textViewBaslik);
        textViewBaslik.setText("Merhaba Arayüz");
    }

    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }
}