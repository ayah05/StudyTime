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

public class dog extends AppCompatActivity {
    private ImageButton next;
    private ImageButton home;
    private ImageButton back;
    private TextView animal_1;
    private Button dogt;
    private Button dogw;
    private Button dogw2;
    private ImageButton speaker;
    private TextToSpeech tts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l_dog);

        next = (ImageButton) findViewById(R.id.next);
        home = (ImageButton) findViewById(R.id.home);
        back = (ImageButton) findViewById(R.id.back);
        speaker = (ImageButton) findViewById(R.id.speaker);

        animal_1 = (TextView) findViewById(R.id.animal_1);
        dogt = (Button) findViewById(R.id.dogt);
        dogw = (Button) findViewById(R.id.dogw);
        dogw2 = (Button) findViewById(R.id.dogw2);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhorse();

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
                opencat();
            }
        });
        dogt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendogt();

            }
        });
        dogw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendogw();

            }
        });
        dogw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendogw();

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

    }

    public void openhorse(){
        Intent horsestart = new Intent(this,horse.class);
        startActivity(horsestart);
    }
    public void opencat(){
        Intent catstart = new Intent(this,cat.class);
        startActivity(catstart);
    }


    public void home(){
        Intent intentHome = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(intentHome);
    }

    private void speak(){
        tts.speak("What animal do you see?" +  "Do you see a tiger?" + "Do you see a dog?" + "Or do you see a zebra" ,TextToSpeech.QUEUE_FLUSH,null);
    }
    public void opendogw(){
        Intent dwstart = new Intent(this,dogw.class);
        startActivity(dwstart);
    }
    public void opendogt(){
        Intent dtstart = new Intent(this,dogt.class);
        startActivity(dtstart);
    }

    @Override
    protected void onDestroy() {
        if(tts != null){
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

}

