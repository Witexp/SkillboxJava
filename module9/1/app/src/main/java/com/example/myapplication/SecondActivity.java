package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText  editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    public void onOpenThreeActivity(View view) {
        Intent openThreeActivityIntent = new Intent(this, ThreeActivity.class);
        editText = findViewById(R.id.editText);
        String editTextMsg = editText.getText().toString();
        openThreeActivityIntent.putExtra("twoSecondActivity",editTextMsg);
        startActivity(openThreeActivityIntent);

    }
}
