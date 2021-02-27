package com.example.studentperspective.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentperspective.FavouriteChapter_Activity_93;
import com.example.studentperspective.Model.Model_82_1;
import com.example.studentperspective.Model.Model_91;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class Adapter_91 extends RecyclerView.Adapter<Adapter_91.MyViewHolder> {

    Context context;
    List<Model_91> model = new ArrayList<>();

    public Adapter_91(Context context, List<Model_91> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.single_91, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.chapter_title.setText(model.get(position).getChapter_title());
        holder.desc.setText(model.get(position).getDesc());
        holder.view.setText(model.get(position).getView());
        holder.subj.setText(model.get(position).getSubj());
        holder.lesson_code.setText(model.get(position).getLesson_code());

        holder.linear_chapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, FavouriteChapter_Activity_93.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView chapter_title,desc,view,subj,lesson_code;
        LinearLayout linear_chapter;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            chapter_title = itemView.findViewById(R.id.chapter_title);
            desc = itemView.findViewById(R.id.desc);
            view = itemView.findViewById(R.id.view);
            subj = itemView.findViewById(R.id.subj);
            lesson_code = itemView.findViewById(R.id.lesson_code);
            linear_chapter = itemView.findViewById(R.id.linear_chapter);

        }
    }
}
