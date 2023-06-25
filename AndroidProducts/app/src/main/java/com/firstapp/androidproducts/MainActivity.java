package com.firstapp.androidproducts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.map);
        btn2 = findViewById(R.id.mail);
        btn3 = findViewById(R.id.drive);
        btn4 = findViewById(R.id.youtube);
        btn5 = findViewById(R.id.search);
        btn6 = findViewById(R.id.more);
        btn7 = findViewById(R.id.nextApplication);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(Intent.ACTION_VIEW);
                i1.setData(Uri.parse("https://www.google.com/maps"));
                startActivity(i1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(Intent.ACTION_VIEW);
                i1.setData(Uri.parse("https://mail.google.com/mail/u/1/#inbox"));
                startActivity(i1);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(Intent.ACTION_VIEW);
                i1.setData(Uri.parse("https://drive.google.com/drive/u/1/my-drive"));
                startActivity(i1);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(Intent.ACTION_VIEW);
                i1.setData(Uri.parse("https://www.youtube.com/"));
                startActivity(i1);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(Intent.ACTION_VIEW);
                i1.setData(Uri.parse("https://www.google.com/"));
                startActivity(i1);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW);

                i1.setData(Uri.parse("https://about.google/intl/ALL_in/products/#panel-1"));
                startActivity(i1);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(),Activity2.class);
                startActivity(i1);

            }
        });


    }

}