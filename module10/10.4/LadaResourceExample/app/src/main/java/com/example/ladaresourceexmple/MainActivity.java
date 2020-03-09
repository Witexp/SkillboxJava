package com.example.ladaresourceexmple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {
    static {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextView dateView = findViewById(R.id.date);
        //TextView dateView2 = findViewById(R.id.date2);
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.HOUR_OF_DAY,12);
        calendar2.set(Calendar.MINUTE,00);
        Date date = calendar1.getTime();
        Date date2 = calendar2.getTime();
       //dateView.setText(date.toString());
        //dateView2.setText(date2.toString());
        if (date.after(date2)) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }
        else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }

    }

    public void onChoseCareActivity(View view) {
        Spinner spinnerCar = findViewById(R.id.spinner);
        String choseCar = String.valueOf(spinnerCar.getSelectedItem());
        if (choseCar.equals("Гранта")){
            Intent intent = new Intent(this, LadaGrantaActivity.class);
            startActivity(intent);
        } else if (choseCar.equals("Приора")){
            Intent intent = new Intent(this, LadaPrioraActivity.class);
            startActivity(intent);
        }  else if (choseCar.equals("Веста")){
        Intent intent = new Intent(this, LadaVestaActivity.class);
        startActivity(intent);
    }

    }
}
