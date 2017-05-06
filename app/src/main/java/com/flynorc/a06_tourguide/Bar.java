package com.flynorc.a06_tourguide;

/**
 * Created by Flynorc on 05-May-17.
 * Bar class adds some additional attributes to the Attraction class
 * and the getter methods for those attributes
 */

public class Bar extends Attraction {
    private String mOpeningHours;
    private String mAddress;

    public Bar(String name, String description, int thumbnailId, String openingHours, String address) {
        super(name, description, thumbnailId);

        mOpeningHours = openingHours;
        mAddress = address;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getOpeningHours() {
        return mOpeningHours;
    }
}
