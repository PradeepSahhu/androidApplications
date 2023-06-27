package com.firstapp.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
// import java.lang.Math; // for generating random number.
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    TextView luckyNumberText;
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        textView = findViewById(R.id.luckyNumbertext);
        luckyNumberText = findViewById(R.id.lucky_number);
        share = findViewById(R.id.share);


        // getting username from the previous activity...
        Intent intent = getIntent();

        String username = intent.getStringExtra("username");

        luckyNumberText.setText(" "+username+"\nlucky number is");






        // Generating the random number between 0 and 100.

        int randomNumber = generateRandomNumber();
//        textView.setText(username+" lucky Number is \n"+randomNumber);
        textView.setText(randomNumber+"");


        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareContent(username,randomNumber);
            }
        });





//
    }


    // to share result to other platforms.
    public void shareContent(String username, int randomNumber){

        // Implicit intent.
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");

        // convert the random number to string...
        String randomNum = String.valueOf(randomNumber);

        i.putExtra(Intent.EXTRA_SUBJECT,username + " is very lucky today");
        i.putExtra(Intent.EXTRA_TEXT, username+ "'s lucky number is: " + randomNum);
        startActivity(Intent.createChooser(i,"choose a platform"));

    }


    // Function to generate Random number...
    public int generateRandomNumber(){
        Random random = new Random(); // through random class.
        int upper_limit =1001;
        int randomNumbers = random.nextInt(upper_limit);

//        int randomNumber = (int)(Math.random()*1001);
        return randomNumbers;
    }
}