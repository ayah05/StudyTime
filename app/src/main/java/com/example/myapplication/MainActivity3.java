package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {
    private TextView abc_text;
    private ImageButton abc, doris;
    private TextView textView_name;
    private TextView animaltext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        abc_text = (TextView) findViewById(R.id.abc_text);
        abc = (ImageButton) findViewById(R.id.abc);
        textView_name = findViewById(R.id.textView_name);
        animaltext =(TextView) findViewById(R.id.animaltext);
        doris = findViewById(R.id.doris);


        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("mypref",MODE_PRIVATE);
        String name = sharedPreferences.getString("name", "");
        textView_name.setText(name);

        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        doris.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity3.this, cat.class));
            }
        });


        ImageView danielaButton = findViewById(R.id.danielaButton);

        danielaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentask1();
            }
        });

    }

    public void openActivity2(){
        Intent intent = new Intent(getApplicationContext(), a.class);
        startActivity(intent);
    }

    public void opentask1(){
        Intent intentTask1 = new Intent(getApplicationContext(), mathsTask1.class);
        startActivity(intentTask1);
    }

    public void opencat()
    {
        Intent intentcat = new Intent(this, cat.class);
        startActivity(intentcat);
    }
}
