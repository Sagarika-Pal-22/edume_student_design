package com.example.studentperspective.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentperspective.Model.ExerciseLibrary_Model;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class ExerciseLibrary_Adapter extends RecyclerView.Adapter<ExerciseLibrary_Adapter.MyViewHolder> {

    Context context;
    List<ExerciseLibrary_Model> exerciseLibrary_models = new ArrayList<>();

    public ExerciseLibrary_Adapter(Context context, List<ExerciseLibrary_Model> exerciseLibrary_models) {
        this.context = context;
        this.exerciseLibrary_models = exerciseLibrary_models;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.single_67, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.text_chapter.setText(exerciseLibrary_models.get(position).getText_chapter());
        holder.text_subj.setText(exerciseLibrary_models.get(position).getText_subj());
        holder.lesson_code.setText(exerciseLibrary_models.get(position).getLesson_code());
        holder.text_day.setText(exerciseLibrary_models.get(position).getText_day());

    }

    @Override
    public int getItemCount() {
        return exerciseLibrary_models.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView text_chapter,text_subj,lesson_code,text_day;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text_chapter = itemView.findViewById(R.id.text_chapter);
            text_subj = itemView.findViewById(R.id.text_subj);
            lesson_code = itemView.findViewById(R.id.lesson_code);
            text_day = itemView.findViewById(R.id.text_day);

        }
    }
}
