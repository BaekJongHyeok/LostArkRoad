package com.example.lostarkroad.Abrelshud;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.lostarkroad.Biackiss.BiackissPageAdapter;
import com.example.lostarkroad.R;
import com.google.android.material.tabs.TabLayout;

public class AbrelshudGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abrelshud_guide);

        ViewPager viewPager = (ViewPager) findViewById(R.id.Abrelshud_vp);
        AbrelshudPageAdapter adapter = new AbrelshudPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);


    }
}