package com.example.ladaresourceexmple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    static {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
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
