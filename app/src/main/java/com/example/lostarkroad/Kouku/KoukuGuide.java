package com.example.lostarkroad.Kouku;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.lostarkroad.Biackiss.BiackissPageAdapter;
import com.example.lostarkroad.R;
import com.google.android.material.tabs.TabLayout;

public class KoukuGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kouku_guide);

        ViewPager viewPager = (ViewPager) findViewById(R.id.kouku_vp);
        KoukuPageAdapter adapter = new KoukuPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);


    }
}