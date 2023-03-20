package com.example.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvInfo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvInfo = findViewById(R.id.tvInfo);

        Intent fromMain = getIntent();
        String name = fromMain.getStringExtra("Name");
        int rollNo = fromMain.getIntExtra("Roll No", 0);
        String title = fromMain.getStringExtra("title");

        tvInfo.setText("Name: " + name + " Roll No: " + rollNo);
        getSupportActionBar().setTitle(title);


    }
}