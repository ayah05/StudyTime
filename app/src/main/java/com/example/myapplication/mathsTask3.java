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

public class mathsTask3 extends AppCompatActivity {
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
        setContentView(R.layout.activity_maths_task3);

        next = (ImageButton) findViewById(R.id.next);
        home = (ImageButton) findViewById(R.id.home);
        back = (ImageButton) findViewById(R.id.back);

        textViewTask = (TextView) findViewById(R.id.textViewTask);
        answer1Btn = (Button) findViewById(R.id.answer1Btn);
        answer2Btn = (Button) findViewById(R.id.answer2Btn);
        answer3Btn = (Button) findViewById(R.id.answer3Btn);
        answer4Btn = (Button) findViewById(R.id.answer4Btn);
        speaker = (ImageButton) findViewById(R.id.speaker);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTask2();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTask4();
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
                openTask17();
            }
        });

        answer1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTask17();
            }
        });

        answer3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTask17();
            }
        });

        answer4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTask18();
            }
        });

    }

    public void home(){
        Intent intentHome = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(intentHome);
    }

    public void openTask2(){
        Intent intentTask2 = new Intent(this,mathsTask2.class);
        startActivity(intentTask2);
    }

    public void openTask4(){
        Intent intentTask4 = new Intent(this, mathsTaks4.class);
        startActivity(intentTask4);
    }

    private void speak(){
        tts.speak("What is five plus three?" +  "  " + "7" + "or 9" + "or 6" + "or 8",TextToSpeech.QUEUE_FLUSH,null);
    }

    @Override
    protected void onDestroy() {
        if(tts != null){
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    public void openTask17(){
        Intent intentTask17 = new Intent(this,mathsTask17.class);
        startActivity(intentTask17);
    }

    public void openTask18(){
        Intent intentTask18 = new Intent(this,mathsTask18.class);
        startActivity(intentTask18);
    }
}

