package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Locale;

public class mathsTask14 extends AppCompatActivity {
    Button nextTaskBtn;
    private ImageButton speaker1;
    private TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_task14);

        nextTaskBtn = (Button) findViewById(R.id.nextTaskBtn1);
        speaker1 = (ImageButton) findViewById(R.id.speaker1);

        nextTaskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTask1();
            }
        });

        tts =  new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS){
                    int language =  tts.setLanguage(Locale.ENGLISH);
                    speaker1.setEnabled(true);
                }
            }
        });

        speaker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }
        });
    }

    public void openTask1(){
        Intent intentTask1 = new Intent(this,mathsTask1.class);
        startActivity(intentTask1);
    }

    private void speak(){
        tts.speak("Wrong Answer! " + "  " + "You can do it better! Try again" ,TextToSpeech.QUEUE_FLUSH,null);
    }
}