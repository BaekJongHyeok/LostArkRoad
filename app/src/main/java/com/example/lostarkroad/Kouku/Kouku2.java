package com.example.lostarkroad.Kouku;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.lostarkroad.R;

public class Kouku2 extends Fragment {
    private View view;

    public static Kouku2 newinstance() {
        Kouku2 homeFragment2 = new Kouku2();
        return homeFragment2;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_kouku_2, container, false);
        return view;
    }
}