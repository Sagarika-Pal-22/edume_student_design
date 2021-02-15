package com.example.studentperspective;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EdumeActivity_61 extends AppCompatActivity {

    TextView text_videos,text_ebooks;
    LinearLayout lin_ebook,lin_videos;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edume_61);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lin_ebook = findViewById(R.id.lin_ebook);
        lin_videos = findViewById(R.id.lin_videos);
        text_videos = findViewById(R.id.text_videos);
        text_ebooks = findViewById(R.id.text_ebooks);

        lin_videos.setBackground(getDrawable(R.drawable.white_box));
        text_videos.setTextColor(getResources().getColor(R.color.colorPrimary));

        lin_ebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lin_ebook.setBackground(getDrawable(R.drawable.white_box));
                text_ebooks.setTextColor(getResources().getColor(R.color.colorPrimary));

            }
        });


    }
}