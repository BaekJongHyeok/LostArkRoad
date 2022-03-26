package com.example.lostarkroad.Kouku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.example.lostarkroad.R;

public class KoukuBingo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kouku_bingo);
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://ialy1595.me/kouku/"));
        startActivity(i);
    }
}