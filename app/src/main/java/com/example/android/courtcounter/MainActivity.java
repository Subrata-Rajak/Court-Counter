package com.example.android.courtcounter;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar;
        actionBar = getSupportActionBar();

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FF9800"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);

        final Button increase_three_point_a = findViewById(R.id.three_points);
        final Button increase_two_point_a = findViewById(R.id.two_points);
        final Button increase_one_point_a = findViewById(R.id.one_point);
        final Button increase_three_point_b = findViewById(R.id.three_points_b);
        final Button increase_two_point_b = findViewById(R.id.two_points_b);
        final Button increase_one_point_b = findViewById(R.id.one_point_b);
        final Button reset_the_score = findViewById(R.id.reset_scores);
        increase_three_point_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 3;
                displayForTeamA(scoreTeamA);
            }
        });
        increase_two_point_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 2;
                displayForTeamA(scoreTeamA);
            }
        });
        increase_one_point_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 1;
                displayForTeamA(scoreTeamA);
            }
        });
        increase_three_point_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 3;
                displayForTeamB(scoreTeamB);
            }
        });
        increase_two_point_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 2;
                displayForTeamB(scoreTeamB);
            }
        });
        increase_one_point_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 1;
                displayForTeamB(scoreTeamB);
            }
        });
        reset_the_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB = 0;
                scoreTeamA = 0;
                displayForTeamB(scoreTeamB);
                displayForTeamA(scoreTeamA);
            }
        });
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}