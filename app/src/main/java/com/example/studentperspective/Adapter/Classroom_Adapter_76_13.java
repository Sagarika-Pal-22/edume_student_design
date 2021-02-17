package com.example.studentperspective.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentperspective.Model.Badge_Model;
import com.example.studentperspective.Model.Classroom_Model_76_13;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class Classroom_Adapter_76_13 extends RecyclerView.Adapter<Classroom_Adapter_76_13.MyViewHolder> {

    Context context;
    List<Classroom_Model_76_13> classroom_model = new ArrayList<>();

    public Classroom_Adapter_76_13(Context context, List<Classroom_Model_76_13> classroom_model) {
        this.context = context;
        this.classroom_model = classroom_model;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.single_76_13, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.subj.setText(classroom_model.get(position).getSubj());
        holder.time.setText(classroom_model.get(position).getTime());

    }

    @Override
    public int getItemCount() {
        return classroom_model.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView subj,time;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            subj = itemView.findViewById(R.id.subj);
            time = itemView.findViewById(R.id.time);


        }
    }
}
