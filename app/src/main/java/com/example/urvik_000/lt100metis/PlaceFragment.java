package com.example.urvik_000.lt100metis;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceFragment extends Fragment{
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView= inflater.inflate(R.layout.place_layout, container, false);

       // Bundle bundle = new Bundle();
        savedInstanceState = getArguments();
        int x = savedInstanceState.getInt("index");
        setPlace(x);

        return myView;
    }



    public void setPlace(int index){
        TextView tv = myView.findViewById(R.id.tw1);
        ImageView iv = myView.findViewById(R.id.imageView);

        switch (index){
            case 0: tv.setText("0");
                iv.setImageResource(R.drawable.didysisgetas);
                break;
            case 1: tv.setText("1");
                iv.setImageResource(R.drawable.faustina);
                break;
            case 2: tv.setText("2");
                iv.setImageResource(R.drawable.paminklasjurgaiciui);
                break;
            case 3: tv.setText("3");
                iv.setImageResource(R.drawable.kudirka);
                break;
            case 4: tv.setText("4");
                iv.setImageResource(R.drawable.laisveskelias);
                break;
            case 5: tv.setText("5");
                iv.setImageResource(R.drawable.lentabasanaviciui);
                break;
            case 6: tv.setText("6");
                iv.setImageResource(R.drawable.paminklaspopieziui);
                break;
            case 7: tv.setText("7");
                iv.setImageResource(R.drawable.prezidentura);
                break;
            case 8: tv.setText("8");
                iv.setImageResource(R.drawable.paminklassabadui);
                break;
            case 9: tv.setText("9");
                iv.setImageResource(R.drawable.seimorumai);
                break;
            case 10: tv.setText("10");
                iv.setImageResource(R.drawable.signatarunamai);
                break;
            case 11: tv.setText("11");
                iv.setImageResource(R.drawable.spaudosrumai);
                break;
            case 12: tv.setText("12");
                iv.setImageResource(R.drawable.paminklastremtiniams);
                break;
            case 13: tv.setText("13");
                iv.setImageResource(R.drawable.tvbokstas);
                break;
            case 14: tv.setText("14");
                iv.setImageResource(R.drawable.inskripcijosaukomsgedopr);
                break;
            case 15: tv.setText("15");
                iv.setImageResource(R.drawable.vingioparkas);
                break;
            case 16: tv.setText("16");
                iv.setImageResource(R.drawable.vvdg);
                break;
            case 17: tv.setText("17");
                iv.setImageResource(R.drawable.paminklaszemaiciui);
                break;
        }
    }
}
