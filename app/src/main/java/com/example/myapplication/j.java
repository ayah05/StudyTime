package com.example.myapplication;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Locale;

public class j extends AppCompatActivity {
    private ImageButton next;
    private ImageButton home;
    private ImageButton back;
    private ImageButton speaker;
    private TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_j);

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
                openActivityK();
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
        tts.speak("This is a J. J like jam, jacket, jeans and jellyfish.",TextToSpeech.QUEUE_FLUSH,null);
    }

    @Override
    protected void onDestroy() {
        if(tts != null){
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }
    public void openActivityK(){
        Intent intentK = new Intent(getApplicationContext(), k.class);
        startActivity(intentK);
    }
    public void getBack(){
        Intent intent = new Intent(getApplicationContext(), i.class);
        startActivity(intent);
    }
    public void home(){
        Intent intentHome = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(intentHome);
    }

}