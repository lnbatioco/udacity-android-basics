package com.loryleen.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // TODO: TeamA - display the score for Team A
    public void displayScoreTeamA(int score){
        TextView scoreTeamA = (TextView) findViewById(R.id.teamA_score);
        scoreTeamA.setText(String.valueOf(score));
    }

    // TODO: TeamA - three-pointer
    public void threePointerTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayScoreTeamA(scoreTeamA);
        Toast.makeText(this, "Team A scored 3 points!", Toast.LENGTH_SHORT).show();
    }

    // TODO: TeamA - two-pointer
    public void twoPointerTeamA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayScoreTeamA(scoreTeamA);
        Toast.makeText(this, "Team A scored 2 points!", Toast.LENGTH_SHORT).show();
    }

    // TODO: TeamA - free throw
    public void freeThrowTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA(scoreTeamA);
        Toast.makeText(this, "Team A scored 1 point!", Toast.LENGTH_SHORT).show();
    }

    // TODO: TeamB - display the score for Team B
    public void displayScoreTeamB(int score){
        TextView scoreTeamB = (TextView) findViewById(R.id.teamB_score);
        scoreTeamB.setText(String.valueOf(score));
    }

    // TODO: TeamB - three-pointer
    public void threePointerTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayScoreTeamB(scoreTeamB);
        Toast.makeText(this, "Team B scored 3 points!", Toast.LENGTH_SHORT).show();
    }

    // TODO: TeamB - two-pointer
    public void twoPointerTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayScoreTeamB(scoreTeamB);
        Toast.makeText(this, "Team B scored 2 points!", Toast.LENGTH_SHORT).show();
    }

    // TODO: TeamB - free throw
    public void freeThrowTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB(scoreTeamB);
        Toast.makeText(this, "Team B scored 1 point!", Toast.LENGTH_SHORT).show();
    }

    //TODO: Reset Scores
    public void resetScores(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        Toast.makeText(this, "Game reset", Toast.LENGTH_SHORT).show();
    }
}
