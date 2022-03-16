package com.example.lostarkroad.Kouku;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.lostarkroad.Biackiss.Biackiss1;
import com.example.lostarkroad.Biackiss.Biackiss2;
import com.example.lostarkroad.Biackiss.Biackiss3;

import java.util.ArrayList;

public class KoukuPageAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> mData;
    public KoukuPageAdapter(@NonNull FragmentManager fm) {
        super(fm);
        mData = new ArrayList<>();
        mData.add(new Kouku1());
        mData.add(new Kouku2());
        mData.add(new Kouku3());
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
                return Kouku1.newinstance();
            case 1:
                return Kouku2.newinstance();
            case 2:
                return Kouku3.newinstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
