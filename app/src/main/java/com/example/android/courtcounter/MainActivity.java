package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // global variables to store scores of both teams
    int scoreBoardA;
    int scoreBoardB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Function to calculate score for both teams whenever a button is pressed
     * and update the screen accordingly.
     *
     * @param v ,where v is the view clicked
     */
    public void updatePoints(View v) {

        // to find if its a 1, 2 or 3 pointer
        switch (v.getId()) {
            case R.id.team_a_1:
                scoreBoardA += 1;
                break;
            case R.id.team_a_2:
                scoreBoardA += 2;
                break;
            case R.id.team_a_3:
                scoreBoardA += 3;
                break;
            case R.id.team_b_1:
                scoreBoardB += 1;
                break;
            case R.id.team_b_2:
                scoreBoardB += 2;
                break;
            case R.id.team_b_3:
                scoreBoardB += 3;
                break;
        }

        // display updated scores
        displayScores();
    }


    /**
     * Function to reset scores of both teams when
     * reset button is clicked.
     *
     * @param v ,where v is the view clicked
     */
    public void reset(View v) {

        // reset scores to zero for both teams
        scoreBoardA = 0;
        scoreBoardB = 0;

    }

    /**
     * Function to display current scores for both teams on the screen.
     */
    public void displayScores() {
        TextView scoreA = (TextView) findViewById(R.id.scoreA);
        TextView scoreB = (TextView) findViewById(R.id.scoreB);

        // display updated scores for both teams
        scoreA.setText(String.format(getResources().getString(R.string.display_score), scoreBoardA));
        scoreB.setText(String.format(getResources().getString(R.string.display_score), scoreBoardB));
    }

}
