package com.loryleen.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayScoreTeamA(scoreA);
    }

    // TODO: display the score for Team A
    public void displayScoreTeamA(int score){
        TextView scoreTeamA = (TextView) findViewById(R.id.teamA_points);
        scoreTeamA.setText(String.valueOf(score));
    }

    // TODO: three-pointer
    public void threePointer(View view){
        scoreA = scoreA + 3;
        displayScoreTeamA(scoreA);
        Toast.makeText(this, "3 points scored!", Toast.LENGTH_SHORT).show();
    }

    // TODO: two-pointer
    public void twoPointer(View view){
        scoreA = scoreA + 2;
        displayScoreTeamA(scoreA);
        Toast.makeText(this, "2 points scored!", Toast.LENGTH_SHORT).show();
    }

    // TODO: free throw
    public void freeThrow(View view){
        scoreA = scoreA + 1;
        displayScoreTeamA(scoreA);
        Toast.makeText(this, "1 point scored!", Toast.LENGTH_SHORT).show();
    }
}
