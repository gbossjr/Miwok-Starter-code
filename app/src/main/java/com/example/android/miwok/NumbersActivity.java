package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String [] numbers = new String[10];
        numbers[0] = "One";
        numbers[1] = "Two";
        numbers[2] = "Three";
        numbers[3] = "Four";
        numbers[4] = "Five";
        numbers[5] = "Six";
        numbers[6] = "Seven";
        numbers[7] = "Eight";
        numbers[8] = "Nine";
        numbers[9] = "Ten";

    }
}
