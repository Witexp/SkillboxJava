package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        if (editTextMsg.equals("")) {
            Toast toast = Toast.makeText (this,"Введите данные в поле",Toast.LENGTH_LONG);
            toast.show();
        } else {
            openThreeActivityIntent.putExtra("twoSecondActivity", editTextMsg);
            startActivity(openThreeActivityIntent);
        }

    }
}
