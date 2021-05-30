package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Locale;

public class mathsTask8 extends AppCompatActivity {
    private ImageButton next;
    private ImageButton home;
    private ImageButton back;
    private TextView textViewTask;
    private Button answer1Btn;
    private Button answer2Btn;
    private Button answer3Btn;
    private Button answer4Btn;
    private ImageButton speaker;
    private TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_task8);

        next = (ImageButton) findViewById(R.id.next);
        home = (ImageButton) findViewById(R.id.home);
        back = (ImageButton) findViewById(R.id.back);
        speaker = (ImageButton) findViewById(R.id.speaker);

        textViewTask = (TextView) findViewById(R.id.textViewTask);
        answer1Btn = (Button) findViewById(R.id.answer1Btn);
        answer2Btn = (Button) findViewById(R.id.answer2Btn);
        answer3Btn = (Button) findViewById(R.id.answer3Btn);
        answer4Btn = (Button) findViewById(R.id.answer4Btn);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTask7();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTask9();
            }
        });

        tts =  new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS){
                    int language =  tts.setLanguage(Locale.ENGLISH);
                    speaker.setEnabled(true);
                }
            }
        });

        speaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }
        });

        answer2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTask27();
            }
        });

        answer1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTask28();
            }
        });

        answer3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTask27();
            }
        });

        answer4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTask27();
            }
        });
    }

    public void home(){
        Intent intentHome = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(intentHome);
    }

    public void openTask7(){
        Intent intentTask7 = new Intent(this,mathsTask7.class);
        startActivity(intentTask7);
    }

    public void openTask9(){
        Intent intentTask9 = new Intent(this, mathsTask9.class);
        startActivity(intentTask9);
    }

    private void speak(){
        tts.speak("What is 5 - 4 ?" +  "  " + "1" + "or 4" + "or 2" + "or 0",TextToSpeech.QUEUE_FLUSH,null);
    }

    @Override
    protected void onDestroy() {
        if(tts != null){
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    public void openTask28(){
        Intent intentTask28 = new Intent(this,mathsTask28.class);
        startActivity(intentTask28);
    }

    public void openTask27(){
        Intent intentTask27 = new Intent(this, mathsTask27.class);
        startActivity(intentTask27);
    }
}