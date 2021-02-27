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

import com.example.studentperspective.Adapter.Adapter_91;
import com.example.studentperspective.Model.Model_91;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class All_Fragment_91 extends Fragment {

    RecyclerView rv_favourite;
    List<Model_91> model;
    Adapter_91 adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all_91,container,false);

        model = new ArrayList<>();

        rv_favourite = view.findViewById(R.id.rv_favourite);
        rv_favourite.setHasFixedSize(true);
        rv_favourite.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        model.add(new Model_91("Chapter title", "","Content forces and newton law","View 132","English","Lesson Code: 03546"));
        model.add(new Model_91("Chapter title", "Yesterday","Content forces and newton law","View 132","English","Lesson Code: 03546"));
        model.add(new Model_91("Chapter title", "Yesterday","Content forces and newton law","View 132","English","Lesson Code: 03546"));
        model.add(new Model_91("Chapter title", "Monday","Content forces and newton law","View 132","English","Lesson Code: 03546"));
        model.add(new Model_91("Chapter title", "12/04/2020","Content forces and newton law","View 132","English","Lesson Code: 03546"));
        adapter = new Adapter_91(getActivity(),model);
        rv_favourite.setAdapter(adapter);

        return view;
    }
}
