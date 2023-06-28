package com.firstapp.explicitintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        String k = intent.getStringExtra("id");
        String name = intent.getStringExtra("password");

        Toast.makeText(this,k+" : "+name,Toast.LENGTH_LONG).show();

    }
}