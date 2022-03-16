package com.example.lostarkroad.Kouku;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.lostarkroad.R;

public class Kouku3 extends Fragment {
    private View view;

    public static Kouku3 newinstance() {
        Kouku3 homeFragment2 = new Kouku3();
        return homeFragment2;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_kouku_3, container, false);
        return view;
    }
}