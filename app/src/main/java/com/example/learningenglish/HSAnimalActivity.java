package com.example.learningenglish;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class HSAnimalActivity extends AppCompatActivity {

    private ImageButton move;
    private ImageButton mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hsanimal);

        move = (ImageButton) findViewById(R.id.back);
        mv = (ImageButton) findViewById(R.id.home);

        final MediaPlayer buttonSound = MediaPlayer.create(this, R.raw.button);

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HSAnimalActivity.this, QuizActivity.class);
                startActivity(intent);
                buttonSound.start();
            }
        });
        mv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HSAnimalActivity.this, MainActivity.class);
                startActivity(intent);
                buttonSound.start();
            }
        });

        TextView totalScore = (TextView) findViewById(R.id.totalscore);
        TextView highScore = (TextView) findViewById(R.id.highscore);

        int score = getIntent().getIntExtra("score",0);
        totalScore.setText("Your Score : " + score);

        SharedPreferences preferences = getPreferences(MODE_PRIVATE);
        int high = preferences.getInt("high",0);
        if (score > high){
            highScore.setText("High Score : "+score);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("high", score);
            editor.commit();
        }
        else {
            highScore.setText("High Score : "+high);
        }
    }

    public void onClick (View view) {
        Intent intent = new Intent(HSAnimalActivity.this, QuizAnimalActivity.class);
        startActivity(intent);
    }

}
