package com.example.lostarkroad.Valtan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lostarkroad.R;

public class ValtanNormal extends Fragment {
    private View view;

    public static ValtanNormal newinstance() {
        ValtanNormal homeFragment2 = new ValtanNormal();
        return homeFragment2;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_valtan_normal, container, false);
        return view;
    }
}