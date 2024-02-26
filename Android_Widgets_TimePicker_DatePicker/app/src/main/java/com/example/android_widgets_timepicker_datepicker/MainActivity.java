package com.example.android_widgets_timepicker_datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText editTextSaat, editTextTarih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextSaat = findViewById(R.id.editTextSaat);
        editTextTarih = findViewById(R.id.editTextTarih);

        editTextSaat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int saat = calendar.get(Calendar.HOUR_OF_DAY);
                int dakika = calendar.get(Calendar.MINUTE);
                TimePickerDialog timePicker;

                timePicker = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        editTextSaat.setText(hourOfDay + " : " + minute);
                    }
                }, saat, dakika, true);

                timePicker.setTitle("Saat seçiniz");
                timePicker.setButton(DialogInterface.BUTTON_POSITIVE, "Ayarla", timePicker);
                timePicker.setButton(DialogInterface.BUTTON_NEGATIVE, "İptal", timePicker);
                timePicker.show();
            }
        });
        editTextTarih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int yil = calendar.get(Calendar.YEAR);
                int ay = calendar.get(Calendar.MONTH);
                int gun = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePicker;

                datePicker = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        editTextTarih.setText(yil + "/" + ay + "/" + gun);
                    }
                }, yil, ay, gun);

                datePicker.setTitle("Tarih seçiniz");
                datePicker.setButton(DialogInterface.BUTTON_POSITIVE, "Ayarla", datePicker);
                datePicker.setButton(DialogInterface.BUTTON_NEGATIVE, "İptal", datePicker);
                datePicker.show();
            }
        });
    }
}