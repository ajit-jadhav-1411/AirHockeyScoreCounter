package com.example.ajit.airhockeyscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ajit.airhockeyscorecounter.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //score will be 0 first
    int scoreA = 0;
    int scoreB = 0;

    //scores for Team A

    public void displayForA(View view) {
        scoreA = scoreA + 1;
        displayScoreForA(scoreA);
    }


    public void displayScoreForA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.A_score);
        scoreView.setText(String.valueOf(score));
    }

    //scores for Team B

    public void displayForB(View view) {
        scoreB = scoreB + 1;
        displayScoreForB(scoreB);
    }



    public void reset(View v){
        scoreB = 0;
        scoreA = 0;
        /*TextView resetA = (TextView) findViewById(R.id.teamA_a_score);
        resetA.setText(String.valueOf(scoreA));
        TextView resetB = (TextView) findViewById(R.id.teamB_a_score);
        resetB.setText(String.valueOf(scoreB));*/
        displayScoreForA(scoreA); displayScoreForB(scoreB);
    }

    public void displayScoreForB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.B_score);
        scoreView.setText(String.valueOf(score));
    }
}
