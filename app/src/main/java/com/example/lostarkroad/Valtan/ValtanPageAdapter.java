package com.example.lostarkroad.Valtan;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ValtanPageAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> mData;
    public ValtanPageAdapter(@NonNull FragmentManager fm) {
        super(fm);
        mData = new ArrayList<>();
        mData.add(new ValtanNormal());
        mData.add(new ValtanHard());
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "1네임드"; // 탭 레이아웃의 텍스트 설정해주는 곳
            case 1:
                return "2네임드";
            default:
                return null;
        }
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ValtanNormal.newinstance();
            case 1:
                return ValtanHard.newinstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
