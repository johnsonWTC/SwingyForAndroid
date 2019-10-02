package com.example.swingyforandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button upButton;
    Button downBtton;
    Button leftButton;
    Button rightBtton;
    Button quitButton;
    TextView displayText;
    int villenHeath = 10;
    int herroHealth = 50;
    int herroPower = 30;
    int villenPower = 10;
    int portion = 3;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
        upButton = (Button) findViewById(R.id.upButton);
        downBtton = (Button) findViewById(R.id.downButton);
        rightBtton = (Button) findViewById(R.id.rightButton);
        leftButton = (Button) findViewById(R.id.leftButton);
        quitButton = (Button) findViewById(R.id.quitButton);
        displayText = (TextView) findViewById(R.id.display_text);
        displayText.setText("");

//        while (herroHealth >= 0) {
//
//            displayText.setText(" a villen has appeared\n what would you like to do");
//
//
//        }






                View.OnClickListener leftmovent = new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        villenHeath = villenHeath - herroPower;
                        herroHealth = herroHealth - villenPower;
                        if (villenHeath <= 0)
                            displayText.setText("the villen has died");



                    }
                };

                View.OnClickListener upmovent = new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        villenHeath = villenHeath - herroPower;
                        herroHealth = herroHealth - villenPower;
                        if (villenHeath <= 0)
                            displayText.setText("the villen has died");

                    }
                };


                View.OnClickListener rightmovent = new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        villenHeath = villenHeath - herroPower;
                        herroHealth = herroHealth - villenPower;
                        if (villenHeath <= 0)
                            displayText.setText("the villen has died");

                    }
                };


                View.OnClickListener downmovent = new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        villenHeath = villenHeath - herroPower;
                        herroHealth = herroHealth - villenPower;
                        if (villenHeath <= 0)
                            displayText.setText("the villen has died");

                    }
                };


                upButton.setOnClickListener(upmovent);
                downBtton.setOnClickListener(downmovent);
                rightBtton.setOnClickListener(rightmovent);
                leftButton.setOnClickListener(leftmovent);

            }


        }

