package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class ListNeighbourPagerAdapter extends FragmentPagerAdapter {


    ListNeighbourPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * getItem is called to instantiate the fragment for the given page.
     * @param position of page in ViewPager
     * @return new instance for each call has new page
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) return NeighbourFragment.newInstance(position);
        else return NeighbourFragment.newInstance(position);
    }

    /**
     * get the number of pages
     * @return number of pages in ViewPager
     */
    @Override
    public int getCount() {
        return 2;
    }
}