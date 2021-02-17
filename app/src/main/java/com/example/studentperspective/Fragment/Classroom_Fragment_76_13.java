package com.example.studentperspective.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentperspective.Adapter.Badge_Adapter;
import com.example.studentperspective.Adapter.Classroom_Adapter_76_13;
import com.example.studentperspective.Model.Badge_Model;
import com.example.studentperspective.Model.Classroom_Model_76_13;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class Classroom_Fragment_76_13 extends Fragment {

    RecyclerView rv_mySubj;
    List<Classroom_Model_76_13> classroom_model;
    Classroom_Adapter_76_13 classroom_adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_classroom_76_13,container,false);

        classroom_model= new ArrayList<>();

        rv_mySubj = view.findViewById(R.id.rv_mySubj);
        rv_mySubj.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new GridLayoutManager(getActivity(),2);
        rv_mySubj.setLayoutManager(linearLayoutManager);
        classroom_model.add(new Classroom_Model_76_13("English","Class Time 5.40"));
        classroom_model.add(new Classroom_Model_76_13("English","Class Time 5.40"));
        classroom_model.add(new Classroom_Model_76_13("English","Class Time 5.40"));
        classroom_model.add(new Classroom_Model_76_13("English","Class Time 5.40"));
        classroom_adapter = new Classroom_Adapter_76_13(getActivity(),classroom_model);
        rv_mySubj.setAdapter(classroom_adapter);

        return view;
    }
}
