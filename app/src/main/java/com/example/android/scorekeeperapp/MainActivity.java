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

    /*
    this method reset the score for both teams for 0 when the button reset is clicked on
     */
    public void resetScore(View view) {
        displayScoreTeamA(0);
        displayScoreTeamB(0);
        displayFoulsTeamA(0);
        displayFoulsTeamB(0);
    }

    /**
     * @param scoreA takes in the score as an integer to be displayed on the screen later on.
     *               this method will only display the score for team A
     */
    public void displayScoreTeamA(int scoreA) {
        TextView ScoreA = (TextView) findViewById(R.id.ScoreTeamA);
        ScoreA.setText(String.valueOf(scoreA));
    }

    /**
     * @param foulsA takes in the fouls as an integer to be displayed on the screen later on.
     *               this method will only display the foulsA for team A
     */
    public void displayFoulsTeamA(int foulsA) {
        TextView foulA = (TextView) findViewById(R.id.foulTeamA);
        foulA.setText(String.valueOf(foulsA));
    }

    /*
    this method will increase the number of fouls team A has made
     */
    public void AddFoulTeamA(View view) {
        teamAFouls = teamAFouls + 1;
        displayFoulsTeamA(teamAFouls);
    }

    /*
    this method will increase the score for team A by 3
     */
    public void AddThreeTeamA(View view) {
        teamAScore = teamAScore + 3;
        displayScoreTeamA(teamAScore);
    }

    /*
        this method will increase the score for team A by 2
         */
    public void AddTwoTeamA(View view) {
        teamAScore = teamAScore + 2;
        displayScoreTeamA(teamAScore);
    }

    /*
        this method will increase the score for team A by 1
         */
    public void FreeThrowTeamA(View view) {
        teamAScore = teamAScore + 1;
        displayScoreTeamA(teamAScore);
    }

    /**
     * @param scoreB takes in the score as an integer to be displayed on the screen later on.
     *               this method will only display the score for team B
     */
    public void displayScoreTeamB(int scoreB) {
        TextView ScoreB = (TextView) findViewById(R.id.ScoreTeamB);
        ScoreB.setText(String.valueOf(scoreB));
    }

    /**
     * @param foulsB takes in the fouls as an integer to be displayed on the screen later on.
     *               this method will only display the foulsA for team B
     */
    public void displayFoulsTeamB(int foulsB) {
        TextView foulA = (TextView) findViewById(R.id.foulTeamB);
        foulA.setText(String.valueOf(foulsB));
    }

    /*
      this method will increase the score for team B by 3
       */
    public void AddThreeTeamB(View view) {
        teamBScore = teamBScore + 3;
        displayScoreTeamB(teamBScore);
    }

    /*
          this method will increase the score for team B by 2
           */
    public void AddTwoTeamB(View view) {
        teamBScore = teamBScore + 2;
        displayScoreTeamB(teamBScore);
    }

    /*
          this method will increase the score for team B by 1
           */
    public void FreeThrowTeamB(View view) {
        teamBScore = teamBScore + 1;
        displayScoreTeamB(teamBScore);
    }

    /*
        this method will increase the number of fouls team B has made
         */
    public void AddFoulTeamB(View view) {
        teamBFouls = teamBFouls + 1;
        displayFoulsTeamB(teamBFouls);
    }


}
