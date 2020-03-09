package com.example.myvideopleer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    int intPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = findViewById(R.id.videoView);
        String pathToVideoFile = "android.resource://com.example.myvideopleer/" + R.raw.videoplay;
        videoView.setVideoPath(pathToVideoFile);

        if(savedInstanceState != null){
            intPosition = savedInstanceState.getInt("intPosition");
            videoView.seekTo(intPosition);
            videoView.start();
        } else {
            videoView.start();
        }
    }
    @Override
    public void onSaveInstanceState(Bundle outState ) {
        super.onSaveInstanceState(outState);
        intPosition = videoView.getCurrentPosition();
        outState.putInt("intPosition",intPosition);
    }


    @Override
    protected void onResume() {
        super.onResume();
            videoView.seekTo(intPosition);
            videoView.start();
    }


    @Override
    protected void onPause() {
        super.onPause();
        intPosition = videoView.getCurrentPosition();
        videoView.pause();
    }
/*
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "App was DESTROYED", Toast.LENGTH_LONG).show();
    }

 */
}
