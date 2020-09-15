package com.example.diceexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();

    MediaPlayer mySound;
    MediaPlayer miss;
    MediaPlayer hit;
//    TextView textElement = (TextView) findViewById(R.id.txt);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySound = MediaPlayer.create(MainActivity.this,R.raw.shake_dice);
        miss = MediaPlayer.create(MainActivity.this,R.raw.miss);
        hit = MediaPlayer.create(MainActivity.this,R.raw.hit);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
                mySound.start();
            }
        });
    }

//    public void playIT(View v){
//            mySound.start();
//    }
    private void rollDice(){
        int randomNumber = rng.nextInt(20)+1;
        TextView textElement = (TextView) findViewById(R.id.txt);


        switch (randomNumber){
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                miss.start();
//                TextView textElement = (TextView) findViewById(R.id.txt);
                textElement.setText(R.string.crit_miss);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                textElement.setText(R.string.empty_string);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                textElement.setText(R.string.empty_string);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                textElement.setText(R.string.empty_string);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                textElement.setText(R.string.empty_string);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                textElement.setText(R.string.empty_string);
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                textElement.setText(R.string.empty_string);
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                textElement.setText(R.string.empty_string);
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                textElement.setText(R.string.empty_string);
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                textElement.setText(R.string.empty_string);
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                textElement.setText(R.string.empty_string);
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                textElement.setText(R.string.empty_string);
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                textElement.setText(R.string.empty_string);
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                textElement.setText(R.string.empty_string);
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                textElement.setText(R.string.empty_string);
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                textElement.setText(R.string.empty_string);
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                textElement.setText(R.string.empty_string);
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                textElement.setText(R.string.empty_string);
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                textElement.setText(R.string.empty_string);
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.dice20);
                hit.start();
                textElement.setText(R.string.crit_hit);
                break;

        }
    }
    public class SplashActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

}

