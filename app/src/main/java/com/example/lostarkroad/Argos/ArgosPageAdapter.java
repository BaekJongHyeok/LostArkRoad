package com.example.lostarkroad.Argos;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.lostarkroad.Biackiss.Biackiss1;
import com.example.lostarkroad.Biackiss.Biackiss2;
import com.example.lostarkroad.Biackiss.Biackiss3;

import java.util.ArrayList;

public class ArgosPageAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> mData;
    public ArgosPageAdapter(@NonNull FragmentManager fm) {
        super(fm);
        mData = new ArrayList<>();
        mData.add(new Argos1());
        mData.add(new Argos2());
        mData.add(new Argos3());
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "1네임드"; // 탭 레이아웃의 텍스트 설정해주는 곳
            case 1:
                return "2네임드";
            case 2:
                return "3네임드";
            default:
                return null;
        }
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return Argos1.newinstance();
            case 1:
                return Argos2.newinstance();
            case 2:
                return Argos2.newinstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
