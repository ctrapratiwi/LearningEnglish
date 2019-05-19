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

public class LearnAnimalActivity extends AppCompatActivity {
    ImageView showImage;
    ImageButton show,hide;
    private ImageButton move;
    private ImageButton mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_animal);

        move = (ImageButton) findViewById(R.id.back);
        mv = (ImageButton) findViewById(R.id.home);

        final MediaPlayer buttonSound = MediaPlayer.create(this, R.raw.button);

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnAnimalActivity.this, LearnActivity.class);
                startActivity(intent);
                buttonSound.start();
            }
        });
        mv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnAnimalActivity.this, MainActivity.class);
                startActivity(intent);
                buttonSound.start();
            }
        });

        showImage = (ImageView) findViewById(R.id.popupAnimal);
        show = (ImageButton) findViewById(R.id.dog);
        hide = (ImageButton) findViewById(R.id.cat);

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

        final MediaPlayer soundDog = MediaPlayer.create(this, R.raw.dog);
        final MediaPlayer soundCat = MediaPlayer.create(this, R.raw.cat);
        final MediaPlayer soundButterfly = MediaPlayer.create(this, R.raw.butterfly);
        final MediaPlayer soundFish = MediaPlayer.create(this, R.raw.fish);
        final MediaPlayer soundGiraffe = MediaPlayer.create(this, R.raw.giraffe);
        final MediaPlayer soundDragonfly = MediaPlayer.create(this, R.raw.dragonfly);
        final MediaPlayer soundTurtle = MediaPlayer.create(this, R.raw.turtle);
        final MediaPlayer soundTiger = MediaPlayer.create(this, R.raw.tiger);
        final MediaPlayer soundSquid = MediaPlayer.create(this, R.raw.squid);
        final MediaPlayer soundOctopus = MediaPlayer.create(this, R.raw.octopus);
        final MediaPlayer soundMouse = MediaPlayer.create(this, R.raw.mouse);
        final MediaPlayer soundLion = MediaPlayer.create(this, R.raw.lion);
        final MediaPlayer soundElephant = MediaPlayer.create(this, R.raw.elephant);
        final MediaPlayer soundCrocodile = MediaPlayer.create(this, R.raw.crocodile);
        final MediaPlayer soundBird = MediaPlayer.create(this, R.raw.bird);
        final MediaPlayer soundBee = MediaPlayer.create(this, R.raw.bee);
        final MediaPlayer soundAnt = MediaPlayer.create(this, R.raw.ant);

        ImageButton buttonSound1 = (ImageButton) this.findViewById(R.id.dog);
        ImageButton buttonSound2 = (ImageButton) this.findViewById(R.id.cat);
        ImageButton buttonSound3 = (ImageButton) this.findViewById(R.id.butterfly);
        ImageButton buttonSound4 = (ImageButton) this.findViewById(R.id.fish);
        ImageButton buttonSound5 = (ImageButton) this.findViewById(R.id.giraffe);
        ImageButton buttonSound6 = (ImageButton) this.findViewById(R.id.dragonfly);
        ImageButton buttonSound7 = (ImageButton) this.findViewById(R.id.turtle);
        ImageButton buttonSound8 = (ImageButton) this.findViewById(R.id.tiger);
        ImageButton buttonSound9 = (ImageButton) this.findViewById(R.id.squid);
        ImageButton buttonSound10 = (ImageButton) this.findViewById(R.id.octopus);
        ImageButton buttonSound11 = (ImageButton) this.findViewById(R.id.mouse);
        ImageButton buttonSound12 = (ImageButton) this.findViewById(R.id.lion);
        ImageButton buttonSound13 = (ImageButton) this.findViewById(R.id.elephant);
        ImageButton buttonSound14 = (ImageButton) this.findViewById(R.id.crocodile);
        ImageButton buttonSound15 = (ImageButton) this.findViewById(R.id.bird);
        ImageButton buttonSound16 = (ImageButton) this.findViewById(R.id.bee);
        ImageButton buttonSound17 = (ImageButton) this.findViewById(R.id.ant);

        buttonSound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learndog);
                showImage.startAnimation(animation);
                soundDog.start();
            }
        });
        buttonSound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learncat);
                showImage.startAnimation(animation);
                soundCat.start();
            }
        });
        buttonSound3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnbutterfly);
                showImage.startAnimation(animation);
                soundButterfly.start();
            }
        });
        buttonSound4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnfish);
                showImage.startAnimation(animation);
                soundFish.start();
            }
        });
        buttonSound5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learngiraffe);
                showImage.startAnimation(animation);
                soundGiraffe.start();
            }
        });
        buttonSound6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learndragonfly);
                showImage.startAnimation(animation);
                soundDragonfly.start();
            }
        });
        buttonSound7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnturtle);
                showImage.startAnimation(animation);
                soundTurtle.start();
            }
        });
        buttonSound8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learntiger);
                showImage.startAnimation(animation);
                soundTiger.start();
            }
        });
        buttonSound9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnsquid);
                showImage.startAnimation(animation);
                soundSquid.start();
            }
        });
        buttonSound10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnoctopus);
                showImage.startAnimation(animation);
                soundOctopus.start();
            }
        });
        buttonSound11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnmouse);
                showImage.startAnimation(animation);
                soundMouse.start();
            }
        });
        buttonSound12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnlion);
                showImage.startAnimation(animation);
                soundLion.start();
            }
        });
        buttonSound13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnelephant);
                showImage.startAnimation(animation);
                soundElephant.start();
            }
        });
        buttonSound14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learncrocodile);
                showImage.startAnimation(animation);
                soundCrocodile.start();
            }
        });
        buttonSound15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnbird);
                showImage.startAnimation(animation);
                soundBird.start();
            }
        });
        buttonSound16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnbee);
                showImage.startAnimation(animation);
                soundBee.start();
            }
        });
        buttonSound17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showImage.setImageResource(R.drawable.learnant);
                showImage.startAnimation(animation);
                soundAnt.start();
            }
        });

    }

}
