package com.example.recycle_view.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycle_view.Home_screen.Main2;
import com.example.recycle_view.Home_screen.MainActivity;
import com.example.recycle_view.R;

import java.util.ArrayList;
import java.util.List;





public class My_Rv_Adapter extends RecyclerView.Adapter<My_Rv_Adapter.ViewData>{

    Activity activity;
    List<ModalData> l1=new ArrayList<>();

    public My_Rv_Adapter(MainActivity mainActivity, List<ModalData> l1) {
        activity=mainActivity;
        this.l1=l1;
    }

    @NonNull
    @Override
    public ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(activity).inflate(R.layout.item,parent,false);


        return new ViewData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewData holder, @SuppressLint("RecyclerView") int position) {
    holder.txt1.setText(l1.get(position).getCity());
    holder.img.setImageResource(l1.get(position).getCityimage());

    holder.img.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent=new Intent(activity,Main2.class);
//
            activity.startActivity(intent);
//

        }
    });


    }


    @Override
    public int getItemCount() {
        return l1.size();
    }

    class ViewData extends RecyclerView.ViewHolder {

        private final TextView txt1;
        private final ImageView img;

        public ViewData(@NonNull View itemView) {
            super(itemView);
           txt1 =itemView.findViewById(R.id.txt1);
           img =itemView.findViewById(R.id.img);
        }
    }
}
