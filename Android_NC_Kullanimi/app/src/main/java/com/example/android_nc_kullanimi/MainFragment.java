package com.example.android_nc_kullanimi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.android_nc_kullanimi.Classes.Kisiler;

public class MainFragment extends Fragment {
    Button buttonBasla;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View tasarim = inflater.inflate(R.layout.fragment_main, container, false);

        buttonBasla = tasarim.findViewById(R.id.buttonBitir);
        buttonBasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Kisiler kisi = new Kisiler("Eren", 155);
                MainFragmentDirections.OyunGecis gecis = MainFragmentDirections.oyunGecis(kisi);

                String ad = "Ahmet";
                int yas = 22;
                float boy = 1.72f;
                boolean bekarMi = true;

                gecis.setAd(ad);
                gecis.setYas(yas);
                gecis.setBoy(boy);
                gecis.setBekarMi(bekarMi);

                Navigation.findNavController(v).navigate(gecis);
            }
        });
        return tasarim;
    }
}