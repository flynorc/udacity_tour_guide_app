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
 * fragment to display all the sports with implementing a ListView with a custom adapter
 */
public class SportsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_layout, container, false);

        //create ArrayList of custom objects
        ArrayList<Attraction> sports = new ArrayList<>();
        sports.add(new Attraction(getString(R.string.skiing_name), getString(R.string.skiing_description), R.drawable.skiing));
        sports.add(new Attraction(getString(R.string.hiking_name), getString(R.string.hiking_description), R.drawable.hiking));
        sports.add(new Attraction(getString(R.string.climbing_name), getString(R.string.climbing_description), R.drawable.climbing));
        sports.add(new Attraction(getString(R.string.biking_name), getString(R.string.biking_description), R.drawable.biking));

        //get the list view & add the custom adapter to it (to show the custom objects)
        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), sports);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(attractionAdapter);

        return rootView;
    }
}
