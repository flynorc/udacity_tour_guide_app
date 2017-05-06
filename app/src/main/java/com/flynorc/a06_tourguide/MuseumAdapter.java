package com.flynorc.a06_tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Flynorc on 05-May-17.
 * custom ArrayAdapter to use in MuseumsFragment
 */
public class MuseumAdapter extends ArrayAdapter<Museum> {

    public MuseumAdapter(Activity context, ArrayList<Museum> museums) {
        super(context, 0, museums);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        //if list item view does not exist, inflate a new one from the layout file
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.museum_item, parent, false);
        }

        //get the current attraction object
        Museum currentAttraction = getItem(position);

        //update the fields in the listItem
        //bar name
        TextView museumNameView = (TextView) listItemView.findViewById(R.id.museum_name);
        museumNameView.setText(currentAttraction.getName());

        //address
        TextView museumAddressView = (TextView) listItemView.findViewById(R.id.museum_address);
        museumAddressView.setText(currentAttraction.getAddress());

        //opening times
        TextView museumOpeningView = (TextView) listItemView.findViewById(R.id.museum_opening);
        museumOpeningView.setText(currentAttraction.getOpeningHours());

        //description
        TextView museumDescriptionView = (TextView) listItemView.findViewById(R.id.museum_description);
        museumDescriptionView.setText(currentAttraction.getDescription());

        //category
        TextView museumCategoryView = (TextView) listItemView.findViewById(R.id.museum_category);
        museumCategoryView.setText(currentAttraction.getCategory());

        //image/logo
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.museum_image);
        imageView.setImageResource(currentAttraction.getThumbId());

        return listItemView;
    }
}
