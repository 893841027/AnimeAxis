package com.example.teacher.myanimeaxis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadarChart radar = findViewById(R.id.radar);

        List x = new ArrayList();
        List v = new ArrayList();

        for(int i=1;i<24;i++){
            v.add(new Entry((float) (i*(Math.random())),0));
            x.add(i+"");
        }

        RadarDataSet dataSet = new RadarDataSet(v,null);
        RadarData data = new RadarData(x,dataSet);
        radar.setData(data);

    }
}
