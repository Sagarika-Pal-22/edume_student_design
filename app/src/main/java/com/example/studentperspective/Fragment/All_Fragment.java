package com.example.studentperspective.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentperspective.Badge_Adapter;
import com.example.studentperspective.Badge_Model;
import com.example.studentperspective.R;
import com.example.studentperspective.Teacher_Adapter;
import com.example.studentperspective.Teacher_Model;

import java.util.ArrayList;
import java.util.List;

public class All_Fragment extends Fragment {

    RecyclerView rv_teacher;
    List<Teacher_Model> teacher_models;
    Teacher_Adapter teacher_adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_93_2,container,false);

        teacher_models = new ArrayList<>();

        rv_teacher = view.findViewById(R.id.rv_teacher);
        rv_teacher.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        rv_teacher.setLayoutManager(linearLayoutManager);
        teacher_models.add(new Teacher_Model("Daniel William","CBSE","Maths","Physics","English","134",
                "1500","102 Videos"));
        teacher_models.add(new Teacher_Model("Daniel William","CBSE","Maths","Physics","English","134",
                "1500","102 Videos"));
        teacher_models.add(new Teacher_Model("Daniel William","CBSE","Maths","Physics","English","134",
                "1500","102 Videos"));
        teacher_adapter = new Teacher_Adapter(getActivity(),teacher_models);
        rv_teacher.setAdapter(teacher_adapter);


        return view;
    }
}
