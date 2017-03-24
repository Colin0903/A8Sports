package com.company.a8sports.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.company.a8sports.R;
import com.company.a8sports.adapter.MatchFragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Czeal on 2017/2/28.
 */

public class MatchFragment extends BaseFragment {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private List<Fragment>fragments=new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_match,container,false);
        initView(view);
        return view;
    }

    @Override
    public void initView() {

    }

    private void initView(View view) {
        fragments.add(new MatchHotFragment());
        fragments.add(new MatchAllFragment());
        viewPager = (ViewPager) view.findViewById(R.id.match_vp1);
        tabLayout = (TabLayout) view.findViewById(R.id.match_headTab);
        viewPager.setAdapter(new MatchFragmentPagerAdapter(getFragmentManager(),fragments));
        setTabLayout();
        tabLayout.setupWithViewPager(viewPager,true);
    }

    //设置标题书签
    public void setTabLayout(){
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
//        tabLayout.setTabTextColors(Color.YELLOW,Color.WHITE);
        tabLayout.setSelectedTabIndicatorColor(Color.YELLOW);
    }
}
