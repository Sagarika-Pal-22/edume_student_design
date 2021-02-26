package com.example.studentperspective.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.studentperspective.R;

public class ModelExam_Fragment_82_3 extends Fragment {

    Button btn_next;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_model_82_3,container,false);

        btn_next =view.findViewById(R.id.btn_next);

        return view;
    }
}
