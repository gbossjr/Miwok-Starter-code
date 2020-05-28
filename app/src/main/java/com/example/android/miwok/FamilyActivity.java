package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class  FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Family> family= new ArrayList<Family>();
        family.add(new Family("Father", "әpә"));
        family.add(new Family("Father", "әpә"));
        family.add(new Family("Father", "әpә"));
        family.add(new Family("Father", "әpә"));
        family.add(new Family("Father", "әpә"));
        family.add(new Family("Father", "әpә"));
        family.add(new Family("Father", "әpә"));
        family.add(new Family("Father", "әpә"));
        family.add(new Family("Father", "әpә"));
        family.add(new Family("Father", "әpә"));


        for (int index = 0; index <family.size(); index ++){
            FamilyAdapter adapter = new FamilyAdapter(this, family);
            ListView listView = findViewById(R.id.listFamily);
            listView.setAdapter(adapter);;

        }

    }



}
