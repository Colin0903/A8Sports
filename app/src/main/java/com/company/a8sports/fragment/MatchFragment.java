package com.company.a8sports.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.company.a8sports.R;

/**
 * Created by Czeal on 2017/2/28.
 */

public class MatchFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_match,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {

    }
}
