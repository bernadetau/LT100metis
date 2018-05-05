package com.example.urvik_000.lt100metis;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class GameFragment extends Fragment{
    View myView;

    private QuestionLibrary QuestionLibrary = new QuestionLibrary();

    private TextView ScoreView;
    private TextView QuestionView;
    private Button ButtonChoice1;
    private Button ButtonChoice2;
    private Button ButtonChoice3;
    private Button QuitButton;

    private String Answer;
    private int Score = 0;
    private int QuestionNumber = 0;
    private int QuestionLibraryLength = QuestionLibrary.QuestionLibraryLength;

    Random r;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myView = inflater.inflate(R.layout.game_layout, container, false);

        r = new Random();

        ScoreView = myView.findViewById(R.id.score);
        QuestionView = myView.findViewById(R.id.question);
        ButtonChoice1 = myView.findViewById(R.id.choice1);
        ButtonChoice2 = myView.findViewById(R.id.choice2);
        ButtonChoice3 = myView.findViewById(R.id.choice3);
        QuitButton = myView.findViewById(R.id.quit);

        updateQuestion();

        //Start of Button Listener for Button1
        ButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (ButtonChoice1.getText() == Answer) {
                    Score = Score + 1;
                    updateScore(Score);
                    updateQuestion();
                    Toast.makeText(getActivity(), "Teisingai", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity(), "Neteisingai", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        ButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (ButtonChoice2.getText() == Answer) {
                    Score = Score + 1;
                    updateScore(Score);
                    updateQuestion();
                    Toast.makeText(getActivity(), "Teisingai", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity(), "Neteisingai", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        ButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (ButtonChoice3.getText() == Answer) {
                    Score = Score + 1;
                    updateScore(Score);
                    updateQuestion();
                    Toast.makeText(getActivity(), "Teisingai", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity(), "Neteisingai", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        QuitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                replaceFragment();
            }
        });
        return myView;
    }

        private void replaceFragment(){
            MainPageFragment pf = new MainPageFragment();
            FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.replace(R.id.mainFrame, pf);
            fragmentTransaction.commit();
        }

        //End of Button Listener for Button3

        private void updateQuestion(){
                QuestionView.setText(QuestionLibrary.getQuestion(QuestionNumber));
                ButtonChoice1.setText(QuestionLibrary.getChoice1(QuestionNumber));
                ButtonChoice2.setText(QuestionLibrary.getChoice2(QuestionNumber));
                ButtonChoice3.setText(QuestionLibrary.getChoice3(QuestionNumber));

                Answer = QuestionLibrary.getCorrectAnswer(QuestionNumber);
                QuestionNumber++;
                if(QuestionNumber==QuestionLibraryLength) gameOver();
        }

        private void gameOver(){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
            alertDialogBuilder.setMessage("Žaidimas baigtas! Jūsų taškai: " + Score +" ").setCancelable(false).setPositiveButton("Žaisti iš naujo", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    GameFragment gf = new GameFragment();
                    FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.replace(R.id.mainFrame, gf);
                    fragmentTransaction.commit();
                }
            })
                .setNegativeButton("Grįžti į pagrindinį puslapį", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        replaceFragment();
                    }
            });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }


        private void updateScore(int point) {
            ScoreView.setText("" + Score);
        }
    }

