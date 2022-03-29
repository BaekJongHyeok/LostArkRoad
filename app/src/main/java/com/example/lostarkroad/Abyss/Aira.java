package com.example.lostarkroad.Abyss;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.lostarkroad.R;

public class Aira extends Fragment {
    private View view;

    public static Aira newinstance() {
        Aira homeFragment2 = new Aira();
        return homeFragment2;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_aira, container, false);
        return view;
    }
}