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

import com.example.studentperspective.Adapter.Adapter_82_2;
import com.example.studentperspective.Model.Model_82_2;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class ModelExam_Fragment_82_2 extends Fragment {

    RecyclerView rv_question;
    List<Model_82_2> model;
    Adapter_82_2 adapter;
    Button btn_next;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_model_82_2,container,false);

        btn_next = view.findViewById(R.id.btn_next);

        model = new ArrayList<>();

        rv_question = view.findViewById(R.id.rv_question);
        rv_question.setHasFixedSize(true);
        rv_question.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        model.add(new Model_82_2("01","Match the following items given in Column A with those in Column B. Choose the correct answer from the options given below:",
                "A. Rashsundari Devi","B. Rashsundari Devi","C. Rashsundari Devi","D. Rashsundari Devi",
                "A. Chhote Aur Baade","B. Chhote Aur Baade","C. Chhote Aur Baade","D. Chhote Aur Baade"));
        adapter = new Adapter_82_2(getActivity(),model);
        rv_question.setAdapter(adapter);

        return view;
    }
}
