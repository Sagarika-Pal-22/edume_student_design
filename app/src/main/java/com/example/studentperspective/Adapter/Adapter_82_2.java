package com.example.studentperspective.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentperspective.Model.Model_82_1;
import com.example.studentperspective.Model.Model_82_2;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class Adapter_82_2 extends RecyclerView.Adapter<Adapter_82_2.MyViewHolder> {

    Context context;
    List<Model_82_2> model = new ArrayList<>();

    public Adapter_82_2(Context context, List<Model_82_2> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.single_82_2, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.ques_no.setText(model.get(position).getQues_no());
        holder.text_ques.setText(model.get(position).getText_ques());
        holder.a_1.setText(model.get(position).getA_1());
        holder.a_2.setText(model.get(position).getA_2());
        holder.a_3.setText(model.get(position).getA_3());
        holder.a_4.setText(model.get(position).getA_4());
        holder.b_1.setText(model.get(position).getB_1());
        holder.b_2.setText(model.get(position).getB_2());
        holder.b_3.setText(model.get(position).getB_3());
        holder.b_4.setText(model.get(position).getB_4());

    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView ques_no,text_ques,a_1,a_2,a_3,a_4,b_1,b_2,b_3,b_4;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ques_no = itemView.findViewById(R.id.ques_no);
            text_ques = itemView.findViewById(R.id.text_ques);
            a_1 = itemView.findViewById(R.id.a_1);
            a_2 = itemView.findViewById(R.id.a_2);
            a_3 = itemView.findViewById(R.id.a_3);
            a_4 = itemView.findViewById(R.id.a_4);
            b_1 = itemView.findViewById(R.id.b_1);
            b_2 = itemView.findViewById(R.id.b_2);
            b_3 = itemView.findViewById(R.id.b_3);
            b_4 = itemView.findViewById(R.id.b_4);

        }
    }
}
