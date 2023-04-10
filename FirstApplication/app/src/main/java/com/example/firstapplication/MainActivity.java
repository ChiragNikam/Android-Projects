package com.example.firstapplication;
import  java.util.Scanner;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button btn;
    public TextView txtView;
    public EditText edtTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        txtView = findViewById(R.id.textView);
        edtTxt = findViewById(R.id.enterKg);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // return type of getText function is 'Editable'. That is why we have to convert it 1'st into String.
                String s = edtTxt.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.205 * kg;
                txtView.setText("Weight in pound is : " + pound);
//                Toast.makeText(MainActivity.this, "Hi! Click listner worked.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}