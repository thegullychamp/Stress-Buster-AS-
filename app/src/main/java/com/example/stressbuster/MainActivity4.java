package com.example.stressbuster;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity4 extends AppCompatActivity {
    LottieAnimationView lottie4;
    TextView textView10;
    TextView textView11;
    TextView textView12;
    TextView textView8;
    TextView textView9;
    ImageView p1;
    ImageView p2;
    ImageView p3;
    ImageView p4;
    ImageView p5;
    MediaPlayer mediaPlayer;
    MediaPlayer mediaPlayer2;MediaPlayer mediaPlayer3;MediaPlayer mediaPlayer4;MediaPlayer mediaPlayer5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        lottie4=findViewById(R.id.lottie4);
        p1=findViewById(R.id.p1);
        p2=findViewById(R.id.p2);
        p3=findViewById(R.id.p3);
        p4=findViewById(R.id.p4);
        p5=findViewById(R.id.p5);
        textView8=findViewById(R.id.textView8);
        textView9=findViewById(R.id.textView9);
        textView10=findViewById(R.id.textView10);
        textView11=findViewById(R.id.textView11);
        textView12=findViewById(R.id.textView12);

        mediaPlayer= MediaPlayer.create(this,R.raw.stormrain);
        p1.setOnClickListener(view -> {
            if (mediaPlayer.isPlaying()) {
                p1.setImageResource(R.drawable.ic_baseline_play3_circle_24);
                mediaPlayer.pause();
            } else {
                p1.setImageResource(R.drawable.ic_baseline_pause3_circle_24);
                mediaPlayer.start();
                mediaPlayer.setLooping(true);
            }
        });
        mediaPlayer2=MediaPlayer.create(this,R.raw.citytraffic);
        p2.setOnClickListener(view -> {
            if (mediaPlayer2.isPlaying()) {
                p2.setImageResource(R.drawable.ic_baseline_play3_circle_24);
                mediaPlayer2.pause();
            } else {
                p2.setImageResource(R.drawable.ic_baseline_pause3_circle_24);
                mediaPlayer2.start();
                mediaPlayer2.setLooping(true);
            }
        });
        mediaPlayer3=MediaPlayer.create(this,R.raw.trainpass);
        p3.setOnClickListener(view -> {
            if (mediaPlayer3.isPlaying()) {
                p3.setImageResource(R.drawable.ic_baseline_play3_circle_24);
                mediaPlayer3.pause();
            } else {
                p3.setImageResource(R.drawable.ic_baseline_pause3_circle_24);
                mediaPlayer3.start();
                mediaPlayer3.setLooping(true);
            }
        });
        mediaPlayer4=MediaPlayer.create(this,R.raw.footsteps);
        p4.setOnClickListener(view -> {
            if (mediaPlayer4.isPlaying()) {
                p4.setImageResource(R.drawable.ic_baseline_play3_circle_24);
                mediaPlayer4.pause();
            } else {
                p4.setImageResource(R.drawable.ic_baseline_pause3_circle_24);
                mediaPlayer4.start();
                mediaPlayer4.setLooping(true);
            }
        });
        mediaPlayer5=MediaPlayer.create(this,R.raw.cafepeople);
        p5.setOnClickListener(view -> {
            if (mediaPlayer5.isPlaying()) {
                p5.setImageResource(R.drawable.ic_baseline_play3_circle_24);
                mediaPlayer5.pause();
            } else {
                p5.setImageResource(R.drawable.ic_baseline_pause3_circle_24);
                mediaPlayer5.start();
                mediaPlayer5.setLooping(true);
            }
        });



    }
    @Override
    public void onBackPressed() {
        mediaPlayer.stop();
        p1.setImageResource(R.drawable.ic_baseline_play3_circle_24);
        mediaPlayer2.stop();
        p2.setImageResource(R.drawable.ic_baseline_play3_circle_24);
        mediaPlayer3.stop();
        p3.setImageResource(R.drawable.ic_baseline_play3_circle_24);
        mediaPlayer4.stop();
        p4.setImageResource(R.drawable.ic_baseline_play3_circle_24);
        mediaPlayer5.stop();
        p5.setImageResource(R.drawable.ic_baseline_play3_circle_24);
        super.onBackPressed();
    }
}