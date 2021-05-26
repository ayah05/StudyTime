package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ImageView nextBl;
    private ImageView bg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextBl = (ImageView) findViewById(R.id.nextBl);
        bg = findViewById(R.id.background);

        nextBl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
    }

}