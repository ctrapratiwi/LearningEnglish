package com.example.learningenglish;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ImageButton move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer buttonSound = MediaPlayer.create(this, R.raw.button);

        move = (ImageButton) findViewById(R.id.learn);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSound.start();
                Intent intent = new Intent(MainActivity.this, LearnActivity.class);
                startActivity(intent);
                //sound.stop();
            }
        });
        move = (ImageButton) findViewById(R.id.quiz);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSound.start();
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(intent);
                //sound.stop();
            }
        });
        move = (ImageButton) findViewById(R.id.about);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSound.start();
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                //sound.stop();
            }
        });
    }
}
