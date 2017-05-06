package com.flynorc.a06_tourguide;

import java.util.ArrayList;

/**
 * Created by Flynorc on 05-May-17.
 * Attraction class contains the basic attributes that all attractions have
 * It is extended by other more detailed classes as well as used for some basic attractions
 */

public class Attraction {

    private String mName;
    private String mDescription;
    private int mThumbId;

    public Attraction( String name, String description, int thumbId) {
        mName = name;
        mDescription = description;
        mThumbId = thumbId;
    }


    public String getName() {
        return mName;
    }

    public int getThumbId() {
        return mThumbId;
    }

    public String getDescription() {
        return mDescription;
    }



}
