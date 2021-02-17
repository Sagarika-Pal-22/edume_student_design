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

import com.example.studentperspective.Fragment.MyTeacher_Activity_60;
import com.example.studentperspective.Model.Teacher_Model;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class Teacher_Adapter extends RecyclerView.Adapter<Teacher_Adapter.MyViewHolder> {

    Context context;
    List<Teacher_Model> teacher_models = new ArrayList<>();

    public Teacher_Adapter(Context context, List<Teacher_Model> teacher_models) {
        this.context = context;
        this.teacher_models = teacher_models;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.single_all_fragment_64, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.text_name.setText(teacher_models.get(position).getText_name());
        holder.board.setText(teacher_models.get(position).getBoard());
        holder.subj_1.setText(teacher_models.get(position).getSubj_1());
        holder.subj_2.setText(teacher_models.get(position).getSubj_2());
        holder.subj_3.setText(teacher_models.get(position).getSubj_3());
        holder.subscriber.setText(teacher_models.get(position).getSubscriber());
        holder.views.setText(teacher_models.get(position).getViews());
        holder.videos.setText(teacher_models.get(position).getVideos());

        holder.linear_teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, MyTeacher_Activity_60.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return teacher_models.size();
    }
    public void setTaskList(List<Teacher_Model> taskList) {
        this.teacher_models = taskList;
        notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView text_name,board,subj_1,subj_2,subj_3,subscriber,views,videos;;
        LinearLayout linear_teacher;
        //        LinearLayout linear_this;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text_name = itemView.findViewById(R.id.text_name);
            board = itemView.findViewById(R.id.board);
            subj_1 = itemView.findViewById(R.id.subj_1);
            subj_2 = itemView.findViewById(R.id.subj_2);
            subj_3 = itemView.findViewById(R.id.subj_3);
            subscriber = itemView.findViewById(R.id.subscriber);
            views = itemView.findViewById(R.id.views);
            videos = itemView.findViewById(R.id.videos);
            linear_teacher = itemView.findViewById(R.id.linear_teacher);

        }
    }
}
