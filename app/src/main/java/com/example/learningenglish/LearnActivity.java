package com.example.learningenglish;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LearnActivity extends AppCompatActivity {

    ImageButton move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        final MediaPlayer buttonSound = MediaPlayer.create(this, R.raw.button);

        move = (ImageButton) findViewById(R.id.learnNumber);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSound.start();
                Intent intent = new Intent(LearnActivity.this, LearnNumberActivity.class);
                startActivity(intent);
            }
        });
        move = (ImageButton) findViewById(R.id.learnFruit);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSound.start();
                Intent intent = new Intent(LearnActivity.this, LearnFruitActivity.class);
                startActivity(intent);
            }
        });
        move = (ImageButton) findViewById(R.id.learnAnimal);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSound.start();
                Intent intent = new Intent(LearnActivity.this, LearnAnimalActivity.class);
                startActivity(intent);
            }
        });
        move = (ImageButton) findViewById(R.id.back);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSound.start();
                Intent intent = new Intent(LearnActivity.this, MainActivity.class);
                startActivity(intent);
                //sound.stop();
            }
        });

    }
}
