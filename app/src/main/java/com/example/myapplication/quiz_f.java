package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class quiz_f extends AppCompatActivity {
    private EditText quiz_input;
    private Button check;
    private ImageButton next;
    private ImageButton home;
    private ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_f);
        quiz_input = findViewById(R.id.quiz_input);
        check = findViewById(R.id.check);
        next = (ImageButton) findViewById(R.id.next);
        home = (ImageButton) findViewById(R.id.home);
        back = (ImageButton) findViewById(R.id.back);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityquizG();
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

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Text = quiz_input.getText().toString();
                if ( Text.equals("fish"))
                {
                    openDialog2();
                }else{
                    openDialog();
                    quiz_input.setText("");
                }
            }
        });
    }
    public void openDialog(){
        AlertDialog dlg = new AlertDialog.Builder(quiz_f.this).setTitle("Message").setMessage("Wrong answer! Please try again.").setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        })
                .create();
        dlg.show();
    }

    public void openDialog2(){
        AlertDialog dlg = new AlertDialog.Builder(quiz_f.this).setTitle("Message").setMessage("Very good!").setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                openActivityquizG();
            }
        })
                .create();
        dlg.show();
    }
    public void openActivityquizG(){
        Intent intentB = new Intent(getApplicationContext(), quiz_g.class);
        startActivity(intentB);
    }

    public void getBack(){
        Intent intent = new Intent(getApplicationContext(), quiz_e.class);
        startActivity(intent);
    }

    public void home(){
        Intent intentHome = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(intentHome);
    }
}