package com.flynorc.a06_tourguide;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Flynorc on 04-May-17.
 * Custom FragmentPagerAdapter to manage the Fragments (showing correct fragment on swiping or selecting an item from tab menu)
 */

public class TourGuideFragmentPageAdapber extends FragmentPagerAdapter {
    Context context;

    public TourGuideFragmentPageAdapber(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    //define which fragment will be shown at what position (page) of the FragmentPageAdapter
    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return new SportsFragment();
            case 1:
                return new MuseumsFragment();
            case 2:
                return new SightsFragment();
            case 3:
                return new BarsFragment();
            default:
                return null;
        }
    }

    //define number of "pages"
    @Override
    public int getCount() {
        return 4;
    }

    //define the titles for each page (shown as tabs)
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return context.getString(R.string.tab_sports);
            case 1:
                return context.getString(R.string.tab_museums);
            case 2:
                return context.getString(R.string.tab_sights);
            case 3:
                return context.getString(R.string.tab_bars);
            default:
                return null;
        }
    }
}
