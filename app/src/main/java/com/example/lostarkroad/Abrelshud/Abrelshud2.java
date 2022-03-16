package com.example.lostarkroad.Abrelshud;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.lostarkroad.R;

public class Abrelshud2 extends Fragment {
    private View view;

    public static Abrelshud2 newinstance() {
        Abrelshud2 homeFragment2 = new Abrelshud2();
        return homeFragment2;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_abrelshud_2, container, false);
        return view;
    }
}