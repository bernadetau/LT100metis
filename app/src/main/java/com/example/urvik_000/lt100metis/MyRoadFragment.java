package com.example.urvik_000.lt100metis;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.content.Context.LOCATION_SERVICE;

public class MyRoadFragment extends Fragment{

    View myView;
    ListView listView;
    ArrayList<String> places = new ArrayList<>();

    private LocationManager locationManager;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

                myView = inflater.inflate(R.layout.myroad_layout, container, false);

            places.add(getString(R.string.didysis_getas));
            places.add(getString(R.string.faustinos_paminklas));
            places.add(getString(R.string.jurgaiciui_paminklas));
            places.add(getString(R.string.kudirkos_paminklas));
            places.add(getString(R.string.laisves_kelias));
            places.add(getString(R.string.lenta_basanaviciui));
            places.add(getString(R.string.popieziui_paminklas));
            places.add(getString(R.string.prezidentura));
            places.add(getString(R.string.sabadui_paminklas));
            places.add(getString(R.string.seimo_rumai));
            places.add(getString(R.string.signataru_namai));
            places.add(getString(R.string.spaudos_rumai));
            places.add(getString(R.string.tremtiniams));
            places.add(getString(R.string.tv_bokstas));
            places.add(getString(R.string.vardu_lenteles));
            places.add(getString(R.string.vingio_parkas));
            places.add(getString(R.string.vvdg));
            places.add(getString(R.string.zemaiciui_paminklas));

            listView = myView.findViewById(R.id.list1);

            // Define a new Adapter
            // First parameter - Context
            // Second parameter - Layout for the row
            // Third parameter - ID of the TextView to which the data is written
            // Forth - the Array of data

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                    android.R.layout.simple_list_item_1, android.R.id.text1, places);


            // Assign adapter to ListView
            listView.setAdapter(adapter);

            // ListView Item Click Listener
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    int itemPosition     = position;

                    Bundle bundle = new Bundle();
                    PlaceFragment pf = new PlaceFragment();
                    FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                    bundle.putInt("index", itemPosition);
                    pf.setArguments(bundle);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.replace(R.id.mainFrame, pf);
                    fragmentTransaction.commit();
                }
            });
        return myView;
    }
        @Override
        public void onResume() {
            // TODO Auto-generated method stub
            super.onResume();
            places = new ArrayList();
        }
}
