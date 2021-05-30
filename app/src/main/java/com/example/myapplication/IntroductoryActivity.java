package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;

public class IntroductoryActivity extends AppCompatActivity
{
    private ImageView logo,bg;
    private TextView appName;
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);

        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.appName);
        bg = findViewById(R.id.background);

        logo.animate().translationY(-2000).setDuration(1000).setStartDelay(3000);
        appName.animate().translationY(1400).setDuration(1000).setStartDelay(3000);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(IntroductoryActivity.this, MainActivity.class));
            }
        }, 4350);

        //hallo daniela du bist die allerbeste, best regards your fips

    }
}