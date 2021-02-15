package com.example.studentperspective.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.studentperspective.R;
import com.example.studentperspective.RecyclerItemTouchHelper;
import com.example.studentperspective.Adapter.Teacher_Adapter;
import com.example.studentperspective.Model.Teacher_Model;
import java.util.ArrayList;
import java.util.List;

public class All_Fragment extends Fragment {

    RecyclerView rv_teacher;
    List<Teacher_Model> teacher_models;
    Teacher_Adapter teacher_adapter;
    RecyclerItemTouchHelper touchListener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_93_2,container,false);

        teacher_models = new ArrayList<>();

        rv_teacher = view.findViewById(R.id.rv_teacher);
        rv_teacher.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        rv_teacher.setLayoutManager(linearLayoutManager);
        teacher_models.add(new Teacher_Model("Daniel William","CBSE","Maths","Physics","English","134",
                "1500","102 Videos"));
        teacher_models.add(new Teacher_Model("Daniel William","CBSE","Maths","Physics","English","134",
                "1500","102 Videos"));
        teacher_models.add(new Teacher_Model("Daniel William","CBSE","Maths","Physics","English","134",
                "1500","102 Videos"));
        teacher_adapter = new Teacher_Adapter(getActivity(),teacher_models);
        rv_teacher.setAdapter(teacher_adapter);

        enableSwipe();
        return view;
    }

    private void enableSwipe() {
        touchListener = new RecyclerItemTouchHelper(getActivity(),rv_teacher);
        touchListener
                .setSwipeOptionViews(R.id.text_more)
                .setSwipeable(R.id.lin_1, R.id.view_background, new RecyclerItemTouchHelper.OnSwipeOptionsClickListener() {
                    @Override
                    public void onSwipeOptionClicked(int viewID, int position) {
                        switch (viewID){
                            case R.id.text_more:
                                Toast.makeText(getActivity(), "more clicked", Toast.LENGTH_SHORT).show();
                                break;

                        }
                    }
                });
        rv_teacher.addOnItemTouchListener(touchListener);
    }
}
