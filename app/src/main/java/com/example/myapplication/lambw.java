package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Locale;

public class lambw extends AppCompatActivity {
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
        setContentView(R.layout.l_lamb_wrong);

        next = (ImageButton) findViewById(R.id.next);
        home = (ImageButton) findViewById(R.id.home);
        back = (ImageButton) findViewById(R.id.back);
        speaker = (ImageButton) findViewById(R.id.speaker);
        animal_1 = (TextView) findViewById(R.id.animal_1);
        wrong1 = (TextView) findViewById(R.id.wrong1);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlamb();

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
                openbutterfly();
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
        Intent catstart = new Intent(this, cat.class);
        startActivity(catstart);
    }
    public void opencatt(){
        Intent cattstart = new Intent(this, catt2.class);
        startActivity(cattstart);
    }
    public void opencatw(){
        Intent catwstart = new Intent(this, catw.class);
        startActivity(catwstart);
    }

    public void opendog(){
        Intent dogstart = new Intent(this,dog.class);
        startActivity(dogstart);
    }
    public void opendogt(){
        Intent dogtstart = new Intent(this, dogw.class);
        startActivity(dogtstart);
    }
    public void opendogw(){
        Intent dogwstart = new Intent(this, dogT2.class);
        startActivity(dogwstart);
    }
    public void openhorse(){
        Intent horsestart = new Intent(this,horse.class);
        startActivity(horsestart);
    }
    public void openhorset(){
        Intent horsetstart = new Intent(this,horset2.class);
        startActivity(horsetstart);
    }
    public void openhorsew(){
        Intent horsewstart = new Intent(this,horsew.class);
        startActivity(horsewstart);
    }

    public void openbird(){
        Intent birdstart = new Intent(this, bird.class);
        startActivity(birdstart);
    }
    public void openbirdt2(){
        Intent birdtstart = new Intent(this, birdt2.class);
        startActivity(birdtstart);
    }
    public void openbirdw(){
        Intent birdtstart = new Intent(this, birdw.class);
        startActivity(birdtstart);
    }
    public void openrabbit(){
        Intent rabbitstart = new Intent(this,rabbit.class);
        startActivity(rabbitstart);
    }
    public void openrabbitt2(){
        Intent rabbitt2start = new Intent(this,rabbitt2.class);
        startActivity(rabbitt2start);
    }public void openrabbitw(){
        Intent rabbitwstart = new Intent(this,rabbitw.class);
        startActivity(rabbitwstart);
    }
    public void openfish(){
        Intent fishstart = new Intent(this,fish.class);
        startActivity(fishstart);
    }
    public void openfisht2(){
        Intent fishtstart = new Intent(this,fisht2.class);
        startActivity(fishtstart);
    }
    public void openfishw(){
        Intent fishwstart = new Intent(this,fishw.class);
        startActivity(fishwstart);
    }
    public void openelephant(){
        Intent elephantstart = new Intent(this,elephant.class);
        startActivity(elephantstart);
    }
    public void openelephantt(){
        Intent elephanttstart = new Intent(this,elephantt2.class);
        startActivity(elephanttstart);
    } public void openelephantw(){
        Intent elephantwstart = new Intent(this,elephantw.class);
        startActivity(elephantwstart);
    }
    public void openhedgehog(){
        Intent hedgehogstart = new Intent(this,hedgehog.class);
        startActivity(hedgehogstart);
    }
    public void openhedgehogt(){
        Intent hedgehogtstart = new Intent(this,hedgehogt2.class);
        startActivity(hedgehogtstart);
    }
    public void openhedgehogw(){
        Intent hedgehogwstart = new Intent(this,hedgehogw.class);
        startActivity(hedgehogwstart);
    }
    public void openchicken(){
        Intent chickenstart = new Intent(this,chicken.class);
        startActivity(chickenstart);
    }
    public void openchickent(){
        Intent chickentstart = new Intent(this,chickent2.class);
        startActivity(chickentstart);
    }
    public void openchickenw(){
        Intent chickenwstart = new Intent(this,chickenw.class);
        startActivity(chickenwstart);
    }
    public void openhamster(){
        Intent hamsterstart = new Intent(this,hamster.class);
        startActivity(hamsterstart);
    }
    public void openhamstert(){
        Intent hamstertstart = new Intent(this,hamstert2.class);
        startActivity(hamstertstart);
    }
    public void openhamsterw(){
        Intent hamsterwstart = new Intent(this,hamsterw.class);
        startActivity(hamsterwstart);
    }
    public void opendeer(){
        Intent deerstart = new Intent(this,deer.class);
        startActivity(deerstart);
    }
    public void opendeert(){
        Intent deertstart = new Intent(this,deert2.class);
        startActivity(deertstart);
    }
    public void opendeerw(){
        Intent deerwstart = new Intent(this,deerW.class);
        startActivity(deerwstart);
    }
    public void openfox(){
        Intent foxstart = new Intent(this,fox.class);
        startActivity(foxstart);
    }
    public void openfoxt(){
        Intent foxtstart = new Intent(this,foxt2.class);
        startActivity(foxtstart);
    }
    public void openfoxw(){
        Intent foxwstart = new Intent(this,foxw.class);
        startActivity(foxwstart);
    }
    public void opengiraffe(){
        Intent giraffestart = new Intent(this,giraffe.class);
        startActivity(giraffestart);
    }
    public void opengiraffet(){
        Intent giraffetstart = new Intent(this,giraffet2.class);
        startActivity(giraffetstart);
    }
    public void opengiraffew(){
        Intent giraffewstart = new Intent(this,giraffew.class);
        startActivity(giraffewstart);
    }

    public void openladybug(){
        Intent ladybugstart = new Intent(this,ladybugs.class);
        startActivity(ladybugstart);
    }
    public void openladybugt(){
        Intent ladybugtstart = new Intent(this,ladybugt2.class);
        startActivity(ladybugtstart);
    }
    public void openladybugw(){
        Intent ladybugwstart = new Intent(this,ladybugw.class);
        startActivity(ladybugwstart);
    }
    public void openmonkey(){
        Intent monkeystart = new Intent(this,monkey.class);
        startActivity(monkeystart);
    }
    public void openmonkeyt(){
        Intent monkeytstart = new Intent(this,monkeyt2.class);
        startActivity(monkeytstart);
    }
    public void openmonkeyw(){
        Intent monkeywstart = new Intent(this,monkeyw.class);
        startActivity(monkeywstart);
    }
    public void openlion(){
        Intent lionstart = new Intent(this,lion.class);
        startActivity(lionstart);
    }
    public void openliont(){
        Intent liontstart = new Intent(this,liont2.class);
        startActivity(liontstart);
    }
    public void openlionw(){
        Intent lionwstart = new Intent(this,lionw.class);
        startActivity(lionwstart);
    }
    public void openmouse(){
        Intent mousestart = new Intent(this,mouse.class);
        startActivity(mousestart);
    }
    public void openmouset(){
        Intent mousetstart = new Intent(this,mouset2.class);
        startActivity(mousetstart);
    } public void openmousew(){
        Intent mousewstart = new Intent(this,mousew.class);
        startActivity(mousewstart);
    }
    public void opentiger(){
        Intent tigerstart = new Intent(this,tiger.class);
        startActivity(tigerstart);
    }
    public void opentigert(){
        Intent tigertstart = new Intent(this,tigert2.class);
        startActivity(tigertstart);
    }
    public void opentigerw(){
        Intent tigerwstart = new Intent(this,tigerw.class);
        startActivity(tigerwstart);
    }

    public void opengoat(){
        Intent goatstart = new Intent(this, goat.class);
        startActivity(goatstart);
    }
    public void opengoatt(){
        Intent goattstart = new Intent(this, goatt2.class);
        startActivity(goattstart);
    }
    public void opengoatw(){
        Intent goatwstart = new Intent(this, goatw.class);
        startActivity(goatwstart);
    }
    public void opencow(){
        Intent cowstart = new Intent(this,cow.class);
        startActivity(cowstart);
    }
    public void opencowt(){
        Intent cowtstart = new Intent(this,cowt2.class);
        startActivity(cowtstart);
    }
    public void opencoww(){
        Intent cowwstart = new Intent(this,coww.class);
        startActivity(cowwstart);
    }
    public void openbutterfly(){
        Intent butterflystart = new Intent(this,butterfly.class);
        startActivity(butterflystart);
    }
    public void openbutterflyt(){
        Intent butterflytstart = new Intent(this,butterflyt2.class);
        startActivity(butterflytstart);
    }
    public void openbutterflyw(){
        Intent butterflywstart = new Intent(this,butterflyw.class);
        startActivity(butterflywstart);
    }
    public void openlamb(){
        Intent lambstart = new Intent(this,lamb.class);
        startActivity(lambstart);
    }
    public void openlambt(){
        Intent lambtstart = new Intent(this,lambt2.class);
        startActivity(lambtstart);
    }
    public void openlambw(){
        Intent lambwstart = new Intent(this,lambw.class);
        startActivity(lambwstart);
    }
    public void openturtle(){
        Intent turtlestart = new Intent(this,turtle.class);
        startActivity(turtlestart);
    }
    public void openturtlet(){
        Intent turtletstart = new Intent(this,turtlet2.class);
        startActivity(turtletstart);
    }
    public void openturtlew(){
        Intent turtlewstart = new Intent(this,turtlew.class);
        startActivity(turtlewstart);
    }
    public void home(){
        Intent intentHome = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(intentHome);
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

