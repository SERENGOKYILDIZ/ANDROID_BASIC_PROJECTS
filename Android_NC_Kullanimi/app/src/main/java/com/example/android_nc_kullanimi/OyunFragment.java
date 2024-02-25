package com.example.android_nc_kullanimi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.android_nc_kullanimi.Classes.Kisiler;

public class OyunFragment extends Fragment {
    Button buttonBitir;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View tasarim = inflater.inflate(R.layout.fragment_oyun, container, false);

        OyunFragmentArgs bundle = OyunFragmentArgs.fromBundle(getArguments());
        String gelen_ad = bundle.getAd();
        int gelen_yas = bundle.getYas();
        float gelen_boy = bundle.getBoy();
        boolean gelen_bekarMi = bundle.getBekarMi();
        Kisiler gelen_kisi = bundle.getKisi();

        Log.e("Mesaj", "Gelen ad : " + gelen_ad);
        Log.e("Mesaj", "Gelen yaş : " + gelen_yas);
        Log.e("Mesaj", "Gelen boy : " + gelen_boy);
        Log.e("Mesaj", "Gelen bekar bilgisi : " + gelen_bekarMi);
        Log.e("Mesaj", "Gelen kişi ad : " + gelen_kisi.getIsim() + " , NO : " + gelen_kisi.getNo());

        buttonBitir = tasarim.findViewById(R.id.buttonBitir);
        buttonBitir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.sonucGecis);
            }
        });
        return tasarim;
    }
}