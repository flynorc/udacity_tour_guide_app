package com.flynorc.a06_tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Flynorc on 06-May-17.
 * fragment to display all the sights with implementing a ListView with a custom adapter
 */
public class SightsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_layout, container, false);

        //create ArrayList of custom objects
        ArrayList<Attraction> sights = new ArrayList<>();
        sights.add(new Attraction(getString(R.string.gold_roof_name), getString(R.string.gold_roof_description), R.drawable.golden_roof));
        sights.add(new Attraction(getString(R.string.hottinger_alm_name), getString(R.string.hottinger_alm_description), R.drawable.hottinger_alm));
        sights.add(new Attraction(getString(R.string.wilten_basilica_name), getString(R.string.wilten_basilica_description), R.drawable.wilten_basilica));
        sights.add(new Attraction(getString(R.string.ski_jump_name), getString(R.string.ski_jump_description), R.drawable.ski_jump));

        //get the list view & add the custom adapter to it (to show the custom objects)
        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), sights);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(attractionAdapter);

        return rootView;
    }
}
