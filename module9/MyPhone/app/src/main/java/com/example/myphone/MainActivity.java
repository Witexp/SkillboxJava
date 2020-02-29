package com.example.myphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPhone = findViewById(R.id.editTextPhone);
    }

    public void onSend(View view) {
        Intent intentSend = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + editTextPhone.getText().toString()));
        startActivity(intentSend);
    }

    public void onAuthor(View view) {
        Intent intentAuthor = new Intent(this,ActivityAuthor.class);
        intentAuthor.putExtra("name","Матвеев Виталий Сергеевич");
        intentAuthor.putExtra("index","428023");
        intentAuthor.putExtra("country","Россия");
        intentAuthor.putExtra("city","Чебоксары");
        startActivity(intentAuthor);
    }
}
