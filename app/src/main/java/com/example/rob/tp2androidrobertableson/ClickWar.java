package com.example.rob.tp2androidrobertableson;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class ClickWar extends AppCompatActivity {

    int m_NombreClics;
    boolean m_JeuEnCours,  m_CountdownTimerFini, m_BoutonActif;
    TextView m_LblInfo;
    TextView m_LblNombreClics;
    TextView m_LblTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_war);

        m_NombreClics = 0;
        m_JeuEnCours = false;
        m_BoutonActif = true;
        m_CountdownTimerFini = false;
        m_LblInfo = (TextView) findViewById(R.id.lblInfo);
        m_LblNombreClics = (TextView) findViewById(R.id.lblNombreClics);
        m_LblTimer = (TextView) findViewById(R.id.lblTimer);
    }

    public void boutonClic(View view){
        //démarrage du jeu
        if(!m_JeuEnCours && m_BoutonActif){
            m_JeuEnCours = true;
            partirTimerCountdown();
        }else{
            if(m_CountdownTimerFini && m_BoutonActif){
                m_NombreClics++;
                m_LblNombreClics.setText("" + m_NombreClics);
            }
        }
    }

    private void partirTimerCountdown(){
        new CountDownTimer(5000, 100) {
            public void onTick(long millisUntilFinished) {
                m_LblInfo.setText("La partie commence dans: " + (millisUntilFinished + 1000) / 1000);
            }

            public void onFinish() {
                m_LblInfo.setText("Record à battre: 33");
                m_CountdownTimerFini = true;
                partirTimerJeu();
            }
        }.start();
    }

    private void partirTimerJeu(){
        final int tempsJeuSec = 10;

        new CountDownTimer(tempsJeuSec * 1000, 10) {
            public void onTick(long millisUntilFinished) {
                long sec = millisUntilFinished / 1000;
                long milli = millisUntilFinished;

                    m_LblTimer.setText("" + (tempsJeuSec - sec - 1) + "." + ((1000 - (millisUntilFinished - ((millisUntilFinished / 1000) * 1000))/* - (millisUntilFinished % (millisUntilFinished / 1000))*/)));
                /*else
                    m_LblTimer.setText("0." + (1 - millisUntilFinished));*/
            }

            public void onFinish() {
                afficherScore();
                m_JeuEnCours = false;
                m_BoutonActif = false;
                m_LblNombreClics.setText("" + m_NombreClics + " clics!");
                m_LblTimer.setText("Terminé!");

                new CountDownTimer(5 * 1000, 10) {
                    public void onTick(long millisUntilFinished) {}

                    public void onFinish() {
                        reeinitialiserJeu();
                    }
                }.start();
            }
        }.start();
    }

    private void afficherScore(){

    }

    private void reeinitialiserJeu(){
        m_LblInfo.setText("Cliquez le bouton pour commencer la partie.");
        m_LblTimer.setText("00:00");
        m_LblNombreClics.setText("");

        m_NombreClics = 0;
        m_JeuEnCours = false;
        m_CountdownTimerFini = false;
        m_BoutonActif = true;
    }
}
