package com.firstapp.greetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Step 2 : Declaring views

    TextView textView;
    Button button;
    EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.TextView1);
        editText = findViewById(R.id.EditText1);
        button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                String back = name.toUpperCase();
                // Display the name
                if(back.equals("MANISH")){
                    Toast.makeText(MainActivity.this, name+" ne Soyam ko choda", Toast.LENGTH_LONG).show();
                }else if(back.equals("SOYAM")){
                    Toast.makeText(MainActivity.this, "baba re baba "+name+" ke gaand fati galo re...", Toast.LENGTH_LONG).show();
                }else if(back.equals("ASHUTOSH")){
                    Toast.makeText(MainActivity.this, " kon choda? "+name+" Chodi...", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, name+" is Good Boy", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}