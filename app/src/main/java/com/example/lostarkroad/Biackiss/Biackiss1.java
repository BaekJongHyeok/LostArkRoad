package com.example.lostarkroad.Biackiss;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.lostarkroad.R;

public class Biackiss1 extends Fragment {
    private View view;

    public static Biackiss1 newinstance() {
        Biackiss1 homeFragment2 = new Biackiss1();
        return homeFragment2;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_biackiss_1, container, false);
        return view;
    }
}