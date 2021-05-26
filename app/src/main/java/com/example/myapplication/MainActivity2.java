package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private EditText name;
    private Button ok;
    public String nameZ;
    private ImageView bg;
    SharedPreferences sharedPreferences;
    private static final String SHARED_PREF_NAME = "mypref";
    private static final String KEY_NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.name);
        ok = findViewById(R.id.ok);
        bg = findViewById(R.id.background);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);

        String nameCheck = sharedPreferences.getString(KEY_NAME, null);
        if(nameCheck != null){
            Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
            startActivity(intent);
        }


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_NAME,name.getText().toString());
                editor.apply();
                Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(intent);
            }
        });

    }
}