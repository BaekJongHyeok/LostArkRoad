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

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.lostarkroad.Abrelshud.AbrelshudGuide;
import com.example.lostarkroad.Abyss.OreaGuide;
import com.example.lostarkroad.Argos.ArgosGuide;
import com.example.lostarkroad.Biackiss.BiackissGuide;
import com.example.lostarkroad.Kouku.KoukuGuide;
import com.example.lostarkroad.Valtan.ValtanGuide;

import java.util.ArrayList;

public class AnotherRecyclerView extends RecyclerView.Adapter<AnotherRecyclerView.MyViewHolder> {
    private final String TAG = "myRecyclerViewAdapter";
    private final ArrayList<AnotherModel> dataModelArrayList;
    private Context context;
    int pos;

    public AnotherRecyclerView(ArrayList<AnotherModel> dataModelArrayList, Context context) {
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
                        AnotherModel item = dataModelArrayList.get(pos);

                        Bitmap getImage = item.getImage();
                        String getRaidname = item.getRaidname();

                        Intent intent = new Intent(context, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        intent.putExtra("getImage", getImage);
                        intent.putExtra("getSection", getRaidname);

                        switch (pos){
                            case 0 :
                                Intent argos = new Intent(context, ArgosGuide.class);
                                ContextCompat.startActivity(context, argos, null);
                                break;
                            case 1:
                                Intent abyss = new Intent(context, OreaGuide.class);
                                ContextCompat.startActivity(context, abyss, null);
                                break;
                        }
                    }
                }
            });
        }
    }
    @NonNull
    @Override
    public AnotherRecyclerView.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "?????? onCreateViewHolder ?????????");

        View cardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.raid_recyclerview_item, parent, false); //view??????
        AnotherRecyclerView.MyViewHolder holder = new AnotherRecyclerView.MyViewHolder(cardView);
        return holder;

        // ????????? ???????????? ?????? ?????? ???????????? ????????? ????????? ????????????.
        // (??? ???????????? ?????? XML ??????????????? ????????? ??? ????????? ???????????? ?????? ??????????????? ????????? ??? ????????? ?????? ????????? ??????)
    }

    @Override
    public void onBindViewHolder(@NonNull AnotherRecyclerView.MyViewHolder holder, int position) {

        // ??? ????????? ????????? ??????
        // ????????? ?????? ????????? ????????? ????????? ????????? ??????. ?????? onBindViewHolder ??? ????????? Glide??? load?????? ????????????.

       AnotherModel dataModelPosition = dataModelArrayList.get(position); // ????????? ????????? ???????????? ????????? ???????????? ????????? ??????
        holder.raidname.setText(dataModelPosition.getRaidname());

        context = holder.itemView.getContext();


        // Glide : ???????????? ????????? load??? ???????????????. holder??? ????????? ?????????.
        // override() : ?????? ???????????? ???????????? ???????????? ????????? ???.
        // fitCenter() : ?????? ??????????????? ????????? ???????????? ?????? ?????? ????????? ?????? ????????? ???????????? ????????? ???
        Glide.with(context).load(dataModelArrayList.get(position).getImage()).fitCenter().into(holder.ivImageCV);

    }

    // ????????? ???????????? ???????????? ????????????????????? ????????? ?????????????????????
    @Override
    public int getItemCount() {
        //  ??????????????? arrayList ??? null?????? ????????? ?????? ????????? ???????????? ??????
        return (dataModelArrayList != null ? dataModelArrayList.size() : 0);
    }
}
