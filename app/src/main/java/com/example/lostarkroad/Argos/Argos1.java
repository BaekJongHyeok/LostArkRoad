package com.example.lostarkroad.Argos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.lostarkroad.R;

public class Argos1 extends Fragment {
    private View view;

    public static Argos1 newinstance() {
        Argos1 homeFragment2 = new Argos1();
        return homeFragment2;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_argos_1, container, false);
        return view;
    }
}