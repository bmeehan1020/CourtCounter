package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    int teamA_Score = 0;
    int teamB_Score = 0;

    public void touchdownA(View view){
        teamA_Score += 6;
        displayForTeamA(teamA_Score);
    }

    public void fieldGoalA(View view){
        teamA_Score += 3;
        displayForTeamA(teamA_Score);
    }

    public void extraPointsA(View view){
        teamA_Score += 1;
        displayForTeamA(teamA_Score);
    }

    public void safetyA(View view){
        teamA_Score += 2;
        displayForTeamA(teamA_Score);
    }

    public void touchdownB(View view){
        teamB_Score += 6;
        displayForTeamB(teamB_Score);
    }

    public void fieldGoalB(View view){
        teamB_Score += 3;
        displayForTeamB(teamB_Score);
    }

    public void extraPointsB(View view){
        teamB_Score += 1;
        displayForTeamB(teamB_Score);
    }

    public void safetyB(View view){
        teamB_Score += 2;
        displayForTeamB(teamB_Score);
    }

    public void resetScore(View view){
        teamA_Score = 0;
        teamB_Score = 0;
        displayForTeamA(teamA_Score);
        displayForTeamB(teamB_Score);
    }

    public void displayForTeamA(int teamA_Score){
        TextView scoreView = (TextView) findViewById(R.id.teamA_score);
        scoreView.setText(String.valueOf(teamA_Score));
    }

    void displayForTeamB(int teamB_Score){
        TextView scoreView = (TextView) findViewById(R.id.teamB_score);
        scoreView.setText(String.valueOf(teamB_Score));
    }

}
