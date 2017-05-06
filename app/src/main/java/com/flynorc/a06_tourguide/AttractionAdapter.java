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
 */
public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        //if list item view does not exist, inflate a new one from the layout file
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.attraction_item, parent, false);
        }

        //get the current attraction object
        Attraction currentAttraction = getItem(position);

        //update the fields in the listItem
        TextView attractionNameView = (TextView) listItemView.findViewById(R.id.attraction_name);
        attractionNameView.setText(currentAttraction.getName());

        //description
        TextView attractionDescriptionView = (TextView) listItemView.findViewById(R.id.attraction_description);
        attractionDescriptionView.setText(currentAttraction.getDescription());

        //image/logo
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.attraction_image);
        imageView.setImageResource(currentAttraction.getThumbId());

        return listItemView;
    }
}
