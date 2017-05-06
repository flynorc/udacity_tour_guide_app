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
 * custom ArrayAdapter to use in BarsFragment
 */
public class BarAdapter extends ArrayAdapter<Bar> {

    public BarAdapter(Activity context, ArrayList<Bar> bars) {
        super(context, 0, bars);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        //if list item view does not exist, inflate a new one from the layout file
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.bar_item, parent, false);
        }

        //get the current attraction object
        Bar currentAttraction = getItem(position);

        //update the fields in the listItem
        //bar name
        TextView barNameView = (TextView) listItemView.findViewById(R.id.bar_name);
        barNameView.setText(currentAttraction.getName());

        //address
        TextView barAddressView = (TextView) listItemView.findViewById(R.id.bar_address);
        barAddressView.setText(currentAttraction.getAddress());

        //opening times
        TextView barOpeningView = (TextView) listItemView.findViewById(R.id.bar_opening);
        barOpeningView.setText(currentAttraction.getOpeningHours());

        //description
        TextView barDescriptionView = (TextView) listItemView.findViewById(R.id.bar_description);
        barDescriptionView.setText(currentAttraction.getDescription());

        //image/logo
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.bar_image);
        imageView.setImageResource(currentAttraction.getThumbId());

        return listItemView;
    }
}
