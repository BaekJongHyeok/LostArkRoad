package com.example.lostarkroad.Abyss;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.lostarkroad.Valtan.ValtanHard;
import com.example.lostarkroad.Valtan.ValtanNormal;

import java.util.ArrayList;

public class OreaPageAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> mData;
    public OreaPageAdapter(@NonNull FragmentManager fm) {
        super(fm);
        mData = new ArrayList<>();
        mData.add(new Aira());
        mData.add(new Orea());
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "아이라의 눈"; // 탭 레이아웃의 텍스트 설정해주는 곳
            case 1:
                return "오레하 프라바사";
            default:
                return null;
        }
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return Aira.newinstance();
            case 1:
                return Orea.newinstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
