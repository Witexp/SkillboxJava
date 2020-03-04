package com.example.elvis;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer1,mediaPlayer2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        mediaPlayer1 = MediaPlayer.create(this,R.raw.elvis_tutty_frutty);
        mediaPlayer2 = MediaPlayer.create(this,R.raw.rock_n_roll);
    }
    public void onClickNext(View view) {
        if(mediaPlayer1.isPlaying()) {
            textView.setText("Elvis Rocknroll is playing");
            mediaPlayer1.pause();
            mediaPlayer2.start();
        } else if (mediaPlayer2.isPlaying()) {
            textView.setText("Elvis Tutty Frutty is playing");
            mediaPlayer2.pause();
            mediaPlayer1.start();
        }
    }

    public void onClickStart(View view) {
        textView.setText("Elvis Tutty Frutty is playing");
        mediaPlayer1.start();
    }
}
