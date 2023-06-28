package com.firstapp.resources;


// Creating a Menu...

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // kotlin
       // val color : Int = resources.getColor(R.color.purple_200);



        // java
//        Resources res = getResources();
//        int color_purple = res.getColor(R.color.bluish_green);





    }


    // Java;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.menuu_rando,menu);
        return true;


    }


    // kotlin...


//    override fun onCreateOptionMenu(menu:Menu):Boolean{
//        menuInflater.inflate(R.menu.menuu_rando,menu)
//                return true;
//    }
}