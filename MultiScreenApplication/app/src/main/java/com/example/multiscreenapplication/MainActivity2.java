package com.example.multiscreenapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent itnt1 = getIntent();
        String name = itnt1.getStringExtra(MainActivity.EXTRA_NAME);
        txtView = findViewById(R.id.textView);
        txtView.setText("Your name is: " + name);
    }
}