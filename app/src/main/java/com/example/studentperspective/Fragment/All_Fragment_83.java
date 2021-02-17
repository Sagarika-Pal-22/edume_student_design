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

import com.example.studentperspective.Adapter.Adapter_83;
import com.example.studentperspective.Adapter.Badge_Adapter;
import com.example.studentperspective.Model.Badge_Model;
import com.example.studentperspective.Model.Model_83;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class All_Fragment_83 extends Fragment {

    RecyclerView rv_classes;
    List<Model_83> model;
    Adapter_83 adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_all_83,container,false);

        model = new ArrayList<>();

        rv_classes = view.findViewById(R.id.rv_classes);
        rv_classes.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        rv_classes.setLayoutManager(linearLayoutManager);
        model.add(new Model_83("Content Forces and Newtons Law","English","Lesson code : 32654","05.10.2020","View 132"));
        model.add(new Model_83("Content Forces and Newtons Law","English","Lesson code : 32654","05.10.2020","View 132"));
        model.add(new Model_83("Content Forces and Newtons Law","English","Lesson code : 32654","05.10.2020","View 132"));
        adapter = new Adapter_83(getActivity(),model);
        rv_classes.setAdapter(adapter);

        return view;
    }
}
