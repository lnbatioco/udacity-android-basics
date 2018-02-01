package com.loryleen.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // TODO: TeamA - display the score for Team A
    public void displayScoreTeamA(int score){
        TextView scoreTeamA = (TextView) findViewById(R.id.teamA_points);
        scoreTeamA.setText(String.valueOf(score));
    }

    // TODO: TeamA - three-pointer
    public void threePointer(View view){
        scoreTeamA = scoreTeamA + 3;
        displayScoreTeamA(scoreTeamA);
        Toast.makeText(this, "3 points scored!", Toast.LENGTH_SHORT).show();
    }

    // TODO: TeamA - two-pointer
    public void twoPointer(View view){
        scoreTeamA = scoreTeamA + 2;
        displayScoreTeamA(scoreTeamA);
        Toast.makeText(this, "2 points scored!", Toast.LENGTH_SHORT).show();
    }

    // TODO: TeamA - free throw
    public void freeThrow(View view){
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA(scoreTeamA);
        Toast.makeText(this, "1 point scored!", Toast.LENGTH_SHORT).show();
    }
}
