package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Locale;

public class foxw extends AppCompatActivity {
    private ImageButton next;
    private ImageButton home;
    private ImageButton back;
    private TextView animal_1;
    private ImageButton speaker;
    private TextToSpeech tts;
    private TextView wrong1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_wrong);

        next = (ImageButton) findViewById(R.id.next);
        home = (ImageButton) findViewById(R.id.home);
        back = (ImageButton) findViewById(R.id.back);
        speaker = (ImageButton) findViewById(R.id.speaker);
        animal_1 = (TextView) findViewById(R.id.animal_1);
        wrong1 = (TextView) findViewById(R.id.true1);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengiraffe();

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
                opendeer();
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

    public void opencat(){
        Intent catstart = new Intent(this,cat.class);
        startActivity(catstart);
    }
    public void openhorse(){
        Intent horsestart = new Intent(this,horse.class);
        startActivity(horsestart);
    }
    public void home(){
        Intent intentHome = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(intentHome);
    }
    public void openbird(){
        Intent birdstart = new Intent(this,bird.class);
        startActivity(birdstart);
    }
    public void openrabbit(){
        Intent rabbitstart = new Intent(this,rabbit.class);
        startActivity(rabbitstart);
    }
    public void openfish(){
        Intent fishstart = new Intent(this,fish.class);
        startActivity(fishstart);
    }
    public void openelephant(){
        Intent elephantstart = new Intent(this,elephant.class);
        startActivity(elephantstart);
    }
    public void openhedgehog(){
        Intent hedgehogstart = new Intent(this,hedgehog.class);
        startActivity(hedgehogstart);
    }
    public void openchicken(){
        Intent chickenstart = new Intent(this,chicken.class);
        startActivity(chickenstart);
    }
    public void openhamster(){
        Intent hamsterstart = new Intent(this,hamster.class);
        startActivity(hamsterstart);
    }
    public void opendeer(){
        Intent deerstart = new Intent(this,deer.class);
        startActivity(deerstart);
    }
    public void openfox(){
        Intent foxstart = new Intent(this,fox.class);
        startActivity(foxstart);
    }
    public void opengiraffe(){
        Intent giraffestart = new Intent(this,giraffe.class);
        startActivity(giraffestart);
    }
    public void openladybug(){
        Intent ladybugstart = new Intent(this,ladybugs.class);
        startActivity(ladybugstart);
    }
    public void openmonkey(){
        Intent monkeystart = new Intent(this,monkey.class);
        startActivity(monkeystart);
    }
    public void openlion(){
        Intent lionstart = new Intent(this,lion.class);
        startActivity(lionstart);
    }
    public void openmouse(){
        Intent mousestart = new Intent(this,mouse.class);
        startActivity(mousestart);
    }
    public void opentiger(){
        Intent tigerstart = new Intent(this,tiger.class);
        startActivity(tigerstart);
    }
    private void speak(){
        tts.speak("Oh no! This answer is wrong. Please try again!" ,TextToSpeech.QUEUE_FLUSH,null);
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

