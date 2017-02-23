package com.example.rob.tp2androidrobertableson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {

    private Socket m_clientSocket = null;
    private DataInputStream m_inClient = null;
    private PrintStream m_outClient = null;
    private DataOutputStream m_DOS = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*try{
            m_clientSocket = new Socket("196.168.2.18", 2000);
           /* m_DOS = new DataOutputStream(m_clientSocket.getOutputStream());
            m_DOS.writeUTF("coucou");
            m_clientSocket.close();
            Log.d("CONNECTÉ AU SERVEUR", "ALLO");
        }
        catch(Exception ex){
            Log.d("ERROR", ex.getMessage());
        }*/


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
