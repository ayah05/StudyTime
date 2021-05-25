package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {
    private TextView abc_text;
    private ImageButton abc;
    private TextView textView_name;
    SharedPreferences sharedPreferences;
    private static final String SHARED_PREF_NAME = "mypref";
    private static final String KEY_NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        abc_text = (TextView) findViewById(R.id.abc_text);
        abc = (ImageButton) findViewById(R.id.abc);
        textView_name = findViewById(R.id.textView_name);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);

        String nameCheck = sharedPreferences.getString(KEY_NAME, null);
        if(nameCheck != null){
           textView_name.setText(nameCheck);
        }


        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2(){
        Intent intent = new Intent(getApplicationContext(), a.class);
        startActivity(intent);
    }
}
