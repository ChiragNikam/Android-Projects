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
    }
    public void convertToPound(View view){
//      return type of getText function is 'Editable'. That is why we have to convert it 1'st into String.
        try{    // Handling exception if user click's CONVERT button without entering the value.
            String s = edtTxt.getText().toString();
            float kg = Float.parseFloat(s);
            double pound = 2.205 * kg;
            txtView.setText("Weight in pound is : " + pound);
        }
        catch (Exception e){
            Toast.makeText(this, "Enter a value to convert. || Exception Occured!!", Toast.LENGTH_SHORT).show();
        }
    }
}