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

import com.example.studentperspective.Adapter.Video_Adapter;
import com.example.studentperspective.Model.Model_Video;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class EBook_Fragment extends Fragment {

    RecyclerView rv_video;
    List<Model_Video> model_videos;
    Video_Adapter video_adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_video,container,false);

        model_videos = new ArrayList<>();

        rv_video = view.findViewById(R.id.rv_video);
        rv_video.setHasFixedSize(true);
        rv_video.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        model_videos.add(new Model_Video("","Chapter title","Post time: 3:00","Lorem Ipsum","English","Lesson Code: 03546"));
        model_videos.add(new Model_Video("","Chapter title","Post time: 3:00","Lorem Ipsum ","Science","Lesson Code: 03546"));
        model_videos.add(new Model_Video("","Chapter title","Post time: 3:00","Lorem Ipsum is simply dummy text","Physics","Lesson Code: 03546"));
        model_videos.add(new Model_Video("","Chapter title","Post time: 3:00","Lorem Ipsum is simply dummy text","English","Lesson Code: 03546"));
        video_adapter = new Video_Adapter(getActivity(),model_videos);
        rv_video.setAdapter(video_adapter);


        return view;
    }
}
