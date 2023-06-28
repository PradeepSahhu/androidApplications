package com.firstapp.explicitintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // Explicit intent.

                Intent i = new Intent(getApplicationContext(), MainActivity2.class);


                // Second data between activities.
                i.putExtra("id","22BCS10284");
                i.putExtra("password","Pradeep@2002");

                startActivity(i);
            }
        });
    }


}