package com.example.studentperspective.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentperspective.Adapter.Adapter_82_1;
import com.example.studentperspective.Model.Model_82_1;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class ModelExam_Fragment_82_1 extends Fragment {

    RecyclerView rv_instruction;
    List<Model_82_1> model;
    Adapter_82_1 adapter;
    Button btn_next;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_model_82_1,container,false);

        btn_next = view.findViewById(R.id.btn_next);

        model = new ArrayList<>();

        rv_instruction = view.findViewById(R.id.rv_instruction);
        rv_instruction.setHasFixedSize(true);
        rv_instruction.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        model.add(new Model_82_1("The question paper comprises three sections-A,B and C. Attempt all the sections."));
        model.add(new Model_82_1("All questions are compulsory."));
        model.add(new Model_82_1("Internel choice is given in each section."));
        model.add(new Model_82_1("The question paper comprises three sections-A,B and C. Attempt all the sections."));
        model.add(new Model_82_1("All questions are compulsory."));
        model.add(new Model_82_1("Internel choice is given in each section."));
        model.add(new Model_82_1("The question paper comprises three sections-A,B and C. Attempt all the sections."));
        model.add(new Model_82_1("All questions are compulsory."));
        model.add(new Model_82_1("Internel choice is given in each section."));
        adapter = new Adapter_82_1(getActivity(),model);
        rv_instruction.setAdapter(adapter);


        return view;
    }
}
