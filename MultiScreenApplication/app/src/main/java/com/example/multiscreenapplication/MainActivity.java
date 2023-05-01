package com.example.multiscreenapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
//    Button btn;
    EditText txtName;
    public static final String EXTRA_NAME = "androidx.appcompat.app.AppCompatActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActiviy(View view){
        txtName = findViewById(R.id.txtName);
        String name = txtName.getText().toString();

        Toast.makeText(this, "Directing to next activiety", Toast.LENGTH_SHORT).show();
        // telling on which screen to move after clicking the button.
        Intent itnt = new Intent(this, MainActivity2.class);
        // this will send the data to the another screen with a unique key
        itnt.putExtra(EXTRA_NAME, name);
        // this will direct to next page.
        startActivity(itnt);
    }
}