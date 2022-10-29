package com.example.pm1_tarea11;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;

public class p2_activity extends AppCompatActivity {
    EditText tresul;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p2_activity;


        tresul = (EditText) findViewById(R.id.txresultado);



        tresul.setText(getIntent().getExtras().getString("resultado"));


    }
}