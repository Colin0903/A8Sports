package com.company.a8sports.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.company.a8sports.R;
import com.company.a8sports.fragment.AttentionFragment;
import com.company.a8sports.fragment.BaseFragment;
import com.company.a8sports.fragment.MatchFragment;
import com.company.a8sports.fragment.MimeFragment;
import com.company.a8sports.fragment.NewsFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<BaseFragment>fragments=new ArrayList<>();
    private int pos;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragment();
        initView();
        changeShowFragment(0);
    }

    private void initView() {
        radioGroup = (RadioGroup) findViewById(R.id.main_radiogroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.main_radioMatch:
                        changeShowFragment(0);
                        break;
                    case R.id.main_radioNews:
                        changeShowFragment(1);
                        break;
                    case R.id.main_radioAttention:
                        changeShowFragment(2);
                        break;
                    case R.id.main_radioMime:
                        changeShowFragment(3);
                        break;
                    default:
                        break;
                }
            }
        });
    }

    private void initFragment() {
        fragments.add(new MatchFragment());
        fragments.add(new NewsFragment());
        fragments.add(new AttentionFragment());
        fragments.add(new MimeFragment());
        getSupportFragmentManager().beginTransaction().add(R.id.main_layout,fragments.get(0)).commit();
    }

    private void changeShowFragment(int current) {
         if(pos!=current){
             FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
             if(fragments.get(current).isAdded()){
                 transaction.show(fragments.get(current)).hide(fragments.get(pos)).commit();
             }else{
                 transaction.add(R.id.main_layout,fragments.get(current)).hide(fragments.get(pos)).commit();
             }
             pos=current;
         }
    }


}
