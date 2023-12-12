package com.example.stressbuster;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {
TextView textView;
LottieAnimationView lottie;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        textView=findViewById(R.id.textView);
        lottie=findViewById(R.id.lots);


        new Handler().postDelayed(() -> {
            Intent i=new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(i);
            finish();
        },5000);
    }
}