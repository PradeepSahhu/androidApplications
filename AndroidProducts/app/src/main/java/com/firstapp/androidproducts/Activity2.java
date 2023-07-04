package com.firstapp.androidproducts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class Activity2 extends AppCompatActivity {


    Button linkedin, github, w3school;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Toast.makeText(this,"This page is underdevelopement",Toast.LENGTH_LONG).show();

        linkedin = findViewById(R.id.linkedin);
        github = findViewById(R.id.github);
        w3school = findViewById(R.id.school);


        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.linkedin.com/feed/"));
                startActivity(i);
            }
        });


        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://github.com/PradeepSahhu?tab=repositories"));
                startActivity(i);
            }
        });
        w3school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.w3schools.com/"));
                startActivity(i);
            }
        });
    }
}