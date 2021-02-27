package com.example.studentperspective.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentperspective.Adapter.Adapter_Ebook_93;
import com.example.studentperspective.Adapter.Adapter_Favourite_93;
import com.example.studentperspective.Model.Model_Favourite_93;
import com.example.studentperspective.Model.Model_ebook_93;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class FavouriteChapter_Fragment_93 extends Fragment {

    RecyclerView recycler_video,recycler_ebook;
    List<Model_Favourite_93> model_favourite;
    List<Model_ebook_93> model_ebook;
    Adapter_Favourite_93 adapter_favourite;
    Adapter_Ebook_93 adapter_ebook;

    TextView text_videos,text_ebooks;
    LinearLayout lin_ebook,lin_videos;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favourite_93,container,false);

        text_videos = view.findViewById(R.id.text_videos);
        text_ebooks = view.findViewById(R.id.text_ebooks);
        lin_ebook = view.findViewById(R.id.lin_ebook);
        lin_videos = view.findViewById(R.id.lin_videos);

        lin_videos.setBackground(getActivity().getDrawable(R.drawable.white_box));
        text_videos.setTextColor(getResources().getColor(R.color.colorPrimary));

        lin_videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lin_ebook.setBackground(null);
                text_ebooks.setTextColor(getResources().getColor(R.color.White));
                lin_videos.setBackground(getActivity().getDrawable(R.drawable.white_box));
                text_videos.setTextColor(getResources().getColor(R.color.colorPrimary));
                recycler_video.setVisibility(View.VISIBLE);
                recycler_ebook.setVisibility(View.GONE);

            }
        });

        lin_ebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lin_ebook.setBackground(getActivity().getDrawable(R.drawable.white_box));
                text_ebooks.setTextColor(getResources().getColor(R.color.colorPrimary));
                lin_videos.setBackground(null);
                text_videos.setTextColor(getResources().getColor(R.color.White));
                recycler_video.setVisibility(View.GONE);
                recycler_ebook.setVisibility(View.VISIBLE);

            }
        });


        model_favourite = new ArrayList<>();

        recycler_video = view.findViewById(R.id.recycle_video);
        recycler_video.setHasFixedSize(true);
        recycler_video.setLayoutManager(new GridLayoutManager(getActivity(),2));
        model_favourite.add(new Model_Favourite_93("","142 Views","Rational And Irrational","eng"));
        model_favourite.add(new Model_Favourite_93("","142 Views","Rational And Irrational","mat"));
        model_favourite.add(new Model_Favourite_93("","142 Views","Rational And Irrational","sci"));
        model_favourite.add(new Model_Favourite_93("","142 Views","Rational And Irrational","che"));
        model_favourite.add(new Model_Favourite_93("","142 Views","Rational And Irrational","phy"));
        model_favourite.add(new Model_Favourite_93("","142 Views","Rational And Irrational","bio"));
        adapter_favourite = new Adapter_Favourite_93(getActivity(),model_favourite);
        recycler_video.setAdapter(adapter_favourite);

        model_ebook = new ArrayList<>();

        recycler_ebook = view.findViewById(R.id.recycler_ebook);
        recycler_ebook.setHasFixedSize(true);
        recycler_ebook.setLayoutManager(new GridLayoutManager(getActivity(),2));
        model_ebook.add(new Model_ebook_93("eng","Chapter Tite 1","124 Views"));
        model_ebook.add(new Model_ebook_93("mat","Chapter Tite 1","124 Views"));
        model_ebook.add(new Model_ebook_93("sci","Chapter Tite 1","124 Views"));
        model_ebook.add(new Model_ebook_93("che","Chapter Tite 1","124 Views"));
        model_ebook.add(new Model_ebook_93("phy","Chapter Tite 1","124 Views"));
        model_ebook.add(new Model_ebook_93("bio","Chapter Tite 1","124 Views"));
        adapter_ebook = new Adapter_Ebook_93(getActivity(),model_ebook);
        recycler_ebook.setAdapter(adapter_ebook);

        return view;
    }
}
