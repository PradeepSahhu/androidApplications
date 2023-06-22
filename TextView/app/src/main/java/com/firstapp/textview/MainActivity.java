package com.firstapp.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button button1;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editText1);
        String input_text = et.getText().toString();

        button1 = findViewById(R.id.button1);


        // Handling the click events
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // The actions to perform when the button is clicked
                Toast.makeText(MainActivity.this, "The button is clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}