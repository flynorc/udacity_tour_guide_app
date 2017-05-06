package com.flynorc.a06_tourguide;

/**
 * Created by Flynorc on 06-May-17.
 * Museum class adds some additional attributes to the Attraction class
 * and the getter methods for those attributes
 */

public class Museum extends Attraction {
    private String mOpeningHours;
    private String mAddress;
    private String mCategory;

    public Museum(String name, String description, int thumbnailId, String openingHours, String address, String category) {
        super(name, description, thumbnailId);

        mOpeningHours = openingHours;
        mAddress = address;
        mCategory = category;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getOpeningHours() {
        return mOpeningHours;
    }
    public String getCategory() {
        return mCategory;
    }

}