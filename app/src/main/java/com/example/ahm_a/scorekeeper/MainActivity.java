package com.example.ahm_a.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int ausScore = 0;
    int ukScore = 0;

    public void doAusFivePoint(View view) {
        ausScore += 5;
        displayForAusScore(ausScore);
    }

    public void doAusThreePoint(View view) {
        ausScore += 3;
        displayForAusScore(ausScore);
    }

    public void doAusTwoPoint(View view) {
        ausScore += 2;
        displayForAusScore(ausScore);
    }
    public void displayForAusScore(int score) {
        TextView ausScoreGame = (TextView) findViewById(R.id.ausScore);
        ausScoreGame.setText(String.valueOf(score));
    }

    public void doUkFivePoint(View view) {
        ukScore += 5;
        displayForUkScore(ukScore);
    }

    public void doUkThreePoint(View view) {
        ukScore += 3;
        displayForUkScore(ukScore);
    }

    public void doUkTwoPoint(View view) {
        ukScore += 2;
        displayForUkScore(ukScore);
    }
    public void displayForUkScore(int score) {
        TextView ukScoreGame = (TextView) findViewById(R.id.ukScore);
        ukScoreGame.setText(String.valueOf(score));
    }

    public void doReset (View View){
        ausScore = 0;
        ukScore = 0;
        displayForAusScore(ausScore);
        displayForUkScore(ukScore);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
