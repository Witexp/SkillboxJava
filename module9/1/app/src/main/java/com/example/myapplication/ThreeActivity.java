package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        Intent gettingIntent = getIntent();
        String getTextFromSecondActivity = gettingIntent.getStringExtra("twoSecondActivity");
        TextView textView = findViewById(R.id.newTextView);
        int num = Integer.parseInt(getTextFromSecondActivity);
        if (num > 100)
            textView.setText("Your number so big");
        else if (num < 100)
            textView.setText("Your number so small");
        else
            textView.setText("My congratulations!");
    }
}
