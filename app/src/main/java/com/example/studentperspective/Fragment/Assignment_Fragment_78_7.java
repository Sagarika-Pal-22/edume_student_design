package com.example.studentperspective.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.studentperspective.R;

public class Assignment_Fragment_78_7 extends Fragment {

    CardView card_title;
    ImageView img_active_text;
    LinearLayout linear_editText;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_assignment_78_7,container,false);

        card_title = view.findViewById(R.id.card_title);
        img_active_text = view.findViewById(R.id.img_active_text);
        linear_editText = view.findViewById(R.id.linear_editText);

        card_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linear_editText.setVisibility(View.VISIBLE);
                card_title.setVisibility(View.GONE);
                img_active_text.setVisibility(View.GONE);
            }
        });

        return view;
    }
}
