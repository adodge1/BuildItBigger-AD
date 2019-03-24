package com.example.jokecorelib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    public static final String JOKE_KEY = "jokeKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);


        TextView textview = findViewById(R.id.tv_joke);

        Intent intent = getIntent();
        String JokeResult = intent.getStringExtra(JOKE_KEY);



        if (JokeResult != null) {
            textview.setText(JokeResult);
        } else {
            textview.setText("Error: We could not find any jokes");
        }



    }
}
