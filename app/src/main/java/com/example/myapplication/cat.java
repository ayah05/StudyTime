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

public class cat extends AppCompatActivity {
    private ImageButton next;
    private ImageButton home;
    private ImageButton back;
    private TextView animal_1;
    private Button CAT;
    private Button CAT_W;
    private Button cat_w2;
    private ImageButton speaker;
    private TextToSpeech tts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);

        next = (ImageButton) findViewById(R.id.next);
        home = (ImageButton) findViewById(R.id.home);
        back = (ImageButton) findViewById(R.id.back);
        speaker = (ImageButton) findViewById(R.id.speaker);

        animal_1 = (TextView) findViewById(R.id.animal_1);
        CAT = (Button) findViewById(R.id.deerw2);
        CAT_W = (Button) findViewById(R.id.dogt);
        cat_w2 = (Button) findViewById(R.id.elephantt);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendog();

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
                home();
            }
        });
        CAT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catt();

            }
        });
        CAT_W.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catw();

            }
        });
        cat_w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catw();

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

    public void opendog(){
        Intent dogstart = new Intent(this,dog.class);
        startActivity(dogstart);
    }

    public void home(){
        Intent intentHome = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(intentHome);
    }

    private void speak(){
        tts.speak("What animal do you see?" +  "Do you see a dog?" + "Do you see a cat?" + "Or do you see a bird" ,TextToSpeech.QUEUE_FLUSH,null);
    }
    public void catw(){
        Intent cwstart = new Intent(this,cat_w.class);
        startActivity(cwstart);
    }
    public void catt(){
        Intent ctstart = new Intent(this,cat_t.class);
        startActivity(ctstart);
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

