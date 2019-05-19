package com.example.learningenglish;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class QuizNumberActivity extends AppCompatActivity {

    private Number number = new Number();
    private TextView scoreview;
    private ImageView question;
    private ImageButton ans1;
    private ImageButton ans2;
    private ImageButton ans3;
    private ImageButton move;
    private ImageButton mv;

    private int correctans;
    private int score = 0;
    private int questionnumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_number);


        final MediaPlayer buttonSound = MediaPlayer.create(this, R.raw.button);


        scoreview = (TextView) findViewById(R.id.score);
        question = (ImageView) findViewById(R.id.question);
        ans1 = (ImageButton) findViewById(R.id.answer1);
        ans2 = (ImageButton) findViewById(R.id.answer2);
        ans3 = (ImageButton) findViewById(R.id.answer3);

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionOnClick(ans1, number);
            }
            });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionOnClick(ans2, number);
            }
        });
        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionOnClick(ans3, number);
            }
        });

        move = (ImageButton) findViewById(R.id.back);
        mv = (ImageButton) findViewById(R.id.home);

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizNumberActivity.this, QuizActivity.class);
                startActivity(intent);
                buttonSound.start();
            }
        });
        mv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizNumberActivity.this, MainActivity.class);
                startActivity(intent);
                buttonSound.start();
            }
        });

        newquestion();
        updateScore();
    }

    private void newquestion() {
        if (questionnumber < number.getLength()) {
            question.setBackgroundResource(number.getimagequestion(questionnumber));
            ans1.setBackgroundResource(number.getListanswernumber(questionnumber, 1));
            ans2.setBackgroundResource(number.getListanswernumber(questionnumber, 2));
            ans3.setBackgroundResource(number.getListanswernumber(questionnumber, 3));
            correctans = number.getCorrectanswer(questionnumber);
            questionnumber++;
        } else {
            Intent intent = new Intent(getApplicationContext(), HSNumberActivity.class);
            intent.putExtra("score",score);
            startActivity(intent);
        }
    }

    private void updateScore() {
        scoreview.setText("Score :" + score);
    }

    public void questionOnClick(ImageButton imageButton, Number number) {
        int i = 0;
        if (imageButton == ans1){
            i=1;
        }
        else if (imageButton == ans2){
            i=2;
        }
        else if (imageButton == ans3){
            i=3;
        }

        int answer = number.getListanswernumber(questionnumber-1, i);

        if (answer == correctans) {
            score = score + 2;
            MediaPlayer correct = MediaPlayer.create(getBaseContext(), R.raw.right1);
            correct.start();
            newquestion();
            updateScore();

        } else {
            MediaPlayer incorrect = MediaPlayer.create(getBaseContext(), R.raw.wrong1);
            score = score - 1;
            incorrect.start();
            updateScore();
        }
    }
}
