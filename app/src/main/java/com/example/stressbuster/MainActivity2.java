package com.example.stressbuster;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
ImageView header;
ImageView summer;
ImageView mountain;
ImageView rain;
ImageView study;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        header=findViewById(R.id.header);
        summer=findViewById(R.id.summer);
        mountain=findViewById(R.id.mountain);
        rain=findViewById(R.id.rain);
        study=findViewById(R.id.study);

        summer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String key="one";
                Intent i1=new Intent(getApplicationContext(),MainActivity.class);

                startActivity(i1);
            }
        });
        mountain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String key="two";Intent i2=new Intent(getApplicationContext(),MainActivity3.class);

                startActivity(i2);
            }
        });
        rain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String key="three";Intent i3=new Intent(getApplicationContext(),MainActivity4.class);

                startActivity(i3);
            }
        });
        study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String key="four";Intent i4=new Intent(getApplicationContext(),MainActivity5.class);

                startActivity(i4);
            }
        });

    }
}