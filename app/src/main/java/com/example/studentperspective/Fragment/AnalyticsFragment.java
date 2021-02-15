package com.example.studentperspective.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.studentperspective.ChapterTestReport_Activity_52;
import com.example.studentperspective.ExerciseReport_Activity_54;
import com.example.studentperspective.ModelExamReport_Activity_55;
import com.example.studentperspective.R;

public class AnalyticsFragment extends Fragment {

    CardView card_exercise_report,card_chapter_test_report,card_model_exam_report;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_analytics,container,false);

        card_chapter_test_report =view.findViewById(R.id.card_chapter_test_report);
        card_exercise_report =view.findViewById(R.id.card_exercise_report);
        card_model_exam_report =view.findViewById(R.id.card_model_exam_report);

        card_chapter_test_report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ChapterTestReport_Activity_52.class));
            }
        });
        card_exercise_report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ExerciseReport_Activity_54.class));
            }
        });
        card_model_exam_report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ModelExamReport_Activity_55.class));
            }
        });

        return view;
    }


}
