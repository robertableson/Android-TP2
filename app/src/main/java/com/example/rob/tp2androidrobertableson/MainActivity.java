package com.example.rob.tp2androidrobertableson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openClickWar(View view){
        Log.d("allo", "click war");
    }

    public void openLaPetiteDevinette(View view){
        Log.d("allo", "la petite devinette");
    }

    public void openLuniversMeRepondra(View view){
        Log.d("allo", "Allo L'univers!!!!!!!!!!!!!");
    }

    public void gameOver(View view){
        Log.d("allo", "game over");
    }

}
