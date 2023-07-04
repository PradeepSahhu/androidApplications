package com.firstapp.checkbox;
import android.app.Dialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TimePicker;

import android.app.TimePickerDialog;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class TimePickerFragment extends DialogFragment

    implements TimePickerDialog.OnTimeSetListener{


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        return new TimePickerDialog(
                getActivity(),
                this,
                hour,
                minute,
               true);
    }



    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1){

        Toast.makeText(getActivity(),"Time pickeet sucessfully",Toast.LENGTH_LONG).show();
    }
}






