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

import com.example.studentperspective.Badge_Adapter;
import com.example.studentperspective.Badge_Model;
import com.example.studentperspective.R;

import java.util.ArrayList;
import java.util.List;

public class ProfileFragment extends Fragment {

    RecyclerView rc_badges;
    List<Badge_Model> badgeModels;
    Badge_Adapter badge_adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile,container,false);

        badgeModels = new ArrayList<>();

        rc_badges = view.findViewById(R.id.rc_badges);
        rc_badges.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new GridLayoutManager(getActivity(),4);
        rc_badges.setLayoutManager(linearLayoutManager);
        badgeModels.add(new Badge_Model(R.drawable.badge_2,"100 Points"));
        badgeModels.add(new Badge_Model(R.drawable.badge_4,"200 Points"));
        badgeModels.add(new Badge_Model(R.drawable.badge_1,"300 Points"));
        badgeModels.add(new Badge_Model(R.drawable.badge_3,"400 Points"));
        badgeModels.add(new Badge_Model(R.drawable.badge_2,"100 Points"));
        badgeModels.add(new Badge_Model(R.drawable.badge_4,"200 Points"));
        badgeModels.add(new Badge_Model(R.drawable.badge_1,"300 Points"));
        badgeModels.add(new Badge_Model(R.drawable.badge_3,"400 Points"));
        badgeModels.add(new Badge_Model(R.drawable.badge_2,"100 Points"));
        badgeModels.add(new Badge_Model(R.drawable.badge_4,"200 Points"));
        badgeModels.add(new Badge_Model(R.drawable.badge_1,"300 Points"));
        badgeModels.add(new Badge_Model(R.drawable.badge_3,"400 Points"));
        badge_adapter = new Badge_Adapter(getActivity(),badgeModels);
        rc_badges.setAdapter(badge_adapter);

        return view;

    }
}
