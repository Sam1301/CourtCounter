package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreBoardA;
    int scoreBoardB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void updateTeamA(View v){

        TextView scoreA = (TextView) findViewById(R.id.scoreA);
        switch(v.getId()){
            case R.id.teamA1:
                scoreBoardA += 1;
                break;
            case R.id.teamA2:
                scoreBoardA += 2;
                break;
            case R.id.teamA3:
                scoreBoardA += 3;
                break;
        }
        scoreA.setText(scoreBoardA + "");
    }
    public void updateTeamB(View v){

        TextView scoreB = (TextView) findViewById(R.id.scoreB);
        switch(v.getId()){
            case R.id.teamB1:
                scoreBoardB += 1;
                break;
            case R.id.teamB2:
                scoreBoardB += 2;
                break;
            case R.id.teamB3:
                scoreBoardB += 3;
                break;
        }
        scoreB.setText(scoreBoardB + "");
    }

    public void reset(View v){
        TextView scoreA = (TextView) findViewById(R.id.scoreA);
        TextView scoreB = (TextView) findViewById(R.id.scoreB);
        scoreBoardA = 0;
        scoreBoardB = 0;
        scoreA.setText(scoreBoardA + "");
        scoreB.setText(scoreBoardB + "");
    }

}
