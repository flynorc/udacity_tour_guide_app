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
 * fragment to display all the museums with implementing a ListView with a custom adapter
 */
public class MuseumsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_layout, container, false);

        //create ArrayList of custom objects
        ArrayList<Museum> museums = new ArrayList<>();
        museums.add(new Museum(getString(R.string.schloss_ambras_name), getString(R.string.schloss_ambras_description), R.drawable.schloss_ambras, getString(R.string.schloss_ambras_opening), getString(R.string.schloss_ambras_address), getString(R.string.schloss_ambras_category)));
        museums.add(new Museum(getString(R.string.tirol_panorama_name), getString(R.string.tirol_panorama_description), R.drawable.tirol_panorama, getString(R.string.tirol_panorama_opening), getString(R.string.tirol_panorama_address), getString(R.string.tirol_panorama_category)));
        museums.add(new Museum(getString(R.string.art_museum_name), getString(R.string.art_museum_description), R.drawable.art_museum, getString(R.string.art_museum_opening), getString(R.string.art_museum_address), getString(R.string.art_museum_category)));
        museums.add(new Museum(getString(R.string.audioversum_name), getString(R.string.audioversum_description), R.drawable.audioversum, getString(R.string.audioversum_opening), getString(R.string.audioversum_address), getString(R.string.audioversum_category)));
        museums.add(new Museum(getString(R.string.bell_museum_name), getString(R.string.bell_museum_description), R.drawable.grassmayr, getString(R.string.bell_museum_opening), getString(R.string.bell_museum_address), getString(R.string.bell_museum_category)));

        //get the list view & add the custom adapter to it (to show the custom objects)
        MuseumAdapter attractionAdapter = new MuseumAdapter(getActivity(), museums);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(attractionAdapter);

        return rootView;
    }
}
