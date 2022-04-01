package com.example.lostarkroad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<RaidModel> ModelArrayList = new ArrayList<>();
    private ArrayList<AnotherModel> anotherModelArrayList = new ArrayList<>();
    private ArrayList<Jokbo> jokboArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.raid_recyclerview); // 리사이클러뷰 아이디 연결
        RecyclerView anotherrecyclerView = findViewById(R.id.another_raid_recyclerview);
        RecyclerView jokborecyclerView = findViewById(R.id.jokbo_recyclerview);
        recyclerView.setHasFixedSize(true); // setHasFixedSize : 어댑터의 내용을 변경해도 높이나 너비가 변경되지 않도록 하여 레이아웃을 그리는 비용이 많이 드는 작업을 피한다.
        anotherrecyclerView.setHasFixedSize(true);




        Bitmap image1 = BitmapFactory.decodeResource(getResources(), R.drawable.valtan);
        Bitmap image2 = BitmapFactory.decodeResource(getResources(), R.drawable.bia);
        Bitmap image3 = BitmapFactory.decodeResource(getResources(), R.drawable.kooku);
        Bitmap image4 = BitmapFactory.decodeResource(getResources(), R.drawable.abrell);
        Bitmap image5 = BitmapFactory.decodeResource(getResources(), R.drawable.noimage);
        ModelArrayList.add(new RaidModel(image1, "발탄"));
        ModelArrayList.add(new RaidModel(image2, "비아키스"));
        ModelArrayList.add(new RaidModel(image3, "쿠크세이튼"));
        ModelArrayList.add(new RaidModel(image4, "아브렐슈드"));
        ModelArrayList.add(new RaidModel(image5, "일리아칸"));
        ModelArrayList.add(new RaidModel(image5, "카멘"));
        Bitmap image6 = BitmapFactory.decodeResource(getResources(), R.drawable.gadiun);
        Bitmap image7 = BitmapFactory.decodeResource(getResources(), R.drawable.argos);
        Bitmap image8 = BitmapFactory.decodeResource(getResources(), R.drawable.abis);
        anotherModelArrayList.add(new AnotherModel(image7, "어비스 레이드"));
        anotherModelArrayList.add(new AnotherModel(image8, "오레하의 우물"));


        jokboArrayList.add(new Jokbo(image5, "비아키스 석상족보"));
        jokboArrayList.add(new Jokbo(image5, "쿠크 빙고"));





        MainraidRecyclerView adapter = new MainraidRecyclerView(ModelArrayList,this); // 어댑터 생성
        AnotherRecyclerView adapter2 = new AnotherRecyclerView(anotherModelArrayList, this);
        JokboRecyclerView adapter3 = new JokboRecyclerView(jokboArrayList, this);
        recyclerView.setAdapter(adapter);// 리사이클러뷰에 어댑터연결
        anotherrecyclerView.setAdapter(adapter2);
        jokborecyclerView.setAdapter(adapter3);


        GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
        GridLayoutManager layoutManager2 = new GridLayoutManager(this, 3);
        GridLayoutManager layoutManager3 = new GridLayoutManager(this, 3);

        recyclerView.setLayoutManager(layoutManager); // 리사이클러뷰에 레이아웃 매니저 연결
        recyclerView.setItemAnimator(new DefaultItemAnimator()); // ItemAnimator 는 View 애니메이션을 처리할 수 있는 유일한 구성 요소
        anotherrecyclerView.setLayoutManager(layoutManager2); // 리사이클러뷰에 레이아웃 매니저 연결
        anotherrecyclerView.setItemAnimator(new DefaultItemAnimator()); // ItemAnimator 는 View 애니메이션을 처리할 수 있는 유일한 구성 요소
        jokborecyclerView.setLayoutManager(layoutManager3); // 리사이클러뷰에 레이아웃 매니저 연결
        jokborecyclerView.setItemAnimator(new DefaultItemAnimator()); // ItemAnimator 는 View 애니메이션을 처리할 수 있는 유일한 구성 요소


        //some.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        Intent intent = new Intent(MainActivity.class, ValtanGuide.class);
        //        startActivity(intent);
        //    }
        //})



    }
}