package com.example.datepicker;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.app.DatePickerDialog;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
EditText date;
DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        date=findViewById(R.id.editText1);
        final Calendar c=Calendar.getInstance();
        final int mYear=c.get(Calendar.YEAR);
        final int mMonth=c.get(Calendar.MONTH);
        final int mDAy=c.get(Calendar.DAY_OF_MONTH);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            datePickerDialog=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    date.setText(dayOfMonth+"/" +(monthOfYear+1)+"/"+year );
                }
            },mYear,mMonth,mDAy);
            datePickerDialog.show();
            }
        });
    }
}
