package com.example.studentperspective.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentperspective.Adapter.ExerciseLibrary_Adapter;
import com.example.studentperspective.Model.ExerciseLibrary_Model;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class All_Fragment_67 extends Fragment {

    RecyclerView recycler_view;
    List<ExerciseLibrary_Model> exerciseLibrary_models;
    ExerciseLibrary_Adapter exerciseLibrary_adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all_67,container,false);

        exerciseLibrary_models =new ArrayList<>();

        recycler_view = view.findViewById(R.id.recycler_view);
        recycler_view.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        recycler_view.setLayoutManager(linearLayoutManager);
        exerciseLibrary_models.add(new ExerciseLibrary_Model("Content Forces and Newtons Law","English","32654","Yesterday"));
        exerciseLibrary_models.add(new ExerciseLibrary_Model("Content Forces and Newtons Law","English","32654","Yesterday"));
        exerciseLibrary_models.add(new ExerciseLibrary_Model("Content Forces and Newtons Law","English","32654","Yesterday"));
        exerciseLibrary_models.add(new ExerciseLibrary_Model("Content Forces and Newtons Law","English","32654","Yesterday"));
        exerciseLibrary_models.add(new ExerciseLibrary_Model("Content Forces and Newtons Law","English","32654","Yesterday"));
        exerciseLibrary_adapter = new ExerciseLibrary_Adapter(getActivity(),exerciseLibrary_models);
        recycler_view.setAdapter(exerciseLibrary_adapter);
        return view;
    }
}
