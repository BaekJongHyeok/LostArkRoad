package com.example.lostarkroad;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.lostarkroad.Abrelshud.AbrelshudGuide;
import com.example.lostarkroad.Biackiss.BiackissGuide;
import com.example.lostarkroad.Kouku.KoukuGuide;
import com.example.lostarkroad.Valtan.ValtanGuide;

import java.util.ArrayList;


public class MainraidRecyclerView extends RecyclerView.Adapter<MainraidRecyclerView.MyViewHolder> {
    private final String TAG = "myRecyclerViewAdapter";
    private final ArrayList<RaidModel> dataModelArrayList;
    private Context context;
    int pos;

    public MainraidRecyclerView(ArrayList<RaidModel> dataModelArrayList, Context context) {
        this.dataModelArrayList = dataModelArrayList;
        this.context = context;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView raidname;
        public ImageView ivImageCV;

        public MyViewHolder(View view) {
            super(view);
            this.ivImageCV = (ImageView) view.findViewById(R.id.ivImageCV);
            this.raidname = (TextView) view.findViewById(R.id.raidname);

            view.setClickable(true);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pos = getAdapterPosition();
                    if (pos != RecyclerView.NO_POSITION){
                        RaidModel item = dataModelArrayList.get(pos);

                        Bitmap getImage = item.getImage();
                        String getRaidname = item.getRaidname();

                        Intent intent = new Intent(context, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        intent.putExtra("getImage", getImage);
                        intent.putExtra("getSection", getRaidname);

                        switch (pos){
                            case 0 :
                                Intent valtan = new Intent(context, ValtanGuide.class);
                                ContextCompat.startActivity(context, valtan, null);
                                break;
                            case 1 :
                                Intent biackiss = new Intent(context, BiackissGuide.class);
                                ContextCompat.startActivity(context, biackiss, null);
                                break;
                            case 2 :
                                Intent kouku = new Intent(context, KoukuGuide.class);
                                ContextCompat.startActivity(context, kouku, null);
                                break;
                            case 3 :
                                Intent abrelshud = new Intent(context, AbrelshudGuide.class);
                                ContextCompat.startActivity(context, abrelshud, null);
                                break;
                        }
                    }
                }
            });
        }
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "태그 onCreateViewHolder 들어옴");

        View cardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.raid_recyclerview_item, parent, false); //view연결
        MyViewHolder holder = new MyViewHolder(cardView);
        return holder;

        // 각각의 아이템을 위한 뷰를 담고있는 뷰홀더 객체를 반환한다.
        // (각 아이템을 위한 XML 레이아웃을 이용해 뷰 객체를 만들었고 이걸 뷰홀더에서 참조할 수 있도록 위에 만들어 놓음)
    }

    @Override
    public void onBindViewHolder(@NonNull MainraidRecyclerView.MyViewHolder holder, int position) {

        // 각 위치에 문자열 세팅
        // 객체가 있는 배열에 담아서 어댑터 쪽으로 쏜다. 그걸 onBindViewHolder 가 받아서 Glide가 load하는 형태이다.

        RaidModel dataModelPosition = dataModelArrayList.get(position); // 데이터 리스트 객체에서 어떤거 가져올지 위치로 추출
        holder.raidname.setText(dataModelPosition.getRaidname());

        context = holder.itemView.getContext();


        // Glide : 작성하면 이미지 load가 가능해진다. holder시 삽입될 것이다.
        // override() : 해당 사이즈로 이미지를 늘리거나 줄이는 것.
        // fitCenter() : 해당 이미지뷰의 크기가 지정되어 있을 경우 이미지 뷰의 크기에 이미지를 맞추는 것
        Glide.with(context).load(dataModelArrayList.get(position).getImage()).fitCenter().into(holder.ivImageCV);
        //holder.itemView.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Intent intent = new Intent(context,ValtanGuide.class);
        //        ContextCompat.startActivity(context, intent, null);
        //    }
        //});

    }

    // 몇개의 데이터를 리스트로 뿌려줘야하는지 반드시 정의해줘야한다
    @Override
    public int getItemCount() {
        //  삼항연산자 arrayList 가 null이면 왼쪽꺼 실행 아니면 오른쪽거 실행
        return (dataModelArrayList != null ? dataModelArrayList.size() : 0);
    }
}
