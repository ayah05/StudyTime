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

public class horse extends AppCompatActivity {
    private ImageButton next;
    private ImageButton home;
    private ImageButton back;
    private TextView animal_1;
    private Button horset;
    private Button horsew;
    private Button horsew2;
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
        horset = (Button) findViewById(R.id.horset);
        horsew = (Button) findViewById(R.id.horsew);
        horsew2 = (Button) findViewById(R.id.horsew2);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbird();

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
                opendog();
            }
        });
        horset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhorset();

            }
        });
        horsew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhorsew();

            }
        });
        horsew2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhorsew();

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
    public void openbird(){
        Intent birdstart = new Intent(this,bird.class);
        startActivity(birdstart);
    }

    public void home(){
        Intent intentHome = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(intentHome);
    }

    private void speak(){
        tts.speak("What animal do you see?" +  "Do you see a horse?" + "Do you see a giraffe?" + "Or do you see a cheetah" ,TextToSpeech.QUEUE_FLUSH,null);
    }
    public void openhorsew(){
        Intent hwstart = new Intent(this,horsew.class);
        startActivity(hwstart);
    }
    public void openhorset(){
        Intent htstart = new Intent(this,horset.class);
        startActivity(htstart);
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

