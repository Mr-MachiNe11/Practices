package com.example.intentpassing;

import static com.example.intentpassing.R.raw.contact_info;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SecondActivity extends AppCompatActivity {

    TextView tvInfo;
    Button btnChange;
    LottieAnimationView animationView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvInfo = findViewById(R.id.tvInfo);
        btnChange = findViewById(R.id.btnChange);
        animationView = findViewById(R.id.animationView);

        Intent fromMain = getIntent();
        String name = fromMain.getStringExtra("Name");
        int rollNo = fromMain.getIntExtra("Roll No", 0);
        String title = fromMain.getStringExtra("title");

        tvInfo.setText("Name: " + name + " Roll No: " + rollNo);
        getSupportActionBar().setTitle(title);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(SecondActivity.this, R.anim.alpha_scale);
                tvInfo.startAnimation(animation);

                animationView.setAnimation(R.raw.contact_info);

            }
        });


    }
}