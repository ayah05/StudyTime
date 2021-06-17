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

public class AnalogQuiz4 extends AppCompatActivity {

    private ImageButton home;
    private EditText quiz_input;
    private Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analog_quiz4);

        home = (ImageButton) findViewById(R.id.home);
        quiz_input = findViewById(R.id.quiz_input);
        check = (Button) findViewById(R.id.check);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnalogQuiz4.this, MainActivity3.class));
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Text = quiz_input.getText().toString();
                if (Text.equals("01:22 and 50 seconds") || Text.equals("13:22 and 50 seconds") || Text.equals("01:22:50") || Text.equals("13:22:50"))
                {
                    openDialog2();
                }else
                {
                    openDialog();
                    quiz_input.setText("");
                }
            }
        });


    }
    public void openDialog(){
        AlertDialog dialog = new AlertDialog.Builder(AnalogQuiz4.this).setTitle("Checking").setMessage("Wrong Answer! Please try again.").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        })
                .create();
        dialog.show();
    }

    public void openDialog2(){
        AlertDialog dialog = new AlertDialog.Builder(AnalogQuiz4.this).setTitle("Checking").setMessage("Correct answer. Very good!").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                openAnalogquiz5();
            }
        })
                .create();
        dialog.show();
    }

    public void openAnalogquiz5()
    {
        startActivity(new Intent(AnalogQuiz4.this, AnalogQuiz5.class));
    }
}