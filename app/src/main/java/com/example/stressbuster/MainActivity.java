package com.example.stressbuster;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
ImageView play;
TextView birds;
    ImageView play2;
    TextView birds2;
    ImageView play3;
    TextView birds3;
    ImageView play4;
    TextView birds4;
LottieAnimationView lotsea;
MediaPlayer mediaPlayer;
    MediaPlayer mediaPlayer2;MediaPlayer mediaPlayer3;MediaPlayer mediaPlayer4;MediaPlayer mediaPlayer5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lotsea=findViewById(R.id.lotsea);
        play=findViewById(R.id.play);
        birds=findViewById(R.id.birds);
        play2=findViewById(R.id.play2);
        birds2=findViewById(R.id.birds2);
        play3=findViewById(R.id.play3);
        birds3=findViewById(R.id.birds3);
        play4=findViewById(R.id.play4);
        birds4=findViewById(R.id.birds4);

        mediaPlayer=MediaPlayer.create(this,R.raw.birdies);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()) {
                    play.setImageResource(R.drawable.ic_baseline_play_circle_24);
                    mediaPlayer.pause();
                } else {
                    play.setImageResource(R.drawable.ic_baseline_pause_circle_24);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(true);
                }
            }
        });
        mediaPlayer2=MediaPlayer.create(this,R.raw.rainthunder);
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer2.isPlaying()) {
                    play2.setImageResource(R.drawable.ic_baseline_play_circle_24);
                    mediaPlayer2.pause();
                } else {
                    play2.setImageResource(R.drawable.ic_baseline_pause_circle_24);
                    mediaPlayer2.start();
                    mediaPlayer2.setLooping(true);
                }
            }
        });
        mediaPlayer3=MediaPlayer.create(this,R.raw.campfire);
        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer3.isPlaying()) {
                    play3.setImageResource(R.drawable.ic_baseline_play_circle_24);
                    mediaPlayer3.pause();
                } else {
                    play3.setImageResource(R.drawable.ic_baseline_pause_circle_24);
                    mediaPlayer3.start();
                    mediaPlayer3.setLooping(true);
                }
            }
        });
        mediaPlayer4=MediaPlayer.create(this,R.raw.windmountain);
        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer4.isPlaying()) {
                    play4.setImageResource(R.drawable.ic_baseline_play_circle_24);
                    mediaPlayer4.pause();
                } else {
                    play4.setImageResource(R.drawable.ic_baseline_pause_circle_24);
                    mediaPlayer4.start();
                    mediaPlayer4.setLooping(true);
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        mediaPlayer.stop();
        play.setImageResource(R.drawable.ic_baseline_play_circle_24);
        mediaPlayer2.stop();
        play2.setImageResource(R.drawable.ic_baseline_play_circle_24);
        mediaPlayer3.stop();
        play3.setImageResource(R.drawable.ic_baseline_play_circle_24);
        mediaPlayer4.stop();
        play4.setImageResource(R.drawable.ic_baseline_play_circle_24);
        super.onBackPressed();
    }
}