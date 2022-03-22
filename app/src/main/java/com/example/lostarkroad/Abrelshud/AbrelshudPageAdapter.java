package com.example.lostarkroad.Abrelshud;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.lostarkroad.Biackiss.Biackiss1;
import com.example.lostarkroad.Biackiss.Biackiss2;
import com.example.lostarkroad.Biackiss.Biackiss3;

import java.util.ArrayList;

public class AbrelshudPageAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> mData;
    public AbrelshudPageAdapter(@NonNull FragmentManager fm) {
        super(fm);
        mData = new ArrayList<>();
        mData.add(new Abrelshud1());
        mData.add(new Abrelshud2());
        mData.add(new Abrelshud3());
        mData.add(new Abrelshud4());
        mData.add(new Abrelshud5());
        mData.add(new Abrelshud6());

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "1관문"; // 탭 레이아웃의 텍스트 설정해주는 곳
            case 1:
                return "2관문";
            case 2:
                return "3관문";
            case 3:
                return "4관문";
            case 4:
                return "5관문";
            case 5:
                return "6관문";
            default:
                return null;
        }
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return Abrelshud1.newinstance();
            case 1:
                return Abrelshud2.newinstance();
            case 2:
                return Abrelshud3.newinstance();
            case 3:
                return Abrelshud4.newinstance();
            case 4:
                return Abrelshud5.newinstance();
            case 5:
                return Abrelshud6.newinstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 6;
    }
}
