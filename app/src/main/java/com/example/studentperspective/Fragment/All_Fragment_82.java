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

import com.example.studentperspective.Adapter.Adapter_82;
import com.example.studentperspective.Adapter.Adapter_83;
import com.example.studentperspective.Model.Model_82;
import com.example.studentperspective.Model.Model_83;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class All_Fragment_82 extends Fragment {

    RecyclerView rv_exam;
    List<Model_82> model = new ArrayList<>();
    Adapter_82 adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all_82,container,false);

        model = new ArrayList<>();

        rv_exam = view.findViewById(R.id.rv_exam);
        rv_exam.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        rv_exam.setLayoutManager(linearLayoutManager);
        model.add(new Model_82("Final","","Exam Date: 19.12.20"));
        model.add(new Model_82("3rd Term","Percentile 89%","Exam Date: 19.12.20"));
        model.add(new Model_82("2nd Term","Percentile 89%","Exam Date: 19.12.20"));
        model.add(new Model_82("1st Term","Percentile 89%","Exam Date: 19.12.20"));
        adapter = new Adapter_82(getActivity(),model);
        rv_exam.setAdapter(adapter);

        return view;
    }
}
