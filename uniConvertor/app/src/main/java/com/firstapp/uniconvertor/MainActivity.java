package com.firstapp.uniconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome_text;
    TextView result_text;
    EditText editText;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    welcome_text = findViewById(R.id.textView1);
    result_text = findViewById(R.id.textView2);
    editText = findViewById(R.id.editText1);
    btn = findViewById(R.id.btn1);

    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

//            This is one method which is direct method
//            double number = Double.parseDouble(editText.getText().toString());
////            String userInput = editText.getText().toString(); // this is useful only when we want string values.
//            double pounds = number * 2.20462;

//            Now through the functions.

            double kilos = Double.parseDouble(editText.getText().toString());
            double pounds = ConvertkilosToPounds(kilos);
//            result_text.setText(String.valueOf(pounds));
            result_text.setText(""+pounds+" lb");
        }
    });




    }

    public double ConvertkilosToPounds(double kilos){
        return kilos*2.20462;
    }



}