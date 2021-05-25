package com.example.myapplication;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Locale;

public class u extends AppCompatActivity {
    private ImageButton home;
    private ImageButton next;
    private ImageButton back;
    private ImageButton speaker;
    private TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u);
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
                openActivityV();
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
        tts.speak("This is a U. U like unicorn, unhappy, umbrella and underwear.",TextToSpeech.QUEUE_FLUSH,null);
    }

    @Override
    protected void onDestroy() {
        if(tts != null){
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }
    public void openActivityV(){
        Intent intentV = new Intent(getApplicationContext(), v.class);
        startActivity(intentV);
    }
    public void getBack(){
        Intent intent = new Intent(getApplicationContext(), t.class);
        startActivity(intent);
    }
    public void home(){
        Intent intentHome = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(intentHome);
    }
}