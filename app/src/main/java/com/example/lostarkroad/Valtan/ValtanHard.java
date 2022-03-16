package com.example.lostarkroad.Valtan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lostarkroad.R;


public class ValtanHard extends Fragment {
    private View view;

    public static ValtanHard newinstance() {
        ValtanHard homeFragment2 = new ValtanHard();
        return homeFragment2;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_valtan_hard, container, false);
        return view;
    }
}