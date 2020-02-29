package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PhoneIntentExample extends AppCompatActivity {

    private static final int CODEFORSECONDACTIVITY = 1;
    private static final int CODEFORGROUPACTIVITY = 2;

    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textViewGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textViewGroup = findViewById(R.id.textViewGroup);

    }

    public void onClick(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivityForResult(intent,CODEFORSECONDACTIVITY);
    }
    public void onClickGroup(View view) {
        Intent intentGroup = new Intent(this,ActivityGroup.class);
        startActivityForResult(intentGroup,CODEFORGROUPACTIVITY);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CODEFORSECONDACTIVITY) {
            if (resultCode == RESULT_CANCELED){
                textView.setText(null);
                textView2.setText(null);
                textView3.setText(data.getStringExtra("key"));
                textView3.setTextColor(Color.parseColor("#FF0000"));
            }
            if(resultCode == RESULT_OK){
                textView.setText(data.getStringExtra("key1"));
                textView.setTextColor(Color.parseColor("#8A2BE2"));
                textView2.setText(data.getStringExtra("key2"));
                textView2.setTextColor(Color.parseColor("#8A2BE2"));
                textView3.setText(data.getStringExtra("key3"));
                textView3.setTextColor(Color.parseColor("#8A2BE2"));
            }
        }
        if (requestCode == CODEFORGROUPACTIVITY) {
            if(resultCode == RESULT_OK){
                textViewGroup.setText(data.getStringExtra("key5"));
                //textView2.setTextColor(Color.parseColor("#008000"));
            }
        }
    }


}
