package com.example.learningenglish;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AboutActivity extends AppCompatActivity {

    ImageButton move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        final MediaPlayer buttonSound = MediaPlayer.create(this, R.raw.button);

        move = (ImageButton) findViewById(R.id.back);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSound.start();
                Intent intent = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(intent);
                //sound.stop();
            }
        });
    }
}
