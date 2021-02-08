package com.example.studentperspective;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class ChatRoom_Activity_64_2 extends AppCompatActivity {

    EditText edit_msg;
    ImageView img_micro,img_camera,img_send;
    RelativeLayout rel_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_room__64_2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edit_msg = findViewById(R.id.edit_msg);
        img_micro = findViewById(R.id.img_micro);
        img_camera = findViewById(R.id.img_camera);
        img_send = findViewById(R.id.img_send);
        rel_img = findViewById(R.id.rel_img);

        edit_msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rel_img.setVisibility(View.GONE);
                img_send.setVisibility(View.VISIBLE);
            }
        });


    }
}