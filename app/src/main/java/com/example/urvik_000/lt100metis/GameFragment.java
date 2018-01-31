package com.example.urvik_000.lt100metis;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameFragment extends Fragment{
    View myView;

    private QuestionLibrary QuestionLibrary = new QuestionLibrary();

    private TextView ScoreView;
    private TextView QuestionView;
    private Button ButtonChoice1;
    private Button ButtonChoice2;
    private Button ButtonChoice3;

    private String Answer;
    private int Score = 0;
    private int QuestionNumber = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myView = inflater.inflate(R.layout.game_layout, container, false);

        ScoreView = myView.findViewById(R.id.score);
        QuestionView = myView.findViewById(R.id.question);
        ButtonChoice1 = myView.findViewById(R.id.choice1);
        ButtonChoice2 = myView.findViewById(R.id.choice2);
        ButtonChoice3 = myView.findViewById(R.id.choice3);

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
                    //This line of code is optiona
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
                    //This line of code is optiona
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
                    //This line of code is optiona
                    Toast.makeText(getActivity(), "Teisingai", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getActivity(), "Neteisingai", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        return myView;
    }

        //End of Button Listener for Button3

        private void updateQuestion(){
            QuestionView.setText(QuestionLibrary.getQuestion(QuestionNumber));
            ButtonChoice1.setText(QuestionLibrary.getChoice1(QuestionNumber));
            ButtonChoice2.setText(QuestionLibrary.getChoice2(QuestionNumber));
            ButtonChoice3.setText(QuestionLibrary.getChoice3(QuestionNumber));

            Answer = QuestionLibrary.getCorrectAnswer(QuestionNumber);
            QuestionNumber++;
        }


        private void updateScore(int point) {
            ScoreView.setText("" + Score);
        }
    }

