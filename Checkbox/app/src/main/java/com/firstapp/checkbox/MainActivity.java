package com.firstapp.checkbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {

    CheckBox chk1, chk2;
    Button btn1, btn2,btn3;

    RadioGroup radioGroup;

    Spinner spinner;
//    TimePicker timePicker;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        chk1 = findViewById(R.id.checkbox1);
        chk2 = findViewById(R.id.checkbox2);
        btn1 = findViewById(R.id.btn1);




        // Radiogroup.- RAdio buttons.

radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                Toast.makeText(MainActivity.this,"selected "+radioButton.getText(),Toast.LENGTH_LONG).show();
            }
        });


        // spinner... --> 1.  Data set / data source , 2. adapters, 3. spinner itself.

//        3. spinner itself.
        spinner = findViewById(R.id.spinner);

//        1. Data source / data set

        String [] courses = {"c++", "java","kotlin","Data Structures"};


//        2 Adapters(ad) - to connect data source with spinners.

        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item,courses);

        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(ad);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"you select : "+ courses[position],Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

//        timePicker = findViewById(R.id.timepicker);
//        timePicker.setIs24HourView(true);

        // setting selected time


        // New time picker. -- most optimised approach and best way...

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Display the time picker.
                DialogFragment timePickerFrag = new TimePickerFragment();

                timePickerFrag.show(getSupportFragmentManager(),"Pick Time now");
            }
        });


        // Date Picker... -- most optimised day

        btn3 = findViewById(R.id.button);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment dialogFragment = new DatePickerFragment();
                dialogFragment.show(
                        getSupportFragmentManager(),
                        "Pick a Date"
                );
            }
        });




        // Progress Bar.

        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(75); // accepts int as parameter. it set the progress bar.
//        progressBar.incrementProgressBy(); // accepts int as parameter. it increases the progress by that int percentage.
        // by default it is full when it is set to 100%.




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                String CurrentTime = "Time: "+timePicker.getHour()+" : "+timePicker.getMinute();
//                Toast.makeText(getApplicationContext(),"Current Time is "+CurrentTime,Toast.LENGTH_LONG).show();


                // Increase progress by 10%.
                progressBar.incrementProgressBy(10); // it increases the progress by 10%.

                if(chk1.isChecked()){
                    Toast.makeText(MainActivity.this,"Tomato has been added",Toast.LENGTH_LONG).show();
                }else{

                }


                if(chk2.isChecked()){
                    Toast.makeText(MainActivity.this,"Cheese has been added",Toast.LENGTH_LONG).show();
                }else{

                }
            }
        });
    }
}