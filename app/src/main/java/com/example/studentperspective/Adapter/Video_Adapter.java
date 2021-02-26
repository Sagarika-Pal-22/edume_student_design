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
import com.example.studentperspective.Model.Model_Video;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class Video_Adapter  extends RecyclerView.Adapter<Video_Adapter.MyViewHolder> {

    Context context;
    List<Model_Video> badge_models = new ArrayList<>();

    public Video_Adapter(Context context, List<Model_Video> badge_models) {
        this.context = context;
        this.badge_models = badge_models;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.single_video, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.chapter_title.setText(badge_models.get(position).getChapter_title());
        holder.time.setText(badge_models.get(position).getTime());
        holder.desc.setText(badge_models.get(position).getDesc());
        holder.subj.setText(badge_models.get(position).getSubj());
        holder.lesson_code.setText(badge_models.get(position).getLesson_code());

    }

    @Override
    public int getItemCount() {
        return badge_models.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView chapter_title,time,desc,subj,lesson_code;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            chapter_title = itemView.findViewById(R.id.chapter_title);
            time = itemView.findViewById(R.id.time);
            desc = itemView.findViewById(R.id.desc);
            subj = itemView.findViewById(R.id.subj);
            lesson_code = itemView.findViewById(R.id.lesson_code);

        }
    }
}
