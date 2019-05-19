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

public class LearnFruitActivity extends AppCompatActivity {
    ImageView showImage;
    ImageButton show,hide;
    private ImageButton move;
    private ImageButton mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_fruit);

        move = (ImageButton) findViewById(R.id.back);
        mv = (ImageButton) findViewById(R.id.home);

        final MediaPlayer buttonSound = MediaPlayer.create(this, R.raw.button);

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnFruitActivity.this, LearnActivity.class);
                startActivity(intent);
                buttonSound.start();
            }
        });
        mv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnFruitActivity.this, MainActivity.class);
                startActivity(intent);
                buttonSound.start();
            }
        });

        showImage = (ImageView) findViewById(R.id.popupFruit);
        show = (ImageButton) findViewById(R.id.apple);
        hide = (ImageButton) findViewById(R.id.banana);

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

        final MediaPlayer soundApple = MediaPlayer.create(this, R.raw.apple);
        final MediaPlayer soundBanana = MediaPlayer.create(this, R.raw.banana);
        final MediaPlayer soundOrange = MediaPlayer.create(this, R.raw.orange);
        final MediaPlayer soundGrape = MediaPlayer.create(this, R.raw.grape);
        final MediaPlayer soundMango = MediaPlayer.create(this, R.raw.mango);
        final MediaPlayer soundWatermelon = MediaPlayer.create(this, R.raw.watermelon);
        final MediaPlayer soundPineapple = MediaPlayer.create(this, R.raw.pineapple);
        final MediaPlayer soundPear = MediaPlayer.create(this, R.raw.pear);
        final MediaPlayer soundPapaya = MediaPlayer.create(this, R.raw.papaya);
        final MediaPlayer soundMangosteen = MediaPlayer.create(this, R.raw.mangosteen);
        final MediaPlayer soundLemon = MediaPlayer.create(this, R.raw.lemon);
        final MediaPlayer soundJaclfruit = MediaPlayer.create(this, R.raw.jackfruit);
        final MediaPlayer soundCherry = MediaPlayer.create(this, R.raw.cherry);
        final MediaPlayer soundAvocado = MediaPlayer.create(this, R.raw.avocado);

        ImageButton buttonSound1 = (ImageButton) this.findViewById(R.id.apple);
        ImageButton buttonSound2 = (ImageButton) this.findViewById(R.id.banana);
        ImageButton buttonSound3 = (ImageButton) this.findViewById(R.id.orange);
        ImageButton buttonSound4 = (ImageButton) this.findViewById(R.id.grape);
        ImageButton buttonSound5 = (ImageButton) this.findViewById(R.id.mango);
        ImageButton buttonSound6 = (ImageButton) this.findViewById(R.id.watermelon);
        ImageButton buttonSound7 = (ImageButton) this.findViewById(R.id.pineapple);
        ImageButton buttonSound8 = (ImageButton) this.findViewById(R.id.pear);
        ImageButton buttonSound9 = (ImageButton) this.findViewById(R.id.papaya);
        ImageButton buttonSound10 = (ImageButton) this.findViewById(R.id.mangosteen);
        ImageButton buttonSound11 = (ImageButton) this.findViewById(R.id.lemon);
        ImageButton buttonSound12 = (ImageButton) this.findViewById(R.id.jackfruit);
        ImageButton buttonSound13 = (ImageButton) this.findViewById(R.id.cherry);
        ImageButton buttonSound14 = (ImageButton) this.findViewById(R.id.avocado);

        buttonSound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnapple);
                showImage.startAnimation(animation);
                soundApple.start();
            }
        });
        buttonSound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnbanana);
                showImage.startAnimation(animation);
                soundBanana.start();
            }
        });
        buttonSound3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnorange);
                showImage.startAnimation(animation);
                soundOrange.start();
            }
        });
        buttonSound4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learngrape);
                showImage.startAnimation(animation);
                soundGrape.start();
            }
        });
        buttonSound5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnmango);
                showImage.startAnimation(animation);
                soundMango.start();
            }
        });
        buttonSound6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnwatermelon);
                showImage.startAnimation(animation);
                soundWatermelon.start();
            }
        });
        buttonSound7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnpineapple);
                showImage.startAnimation(animation);
                soundPineapple.start();
            }
        });
        buttonSound8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnpear);
                showImage.startAnimation(animation);
                soundPear.start();
            }
        });
        buttonSound9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnpapaya);
                showImage.startAnimation(animation);
                soundPapaya.start();
            }
        });
        buttonSound10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnmangosteen);
                showImage.startAnimation(animation);
                soundMangosteen.start();
            }
        });
        buttonSound11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnlemon);
                showImage.startAnimation(animation);
                soundLemon.start();
            }
        });
        buttonSound12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnjackfruit);
                showImage.startAnimation(animation);
                soundJaclfruit.start();
            }
        });
        buttonSound13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learncherry);
                showImage.startAnimation(animation);
                soundCherry.start();
            }
        });
        buttonSound14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnavocado);
                showImage.startAnimation(animation);
                soundAvocado.start();
            }
        });
    }
}
