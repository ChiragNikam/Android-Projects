package com.example.ch1practiceset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    EditText n1, n2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        printGoodMorning();
//        btn = findViewById(R.id.sum);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                sum();
//            }
//        });
    }
    public void printGoodMorning(){
        txt = findViewById(R.id.text);
        txt.setText("Good Mornig!!");
    }
    public void sum(View view){
        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
        int sum = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
        txt = findViewById(R.id.textView);
        txt.setText("Your sum is: " + sum);
    }
}