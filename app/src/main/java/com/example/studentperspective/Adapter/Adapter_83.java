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
import com.example.studentperspective.Model.Model_83;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class Adapter_83 extends RecyclerView.Adapter<Adapter_83.MyViewHolder> {

    Context context;
    List<Model_83> model = new ArrayList<>();

    public Adapter_83(Context context, List<Model_83> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.single_all_83, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.title.setText(model.get(position).getTitle());
        holder.subject.setText(model.get(position).getSubject());
        holder.lesson_code.setText(model.get(position).getLesson_code());
        holder.date.setText(model.get(position).getDate());
        holder.views.setText(model.get(position).getViews());

    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title,subject,lesson_code,date,views;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            subject = itemView.findViewById(R.id.subject);
            lesson_code = itemView.findViewById(R.id.lesson_code);
            date = itemView.findViewById(R.id.date);
            views = itemView.findViewById(R.id.views);

        }
    }
}
