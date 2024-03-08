package com.example.android_depo_harici_ve_dahili_depolama;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    EditText editTextGirdi;
    Button buttonYaz, buttonOku, buttonSil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextGirdi = findViewById(R.id.editTextGirdi);
        buttonYaz = findViewById(R.id.buttonYaz);
        buttonOku = findViewById(R.id.buttonOku);
        buttonSil = findViewById(R.id.buttonSil);

        buttonYaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Harici_Yaz();
                Dahili_Yaz();
            }
        });
        buttonOku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Harici_Oku();
                Dahili_Oku();
            }
        });
        buttonSil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Harici_Sil();
                Dahili_Sil();
            }
        });
    }
    public void Harici_Yaz()
    {
        File dosyaYolu = Environment.getExternalStorageDirectory();
        File dosya = new File(dosyaYolu, "dosya.txt");
        try
        {
            if(!dosya.exists())
            {
                dosya.createNewFile();
            }
            FileWriter fw = new FileWriter(dosya);

            BufferedWriter yazici = new BufferedWriter(fw);

            yazici.write(editTextGirdi.getText().toString());
            yazici.flush();
            yazici.close();
            fw.close();

            editTextGirdi.setText("");
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
    public void Harici_Oku()
    {
        File dosyaYolu = Environment.getExternalStorageDirectory();
        File dosya = new File(dosyaYolu, "dosya.txt");
        try
        {
            FileReader fr = new FileReader(dosya);

            BufferedReader okuyucu = new BufferedReader(fr);

            StringBuilder sb = new StringBuilder();
            String satir = "";
            while((satir = okuyucu.readLine()) != null)
            {
                sb.append(satir + "\n");
            }
            okuyucu.close();
            editTextGirdi.setText(sb.toString());
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
    public void Harici_Sil()
    {
        File dosyaYolu = Environment.getExternalStorageDirectory();
        File dosya = new File(dosyaYolu, "dosya.txt");
        dosya.delete();
    }
    public void Dahili_Yaz()
    {
        try
        {
            FileOutputStream fos = openFileOutput("dosya.txt", MODE_PRIVATE);
            OutputStreamWriter yazici = new OutputStreamWriter(fos);

            yazici.write(editTextGirdi.getText().toString());
            yazici.close();

            editTextGirdi.setText("");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void Dahili_Oku()
    {
        try
        {
            FileInputStream fis = openFileInput("dosya.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader okuyucu = new BufferedReader(isr);

            StringBuilder sb = new StringBuilder();
            String satir = "";
            while((satir = okuyucu.readLine()) != null)
            {
                sb.append(satir + "\n");
            }
            okuyucu.close();
            editTextGirdi.setText(sb.toString());
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
    public void Dahili_Sil()
    {
        File yol = getFilesDir();
        File file = new File(yol, "dosya.txt");

        editTextGirdi.setText(String.valueOf(file.delete()));
    }
}