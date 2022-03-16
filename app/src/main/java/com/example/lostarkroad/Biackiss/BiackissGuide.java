package com.example.lostarkroad.Biackiss;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.lostarkroad.R;
import com.google.android.material.tabs.TabLayout;

public class BiackissGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biackiss_guide);

        ViewPager viewPager = (ViewPager) findViewById(R.id.Biackiss_vp);
        BiackissPageAdapter adapter = new BiackissPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);


    }
}