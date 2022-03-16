package com.example.lostarkroad.Valtan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.lostarkroad.R;
import com.google.android.material.tabs.TabLayout;

public class ValtanGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valtan_guide);

        ViewPager viewPager = (ViewPager) findViewById(R.id.Valtan_vp);
        ValtanPageAdapter adapter = new ValtanPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);


    }
}