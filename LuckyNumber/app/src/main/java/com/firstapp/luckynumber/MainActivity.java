package com.firstapp.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView welcomeText; // no need as this is constant text.
    EditText usernameText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeText = findViewById(R.id.textview1);
        usernameText = findViewById(R.id.editText1);
        btn = findViewById(R.id.btn1);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameText.getText().toString();

                // Explicit intent.
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);


                // passing the username to second activity...
                i.putExtra("username",username);
                startActivity(i);
            }
        });
    }
}