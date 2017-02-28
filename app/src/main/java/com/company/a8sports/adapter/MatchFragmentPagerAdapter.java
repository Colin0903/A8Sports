package com.company.a8sports.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Czeal on 2017/2/28.
 */

public class MatchFragmentPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment>fragments;
    private String[]titles={"热门","全部"};
    public MatchFragmentPagerAdapter(FragmentManager fm,List<Fragment>fragments) {
        super(fm);
        this.fragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size()==0?0:fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
