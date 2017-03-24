package com.company.a8sports.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.company.a8sports.R;

/**
 * Created by Czeal on 2017/2/28.
 *
 */

public abstract class BaseFragment extends Fragment{

    //fragment第一次连接时调用的方法  onAttach()
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_base,container,false);
        return view;
    }
    public abstract void initView();
}
