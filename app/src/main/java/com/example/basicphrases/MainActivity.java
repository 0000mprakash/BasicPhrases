package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    public void playSound(View view){
        Button buttonpressed=(Button) view;
//        if was using image view to get the view of the button that is a point to learn
        mediaPlayer=MediaPlayer.create(this,getResources().getIdentifier(buttonpressed.getTag().toString() , "raw", getPackageName()));
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}