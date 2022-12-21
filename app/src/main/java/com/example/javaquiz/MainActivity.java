package com.example.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String Return;
    private String[] questions = {"Java is short for \"JavaScript\".","The value of a string variable can be surrounded by single quotes.",
            "In Java, it is possible to inherit attributes and methods from one class to another.", "Java has a abstract class?",
            "Java supports interface?","To declare an array in Java, define the variable type with: []","Array indexes start with: 1",
            "'RETUTN' keyword is used to return a value inside a method?","'STOP' statement is used to stop a loop?","'class()' keyword is used to create a class in Java?"};
    private boolean[] answers = {false, false, true, true, true, true, false, true, false, false};
    private int score = 0;
    Button no;
    Button yes;
    private int index =0;
    TextView question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        no = findViewById(R.id.no);
        yes = findViewById(R.id.yes);
        question = findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= questions.length-1) {

                    if (answers[index]){
                        score++;

                    }index++;
                    if(index <= questions.length -1 ){
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your Score is: " + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= questions.length-1) {

                    if (!answers[index]){
                        score++;
                    }index++;
                    if(index <= questions.length-1 ){
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your Score is: " + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}