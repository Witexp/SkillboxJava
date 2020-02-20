package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView msgTextView,myName, myGroup;
    EditText msgEditText;
    Spinner spinGroup, spinName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickSendMsg(View view){
        msgTextView = findViewById(R.id.myMsg);
        msgEditText = findViewById(R.id.myEnterMsg);
        String msg = msgEditText.getText().toString();
        msgTextView.setText(msg);

        myName = findViewById(R.id.myName);
        spinName = findViewById(R.id.mySpinnerName);
        String name = spinName.getSelectedItem().toString();
        myName.setText(name);

        myGroup = findViewById(R.id.myGroup);
        spinGroup = findViewById(R.id.mySpinnerGroup);
        String group = spinGroup.getSelectedItem().toString();
        myGroup.setText(group);
    }
}
