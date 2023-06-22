package com.firstapp.thecounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;





public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView welcome_text, Counter_View;
    int Counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Counter_View = findViewById(R.id.textView1);
        btn = findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Counter_View.setText(""+incrementCounter());

            }
        });
    }
    public int incrementCounter(){
        return ++Counter;
    }



}