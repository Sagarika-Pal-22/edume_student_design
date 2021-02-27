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

import com.example.studentperspective.FavouriteChapter_Activity_93;
import com.example.studentperspective.Model.Model_91;
import com.example.studentperspective.Model.Model_Favourite_93;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Favourite_93 extends RecyclerView.Adapter<Adapter_Favourite_93.MyViewHolder> {

    Context context;
    List<Model_Favourite_93> model = new ArrayList<>();

    public Adapter_Favourite_93(Context context, List<Model_Favourite_93> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.single_favourite_93, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.views.setText(model.get(position).getViews());
        holder.chapter.setText(model.get(position).getChapter());
        holder.subject.setText(model.get(position).getSubject());

    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView views,chapter,subject;
        ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            views = itemView.findViewById(R.id.views);
            chapter = itemView.findViewById(R.id.chapter);
            subject = itemView.findViewById(R.id.subject);
            img = itemView.findViewById(R.id.img);

        }
    }
}
