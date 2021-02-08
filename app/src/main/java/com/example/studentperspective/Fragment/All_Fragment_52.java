package com.example.studentperspective.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.studentperspective.R;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class All_Fragment_52 extends Fragment {

    PieChart piechart;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.all_fragment_52,container,false);

        piechart = view.findViewById(R.id.piechart);

        piechart.setUsePercentValues(false);
        piechart.getDescription().setEnabled(false);
        piechart.setExtraOffsets(5,10,5,5);

        piechart.setDrawHoleEnabled(true);
        piechart.setCenterText("50% Overall");
        piechart.setEntryLabelColor(Color.BLACK);
        piechart.setTransparentCircleRadius(61f);

        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(25f,"Physics"));
        yValues.add(new PieEntry(25f,"Chemistry"));
        yValues.add(new PieEntry(30f,"Maths"));
        yValues.add(new PieEntry(25f,"English"));

        piechart.animateY(1000, Easing.EaseInOutCubic);

        PieDataSet dataSet = new PieDataSet(yValues,"(Overall)");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);
        dataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        dataSet.setXValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        dataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);

        PieData data = new PieData(dataSet);
        data.setValueTextSize(12f);
        data.setValueTextColor(Color.BLACK);
        piechart.setData(data);


        return view;
    }
}
