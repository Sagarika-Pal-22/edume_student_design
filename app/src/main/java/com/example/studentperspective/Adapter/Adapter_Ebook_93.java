package com.example.studentperspective.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentperspective.LessonTitle_Activity_77;
import com.example.studentperspective.Model.Model_Favourite_93;
import com.example.studentperspective.Model.Model_ebook_93;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Ebook_93 extends RecyclerView.Adapter<Adapter_Ebook_93.MyViewHolder> {

    Context context;
    List<Model_ebook_93> model = new ArrayList<>();

    public Adapter_Ebook_93(Context context, List<Model_ebook_93> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.single_93_ebook, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.subject.setText(model.get(position).getSubject());
        holder.chapter.setText(model.get(position).getChapter());
        holder.views.setText(model.get(position).getViews());

        holder.linear_ebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, LessonTitle_Activity_77.class));
            }
        });



    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView subject,chapter,views;
        LinearLayout linear_ebook;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            subject = itemView.findViewById(R.id.subject);
            chapter = itemView.findViewById(R.id.chapter);
            views = itemView.findViewById(R.id.views);
            linear_ebook = itemView.findViewById(R.id.linear_ebook);

        }
    }
}
