package com.example.stressbuster;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity5 extends AppCompatActivity {
    LottieAnimationView lottie5;
    TextView textView13;
    TextView textView14;
    TextView textView15;
    TextView textView16;
    TextView textView7;
    ImageView pp1;
    ImageView pp2;
    ImageView pp3;
    ImageView pp4;
    ImageView pp5;
    MediaPlayer mediaPlayer;
    MediaPlayer mediaPlayer2;MediaPlayer mediaPlayer3;MediaPlayer mediaPlayer4;MediaPlayer mediaPlayer5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        lottie5=findViewById(R.id.lottie5);
        pp1=findViewById(R.id.pp1);
        pp2=findViewById(R.id.pp2);
        pp3=findViewById(R.id.pp3);
        pp4=findViewById(R.id.pp4);
        pp5=findViewById(R.id.pp5);
        textView7=findViewById(R.id.textView7);
        textView15=findViewById(R.id.textView15);
        textView16=findViewById(R.id.textView16);
        textView14=findViewById(R.id.textView14);
        textView13=findViewById(R.id.textView13);
        mediaPlayer= MediaPlayer.create(this,R.raw.musicone);
        pp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()) {
                    pp1.setImageResource(R.drawable.ic_baseline_play2_circle_24);
                    mediaPlayer.pause();
                } else {
                    pp1.setImageResource(R.drawable.ic_baseline_pause2_circle_24);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(true);
                }
            }
        });
        mediaPlayer2=MediaPlayer.create(this,R.raw.musictwo);
        pp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer2.isPlaying()) {
                    pp2.setImageResource(R.drawable.ic_baseline_play2_circle_24);
                    mediaPlayer2.pause();
                } else {
                    pp2.setImageResource(R.drawable.ic_baseline_pause2_circle_24);
                    mediaPlayer2.start();
                    mediaPlayer2.setLooping(true);
                }
            }
        });
        mediaPlayer3=MediaPlayer.create(this,R.raw.lofiguitar);
        pp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer3.isPlaying()) {
                    pp3.setImageResource(R.drawable.ic_baseline_play2_circle_24);
                    mediaPlayer3.pause();
                } else {
                    pp3.setImageResource(R.drawable.ic_baseline_pause2_circle_24);
                    mediaPlayer3.start();
                    mediaPlayer3.setLooping(true);
                }
            }
        });
        mediaPlayer4=MediaPlayer.create(this,R.raw.nightrain);
        pp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer4.isPlaying()) {
                    pp4.setImageResource(R.drawable.ic_baseline_play2_circle_24);
                    mediaPlayer4.pause();
                } else {
                    pp4.setImageResource(R.drawable.ic_baseline_pause2_circle_24);
                    mediaPlayer4.start();
                    mediaPlayer4.setLooping(true);
                }
            }
        });
        mediaPlayer5=MediaPlayer.create(this,R.raw.writing);
        pp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer5.isPlaying()) {
                    pp5.setImageResource(R.drawable.ic_baseline_play2_circle_24);
                    mediaPlayer5.pause();
                } else {
                    pp5.setImageResource(R.drawable.ic_baseline_pause2_circle_24);
                    mediaPlayer5.start();
                    mediaPlayer5.setLooping(true);
                }
            }
        });



    }
    @Override
    public void onBackPressed() {
        mediaPlayer.stop();
        pp1.setImageResource(R.drawable.ic_baseline_play2_circle_24);
        mediaPlayer2.stop();
        pp2.setImageResource(R.drawable.ic_baseline_play2_circle_24);
        mediaPlayer3.stop();
        pp3.setImageResource(R.drawable.ic_baseline_play2_circle_24);
        mediaPlayer4.stop();
        pp4.setImageResource(R.drawable.ic_baseline_play2_circle_24);
        mediaPlayer5.stop();
        pp5.setImageResource(R.drawable.ic_baseline_play2_circle_24);
        super.onBackPressed();
    }
}