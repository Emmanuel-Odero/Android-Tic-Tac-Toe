package com.odero.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView button1,button2,button3,button4,button5,button6,button7,button8,button9;
    private String startGame = "X";
    int b1=5, b2=5,b3=5, b4=5, b7=5, b8=5, b9=5, xCount=0, oCount=0, i=0;
    private TextView scorex, scoreo;
    private Button resetGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.buttonImage1);
        button2 = findViewById(R.id.buttonImage2);
        button3 = findViewById(R.id.buttonImage3);
        button4 = findViewById(R.id.buttonImage4);
        button5 = findViewById(R.id.buttonImage5);
        button6 = findViewById(R.id.buttonImage6);
        button7 = findViewById(R.id.buttonImage7);
        button8 = findViewById(R.id.buttonImage8);
        button9 = findViewById(R.id.buttonImage9);

        scorex = findViewById(R.id.scoreX);
        scoreo = findViewById(R.id.scoreY);

        resetGame = findViewById(R.id.resetButton);

    }
}