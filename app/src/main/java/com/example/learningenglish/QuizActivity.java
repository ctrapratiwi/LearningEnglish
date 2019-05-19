package com.example.learningenglish;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class QuizActivity extends AppCompatActivity {

    ImageButton move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        final MediaPlayer buttonSound = MediaPlayer.create(this, R.raw.button);

        move = (ImageButton) findViewById(R.id.quizNumber);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSound.start();
                Intent intent = new Intent(QuizActivity.this, QuizNumberActivity.class);
                startActivity(intent);
                //sound.stop();
            }
        });
        move = (ImageButton) findViewById(R.id.quizFruit);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSound.start();
                Intent intent = new Intent(QuizActivity.this, QuizFruitActivity.class);
                startActivity(intent);
                //sound.stop();
            }
        });
        move = (ImageButton) findViewById(R.id.quizAnimal);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSound.start();
                Intent intent = new Intent(QuizActivity.this, QuizAnimalActivity.class);
                startActivity(intent);
                //sound.stop();
            }
        });
        move = (ImageButton) findViewById(R.id.back);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSound.start();
                Intent intent = new Intent(QuizActivity.this, MainActivity.class);
                startActivity(intent);
                //sound.stop();
            }
        });
    }
}
