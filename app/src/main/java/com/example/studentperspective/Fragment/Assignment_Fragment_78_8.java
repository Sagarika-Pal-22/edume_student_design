package com.example.studentperspective.Fragment;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.studentperspective.R;

public class Assignment_Fragment_78_8 extends Fragment {

    CardView card_microphone;
    ImageView img_active_microphone;
    LinearLayout linear_recording;
    TextView text_cancel;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_assignment_78_8,container,false);

        card_microphone = view.findViewById(R.id.card_microphone);
        img_active_microphone = view.findViewById(R.id.img_active_microphone);
        linear_recording = view.findViewById(R.id.linear_recording);
        text_cancel = view.findViewById(R.id.text_cancel);

        card_microphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card_microphone.setVisibility(View.GONE);
                img_active_microphone.setVisibility(View.VISIBLE);
                linear_recording.setVisibility(View.VISIBLE);
            }
        });

        text_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = LayoutInflater.from(getActivity());
                final View dialogView = inflater.inflate(R.layout.dialog_cancel, null);
                final Button btn_cancel = dialogView.findViewById(R.id.btn_cancel);
                builder.setView(dialogView);
                final AlertDialog alert = builder.create();
                alert.setCanceledOnTouchOutside(true);
                alert.show();
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alert.dismiss();

                    }
                });
            }
        });

        return view;
    }
}
