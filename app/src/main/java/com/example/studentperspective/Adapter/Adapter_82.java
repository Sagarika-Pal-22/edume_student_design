package com.example.studentperspective.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentperspective.Model.Model_82;
import com.example.studentperspective.Model.Model_83;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class Adapter_82 extends RecyclerView.Adapter<Adapter_82.MyViewHolder> {

    int row_index = -1;
    Context context;
    List<Model_82> model = new ArrayList<>();

    public Adapter_82(Context context, List<Model_82> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.single_82, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.text_term.setText(model.get(position).getText_term());
        holder.text_date.setText(model.get(position).getText_date());

        int linear_exam = 0;
        int text_term = 0;
        int text_date = 0;
        int text_percentile = 0;
        int view_report = 0;
        switch(position % 4) {
            case 0: linear_exam = R.color.White;
                    text_term = R.color.colorBlack;
                    text_date = R.color.dark_grey;
                    text_percentile = R.color.White;
                    view_report = R.color.light_grey;
                    holder.img_tick.setVisibility(View.GONE);
                break;
            case 1: linear_exam = R.color.light_green;
                    text_term = R.color.deep_green;
                    text_date = R.color.dark_grey;
                    text_percentile = R.color.deep_green;
                    view_report = R.color.sky;
                    holder.img_tick.setVisibility(View.VISIBLE);
                break;
            case 2: linear_exam = R.color.light_green;
                text_term = R.color.deep_green;
                text_date = R.color.dark_grey;
                text_percentile = R.color.deep_green;
                view_report = R.color.sky;
                holder.img_tick.setVisibility(View.VISIBLE);
                break;
            case 3: linear_exam = R.color.light_green;
                text_term = R.color.deep_green;
                text_date = R.color.dark_grey;
                text_percentile = R.color.deep_green;
                view_report = R.color.sky;
                holder.img_tick.setVisibility(View.VISIBLE);
                break;
        }
        holder.linear_exam.setBackgroundColor(ContextCompat.getColor(context, linear_exam));
        holder.text_term.setTextColor(ContextCompat.getColor(context, text_term));
        holder.text_date.setTextColor(ContextCompat.getColor(context, text_date));
        holder.text_percentile.setTextColor(ContextCompat.getColor(context, text_percentile));
        holder.view_report.setTextColor(ContextCompat.getColor(context, view_report));


        holder.linear_exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                row_index=position;
            }
        });
//        if(row_index==position){
//            holder.linear_exam.setBackgroundColor(Color.parseColor("#CBE8CD"));
//            holder.text_term.setTextColor(Color.parseColor("#439849"));
//            holder.text_percentile.setTextColor(Color.parseColor("#439849"));
//            holder.text_date.setTextColor(Color.parseColor("#439849"));
//            holder.view_report.setTextColor(Color.parseColor("#30D5EA"));
//        }
//        else
//        {
//            holder.linear_exam.setBackgroundColor(Color.parseColor("#ffffff"));
//            holder.text_term.setTextColor(Color.parseColor("#000000"));
//            holder.text_percentile.setTextColor(Color.parseColor("#ffffff"));
//            holder.text_date.setTextColor(Color.parseColor("#B6B5B5"));
//            holder.view_report.setTextColor(Color.parseColor("#CFCECE"));
//        }


    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView text_term,text_date,text_percentile,view_report;
        LinearLayout linear_exam;
        ImageView img_tick;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text_term = itemView.findViewById(R.id.text_term);
            text_date = itemView.findViewById(R.id.text_date);
            text_percentile = itemView.findViewById(R.id.text_percentile);
            view_report = itemView.findViewById(R.id.view_report);
            linear_exam = itemView.findViewById(R.id.linear_exam);
            img_tick = itemView.findViewById(R.id.img_tick);
        }
    }
}
