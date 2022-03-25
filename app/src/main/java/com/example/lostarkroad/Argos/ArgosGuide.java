package com.example.lostarkroad.Argos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.lostarkroad.R;
import com.example.lostarkroad.Valtan.ValtanPageAdapter;
import com.google.android.material.tabs.TabLayout;

public class ArgosGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_argos_guide);

        ViewPager viewPager = (ViewPager) findViewById(R.id.argos_vp);
        ArgosPageAdapter adapter = new ArgosPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);


    }
}