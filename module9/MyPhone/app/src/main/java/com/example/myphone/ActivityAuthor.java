package com.example.myphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityAuthor extends AppCompatActivity {
    TextView tvName,tvIndex,tvCountry,tvCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);

        tvName = findViewById(R.id.tvName);
        tvIndex = findViewById(R.id.tvIndex);
        tvCountry = findViewById(R.id.tvCountry);
        tvCity = findViewById(R.id.tvCity);

        Intent intent = getIntent();
        tvName.setText(intent.getStringExtra("name"));
        tvIndex.setText(intent.getStringExtra("index"));
        tvCountry.setText(intent.getStringExtra("country"));
        tvCity.setText(intent.getStringExtra("city"));
    }

    public void onSiteAuthor(View view) {
        Intent intentSite = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Witexp/SkillboxJava"));
        startActivity(intentSite);
    }
}
