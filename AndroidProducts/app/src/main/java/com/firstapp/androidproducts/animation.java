package com.firstapp.androidproducts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class animation extends AppCompatActivity {

    TextView textView;
    LottieAnimationView lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        textView = findViewById(R.id.text1);
        lottie = findViewById(R.id.animationView);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                textView.animate().translationY(-1000).setDuration(1000).setDuration(1000);
                lottie.animate().translationX(0).setDuration(2000).setDuration(2900);
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        },3000);



    }

    @Override
    protected void onRestart() {
        super.onRestart();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                textView.animate().translationY(-1000).setDuration(1000).setDuration(1000);
                lottie.animate().translationX(10).setDuration(2000).setDuration(2900);
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        },1000);

    }
}