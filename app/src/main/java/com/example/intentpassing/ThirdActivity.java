package com.example.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        listView = findViewById(R.id.listView);

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


    }
}