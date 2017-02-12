package com.example.rob.tp2androidrobertableson;

import android.content.Intent;
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
        Intent clickWarIntent = new Intent(this, ClickWar.class);
        startActivity(clickWarIntent);
    }

    public void openLaPetiteDevinette(View view){
        Intent petiteDevinetteIntent = new Intent(this, PetiteDevinette.class);
        startActivity(petiteDevinetteIntent);
    }

    public void openLuniversMeRepondra(View view){
        Intent reponseUniversIntent = new Intent(this, ReponseUnivers.class);
        startActivity(reponseUniversIntent);
    }

    public void gameOver(View view){
        Log.d("allo", "game over");
    }

}
