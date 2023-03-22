package com.example.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {

    ListView listView;
    Spinner spinner;
    AutoCompleteTextView acTxtView;
    ArrayList<String> arrNames = new ArrayList<>();
    ArrayList<String> arrIds = new ArrayList<>();
    ArrayList<String> arrLang = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        listView = findViewById(R.id.listView);
        spinner = findViewById(R.id.spinner);
        acTxtView = findViewById(R.id.acTxtView);

        Intent fromSecond = getIntent();
        String title = fromSecond.getStringExtra("title");
        getSupportActionBar().setTitle(title);

        arrNames.add("Abu Z");
        arrNames.add("Umm Z");
        arrNames.add("63");
        arrNames.add("rr");
        arrNames.add("Zulaibeeb");
        arrNames.add("Abu Z");
        arrNames.add("Umm Z");
        arrNames.add("63");
        arrNames.add("rr");
        arrNames.add("Zulaibeeb");
        arrNames.add("Abu Z");
        arrNames.add("Umm Z");
        arrNames.add("63");
        arrNames.add("rr");
        arrNames.add("Zulaibeeb");
        arrNames.add("Abu Z");
        arrNames.add("Umm Z");
        arrNames.add("63");
        arrNames.add("rr");
        arrNames.add("Zulaibeeb");
        arrNames.add("Abu Z");
        arrNames.add("Umm Z");
        arrNames.add("63");
        arrNames.add("rr");
        arrNames.add("Zulaibeeb");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(ThirdActivity.this, android.R.layout.simple_list_item_1, arrNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(ThirdActivity.this, "Action Performed Successfully!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //spinner

        arrIds.add("Birth Certificate");
        arrIds.add("National Id");
        arrIds.add("Driving License");
        arrIds.add("Passport");
        arrIds.add("Student Card");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(ThirdActivity.this, android.R.layout.simple_spinner_dropdown_item, arrIds);
        spinner.setAdapter(spinnerAdapter);

        //autoCompleteTextView

        arrLang.add("C");
        arrLang.add("C++");
        arrLang.add("Java");
        arrLang.add("Python");
        arrLang.add("C#");
        arrLang.add("JavaScript");
        arrLang.add("Kotlin");
        arrLang.add("Flutter");

        ArrayAdapter<String> acAdapter = new ArrayAdapter<>(ThirdActivity.this, android.R.layout.simple_list_item_1, arrLang);
        acTxtView.setAdapter(acAdapter);
        acTxtView.setThreshold(1);


    }
}