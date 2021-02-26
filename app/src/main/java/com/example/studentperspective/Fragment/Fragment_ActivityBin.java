package com.example.studentperspective.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.studentperspective.ActivityBin_ModelExam;
import com.example.studentperspective.R;

public class Fragment_ActivityBin extends Fragment {

    TextView text_video,text_ebook;
    View view_video,view_ebook;
    CardView card_model_exam_report;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity_bin,container,false);

        text_video =view.findViewById(R.id.text_video);
        view_video =view.findViewById(R.id.view_video);
        text_ebook =view.findViewById(R.id.text_ebook);
        view_ebook =view.findViewById(R.id.view_ebook);
        card_model_exam_report =view.findViewById(R.id.card_model_exam_report);

        text_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view_video.setVisibility(View.VISIBLE);
                view_ebook.setVisibility(View.GONE);

                Video_Fragment video_fragment = new Video_Fragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.frame_layout,video_fragment,video_fragment.getTag()).commit();
            }
        });
        text_ebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view_video.setVisibility(View.GONE);
                view_ebook.setVisibility(View.VISIBLE);

                EBook_Fragment eBook_fragment = new EBook_Fragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.frame_layout,eBook_fragment,eBook_fragment.getTag()).commit();
            }
        });
        card_model_exam_report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ActivityBin_ModelExam.class));
            }
        });


        return view;
    }
}
