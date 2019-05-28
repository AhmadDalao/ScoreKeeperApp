package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int teamAScore = 0;
    int teamBScore = 0;

    int teamAFouls = 0;
    int teamBFouls = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetScore(View view) {
        displayScoreTeamA(0);
        displayScoreTeamB(0);
        displayFoulsTeamA(0);
        displayFoulsTeamB(0);
    }

    public void displayScoreTeamA(int scoreA) {
        TextView ScoreA = (TextView) findViewById(R.id.ScoreTeamA);
        ScoreA.setText(String.valueOf(scoreA));
    }

    public void displayFoulsTeamA(int foulsA) {
        TextView foulA = (TextView) findViewById(R.id.foulTeamA);
        foulA.setText(String.valueOf(foulsA));
    }


    public void AddFoulTeamA(View view) {
        teamAFouls = teamAFouls + 1;
        displayFoulsTeamA(teamAFouls);
    }

    public void AddThreeTeamA(View view) {
        teamAScore = teamAScore + 3;
        displayScoreTeamA(teamAScore);
    }

    public void AddTwoTeamA(View view) {
        teamAScore = teamAScore + 2;
        displayScoreTeamA(teamAScore);
    }

    public void FreeThrowTeamA(View view) {
        teamAScore = teamAScore + 1;
        displayScoreTeamA(teamAScore);
    }

    public void displayScoreTeamB(int scoreB) {
        TextView ScoreB = (TextView) findViewById(R.id.ScoreTeamB);
        ScoreB.setText(String.valueOf(scoreB));
    }

    public void displayFoulsTeamB(int foulsB) {
        TextView foulA = (TextView) findViewById(R.id.foulTeamB);
        foulA.setText(String.valueOf(foulsB));
    }

    public void AddThreeTeamB(View view) {
        teamBScore = teamBScore + 3;
        displayScoreTeamB(teamBScore);
    }

    public void AddTwoTeamB(View view) {
        teamBScore = teamBScore + 2;
        displayScoreTeamB(teamBScore);
    }

    public void FreeThrowTeamB(View view) {
        teamBScore = teamBScore + 1;
        displayScoreTeamB(teamBScore);
    }

    public void AddFoulTeamB(View view) {
        teamBFouls = teamBFouls + 1;
        displayFoulsTeamB(teamBFouls);
    }


}
