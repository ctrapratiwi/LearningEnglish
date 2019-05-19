package com.example.learningenglish;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class LearnNumberActivity extends AppCompatActivity {

    ImageView showImage;
    ImageButton show,hide;
    private ImageButton move;
    private ImageButton mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_number);

        move = (ImageButton) findViewById(R.id.back);
        mv = (ImageButton) findViewById(R.id.home);

        final MediaPlayer buttonSound = MediaPlayer.create(this, R.raw.button);

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnNumberActivity.this, LearnActivity.class);
                startActivity(intent);
                buttonSound.start();
            }
        });
        mv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnNumberActivity.this, MainActivity.class);
                startActivity(intent);
                buttonSound.start();
            }
        });

        showImage = (ImageView) findViewById(R.id.popup);
        show = (ImageButton) findViewById(R.id.number1);
        hide = (ImageButton) findViewById(R.id.number2);

        final Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_scale);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage.setVisibility(View.VISIBLE);
            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage.setVisibility(View.INVISIBLE);
            }
        });

        final MediaPlayer soundOne = MediaPlayer.create(this, R.raw.one);
        final MediaPlayer soundTwo = MediaPlayer.create(this, R.raw.two);
        final MediaPlayer soundThree = MediaPlayer.create(this, R.raw.three);
        final MediaPlayer soundFour = MediaPlayer.create(this, R.raw.four);
        final MediaPlayer soundFive = MediaPlayer.create(this, R.raw.five);
        final MediaPlayer soundSix = MediaPlayer.create(this, R.raw.six);
        final MediaPlayer soundSeven = MediaPlayer.create(this, R.raw.seven);
        final MediaPlayer soundEight = MediaPlayer.create(this, R.raw.eight);
        final MediaPlayer soundNine = MediaPlayer.create(this, R.raw.nine);
        final MediaPlayer soundTen = MediaPlayer.create(this,R.raw.ten);

        ImageButton buttonSound1 = (ImageButton) this.findViewById(R.id.number1);
        ImageButton buttonSound2 = (ImageButton) this.findViewById(R.id.number2);
        ImageButton buttonSound3 = (ImageButton) this.findViewById(R.id.number3);
        ImageButton buttonSound4 = (ImageButton) this.findViewById(R.id.number4);
        ImageButton buttonSound5 = (ImageButton) this.findViewById(R.id.number5);
        ImageButton buttonSound6 = (ImageButton) this.findViewById(R.id.number6);
        ImageButton buttonSound7 = (ImageButton) this.findViewById(R.id.number7);
        ImageButton buttonSound8 = (ImageButton) this.findViewById(R.id.number8);
        ImageButton buttonSound9 = (ImageButton) this.findViewById(R.id.number9);
        ImageButton buttonSound10 = (ImageButton) this.findViewById(R.id.number10);

        buttonSound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learn1);
                showImage.startAnimation(animation);
                soundOne.start();
            }
        });
        buttonSound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learn2);
                showImage.startAnimation(animation);
                soundTwo.start();
            }
        });
        buttonSound3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learn3);
                showImage.startAnimation(animation);
                soundThree.start();
            }
        });
        buttonSound4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learn4);
                showImage.startAnimation(animation);
                soundFour.start();
            }
        });
        buttonSound5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learn5);
                showImage.startAnimation(animation);
                soundFive.start();
            }
        });
        buttonSound6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learn6);
                showImage.startAnimation(animation);
                soundSix.start();
            }
        });
        buttonSound7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learn7);
                showImage.startAnimation(animation);
                soundSeven.start();
            }
        });
        buttonSound8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learn8);
                showImage.startAnimation(animation);
                soundEight.start();
            }
        });
        buttonSound9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learn9);
                showImage.startAnimation(animation);
                soundNine.start();
            }
        });
        buttonSound10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learn10);
                showImage.startAnimation(animation);
                soundTen.start();
            }
        });
    }
}
