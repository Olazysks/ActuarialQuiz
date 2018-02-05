package com.example.android.actuarialquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    private String username;
    private int score;
    private TextView message;

    /**
     * OnCreate method was updated to read int score and String username from previous activity - QuizActivity.
     * Having that message to the User was created and displayed in the R.id.message using quizSummary method.
     *
     * @param savedInstanceState Bundle: if the activity is being re-initialized after previously
     *                           being shut down then this Bundle contains the data it most recently
     *                           supplied in onSaveInstanceState(Bundle). Note: Otherwise it is null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        username = getIntent().getStringExtra("username");
        score = getIntent().getIntExtra("score", 0);
        message = findViewById(R.id.message);
        message.setText(quizSummary());
    }

    /**
     * Creates summary of the quiz.
     */
    private String quizSummary() {
        String message = username + ",";
        message += "\n" + getString(R.string.congrats);
        message += "\n" + getString(R.string.score_message) + " " + score;
        message += "\n" + "\n" + getString(R.string.thx) + "  " + "😀";
        return message;
    }

    /**
     * This method ends the app
     *
     * @param view
     */
    public void exit(View view) {

        finish();
        moveTaskToBack(true);
    }
}
