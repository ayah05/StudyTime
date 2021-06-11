package com.example.myapplication;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Locale;

public class z extends AppCompatActivity {
    private ImageButton home;
    private ImageButton next;
    private ImageButton back;
    private ImageButton speaker;
    private TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_z);
        next = (ImageButton)findViewById(R.id.next);
        home = (ImageButton)findViewById(R.id.home);
        back = (ImageButton)findViewById(R.id.back);
        speaker = (ImageButton)findViewById(R.id.speaker);


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
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityQuiz();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getBack();
            }
        });
    }
    private void speak(){
        tts.speak("This is a Z. Z like zebra, zipper, zucchini and zoo.",TextToSpeech.QUEUE_FLUSH,null);
    }

    @Override
    protected void onDestroy() {
        if(tts != null){
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }
    public void openActivityQuiz(){
        Intent intentQuiz = new Intent(getApplicationContext(), quiz_a.class);
        startActivity(intentQuiz);
    }
    public void getBack(){
        Intent intent = new Intent(getApplicationContext(), y.class);
        startActivity(intent);
    }
    public void home(){
        Intent intentHome = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(intentHome);
    }
}