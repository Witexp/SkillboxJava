package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityGroup extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        editText = findViewById(R.id.editTextGroup);
    }

    public void onConfirmGroup(View view) {
        Intent intentToGroup = new Intent();
        intentToGroup.putExtra("key5",editText.getText().toString());
        setResult(RESULT_OK,intentToGroup);
        this.finish();
    }
}
