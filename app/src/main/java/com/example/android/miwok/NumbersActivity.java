package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");
        numbers.add("Five");
        numbers.add("Six");
        numbers.add("Seven");
        numbers.add("Eight");
        numbers.add("Nine");
        numbers.add("Ten");


        for (int index = 0; index <numbers.size(); index ++){
            ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbers);
            ListView listView = (ListView) findViewById(R.id.list);
            listView.setAdapter(itemsAdapter);;

        }
    }
}
