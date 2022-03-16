package com.example.lostarkroad.Abrelshud;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.lostarkroad.R;

public class Abrelshud5 extends Fragment {
    private View view;

    public static Abrelshud5 newinstance() {
        Abrelshud5 homeFragment2 = new Abrelshud5();
        return homeFragment2;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_abrelshud_5, container, false);
        return view;
    }
}