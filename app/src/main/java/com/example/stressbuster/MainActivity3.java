package com.example.stressbuster;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    TextView textView2;
ImageView bigmount;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    ImageView plays1;
    ImageView plays2;
    ImageView plays3;
    ImageView plays4;
    ImageView plays5;
    MediaPlayer mediaPlayer;
    MediaPlayer mediaPlayer2;MediaPlayer mediaPlayer3;MediaPlayer mediaPlayer4;MediaPlayer mediaPlayer5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

//        bigmount=findViewById(R.id.bigmount);
        plays1=findViewById(R.id.plays1);
        plays2=findViewById(R.id.plays2);
        plays3=findViewById(R.id.plays3);
        plays4=findViewById(R.id.plays4);
        plays5=findViewById(R.id.plays5);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        mediaPlayer= MediaPlayer.create(this,R.raw.insects);
        plays1.setOnClickListener(view -> {
            if (mediaPlayer.isPlaying()) {
                plays1.setImageResource(R.drawable.ic_baseline_play2_circle_24);
                mediaPlayer.pause();
            } else {
                plays1.setImageResource(R.drawable.ic_baseline_pause2_circle_24);
                mediaPlayer.start();
                mediaPlayer.setLooping(true);
            }
        });
        mediaPlayer2=MediaPlayer.create(this,R.raw.rivercalm);
        plays2.setOnClickListener(view -> {
            if (mediaPlayer2.isPlaying()) {
                plays2.setImageResource(R.drawable.ic_baseline_play2_circle_24);
                mediaPlayer2.pause();
            } else {
                plays2.setImageResource(R.drawable.ic_baseline_pause2_circle_24);
                mediaPlayer2.start();
                mediaPlayer2.setLooping(true);
            }
        });
        mediaPlayer3=MediaPlayer.create(this,R.raw.raintent);
        plays3.setOnClickListener(view -> {
            if (mediaPlayer3.isPlaying()) {
                plays3.setImageResource(R.drawable.ic_baseline_play2_circle_24);
                mediaPlayer3.pause();
            } else {
                plays3.setImageResource(R.drawable.ic_baseline_pause2_circle_24);
                mediaPlayer3.start();
                mediaPlayer3.setLooping(true);
            }
        });
        mediaPlayer4=MediaPlayer.create(this,R.raw.camp);
        plays4.setOnClickListener(view -> {
            if (mediaPlayer4.isPlaying()) {
                plays4.setImageResource(R.drawable.ic_baseline_play2_circle_24);
                mediaPlayer4.pause();
            } else {
                plays4.setImageResource(R.drawable.ic_baseline_pause2_circle_24);
                mediaPlayer4.start();
                mediaPlayer4.setLooping(true);
            }
        });
        mediaPlayer5=MediaPlayer.create(this,R.raw.guitar);
        plays5.setOnClickListener(view -> {
            if (mediaPlayer5.isPlaying()) {
                plays5.setImageResource(R.drawable.ic_baseline_play2_circle_24);
                mediaPlayer5.pause();
            } else {
                plays5.setImageResource(R.drawable.ic_baseline_pause2_circle_24);
                mediaPlayer5.start();
                mediaPlayer5.setLooping(true);
            }
        });



    }
    @Override
    public void onBackPressed() {
        mediaPlayer.stop();
        plays1.setImageResource(R.drawable.ic_baseline_play2_circle_24);
        mediaPlayer2.stop();
        plays2.setImageResource(R.drawable.ic_baseline_play2_circle_24);
        mediaPlayer3.stop();
        plays3.setImageResource(R.drawable.ic_baseline_play2_circle_24);
        mediaPlayer4.stop();
        plays4.setImageResource(R.drawable.ic_baseline_play2_circle_24);
        mediaPlayer5.stop();
        plays5.setImageResource(R.drawable.ic_baseline_play2_circle_24);
        super.onBackPressed();
    }
}