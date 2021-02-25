package com.example.studentperspective.Fragment;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.studentperspective.R;

public class Assignment_Fragment_78_12 extends Fragment {

    CardView card_attach,card_active_attach;
    LinearLayout linear_uploading;
    ImageView img_cancel_1,img_cancel_2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_assignment_78_12,container,false);

        card_active_attach = view.findViewById(R.id.card_active_attach);
        card_attach = view.findViewById(R.id.card_attach);
        linear_uploading = view.findViewById(R.id.linear_uploading);
        img_cancel_1 = view.findViewById(R.id.img_cancel_1);
        img_cancel_2 = view.findViewById(R.id.img_cancel_2);

        card_attach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card_attach.setVisibility(View.GONE);
                card_active_attach.setVisibility(View.VISIBLE);
                linear_uploading.setVisibility(View.VISIBLE);
            }
        });
        img_cancel_1.setOnClickListener(new View.OnClickListener() {
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
        img_cancel_2.setOnClickListener(new View.OnClickListener() {
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
