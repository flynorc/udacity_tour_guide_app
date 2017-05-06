package com.flynorc.a06_tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Flynorc on 04-May-17.
 * fragment to display all the bars with implementing a ListView with a custom adapter
 */
public class BarsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_layout, container, false);

        //create ArrayList of custom objects
        ArrayList<Bar> bars = new ArrayList<>();
        bars.add(new Bar(getString(R.string.haltestelle_name), getString(R.string.haltestelle_description), R.drawable.haltestelle, getString(R.string.haltestelle_opening) ,getString(R.string.haltestelle_address)));
        bars.add(new Bar(getString(R.string.krahvogel_name), getString(R.string.krahvogel_description), R.drawable.krahvogel, getString(R.string.krahvogel_opening), getString(R.string.krahvogel_address)));
        bars.add(new Bar(getString(R.string.blue_chip_name), getString(R.string.blue_chip_description), R.drawable.blue_chip, getString(R.string.blue_chip_opening), getString(R.string.blue_chip_address)));
        bars.add(new Bar(getString(R.string.hofgarten_name), getString(R.string.hofgarten_description), R.drawable.hofgarten, getString(R.string.hofgarten_opening), getString(R.string.hofgarten_address)));
        bars.add(new Bar(getString(R.string.theresienbrau_name), getString(R.string.theresienbrau_description), R.drawable.theresienbrau, getString(R.string.theresienbrau_opening), getString(R.string.theresienbrau_address)));

        //get the list view & add the custom adapter to it (to show the custom objects)
        BarAdapter attractionAdapter = new BarAdapter(getActivity(), bars);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(attractionAdapter);

        return rootView;
    }
}
