package com.example.urvik_000.lt100metis;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstRoutFragment extends Fragment{
    View myView;
    ListView listView;
    ArrayList<String> places = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        myView = inflater.inflate(R.layout.myroad_layout, container, false);

        ImageView iv2 = myView.findViewById(R.id.imageView2);
        iv2.setImageResource(R.drawable.trumpas_marsrutas);

        places.add(getString(R.string.spaudos_rumai));
        places.add(getString(R.string.tv_bokstas));
        places.add(getString(R.string.vingio_parkas));

        listView = myView.findViewById(R.id.list1);


        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, android.R.id.text1, places);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int itemPosition = position;

                Bundle bundle = new Bundle();
                PlaceFragment1 pf = new PlaceFragment1();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                bundle.putInt("index", itemPosition);
                pf.setArguments(bundle);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.replace(R.id.mainFrame, pf);
                fragmentTransaction.commit();
            }
        });
        return myView;}


    @Override
    public void onResume () {
        super.onResume();
        places = new ArrayList();
    }
}
