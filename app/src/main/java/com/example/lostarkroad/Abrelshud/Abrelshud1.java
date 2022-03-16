package com.example.lostarkroad.Abrelshud;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.lostarkroad.R;

public class Abrelshud1 extends Fragment {
    private View view;

    public static Abrelshud1 newinstance() {
        Abrelshud1 homeFragment2 = new Abrelshud1();
        return homeFragment2;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_abrelshud_1, container, false);
        return view;
    }
}