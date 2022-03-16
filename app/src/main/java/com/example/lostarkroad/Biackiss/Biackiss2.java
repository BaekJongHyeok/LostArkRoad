package com.example.lostarkroad.Biackiss;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.lostarkroad.R;

public class Biackiss2 extends Fragment {
    private View view;

    public static Biackiss2 newinstance() {
        Biackiss2 homeFragment2 = new Biackiss2();
        return homeFragment2;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_biackiss_2, container, false);
        return view;
    }
}