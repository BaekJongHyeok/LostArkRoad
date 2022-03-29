package com.example.lostarkroad.Abyss;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.lostarkroad.R;
import com.example.lostarkroad.Valtan.ValtanPageAdapter;
import com.google.android.material.tabs.TabLayout;

public class OreaGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orea_guide);

        ViewPager viewPager = (ViewPager) findViewById(R.id.Orea_vp);
        OreaPageAdapter adapter = new OreaPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);


    }
}