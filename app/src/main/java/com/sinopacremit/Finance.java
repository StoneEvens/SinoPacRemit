package com.sinopacremit;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Finance extends AppCompatActivity {
    ExpandableListView dailyListView;

    RecyclerView categoryRecyclerView;

    PieChart pieChart;

    ArrayList<String[][]> dailyList;
    ArrayList<String[]> categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finance);

        dailyListView = findViewById(R.id.DailyListView);

        pieChart = findViewById(R.id.pieChart);
        pieChart.addPieSlice(new PieModel("食物", 1300, Color.BLUE));
        pieChart.addPieSlice(new PieModel("衣服", 1400, Color.GREEN));

        categoryRecyclerView = findViewById(R.id.ColorRecyclerView);
        categories = new ArrayList<String[]>();
        categories.add(new String[]{"-16776961", "食物"});
        categories.add(new String[]{"-16711936", "衣服"});
        categoryRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        categoryRecyclerView.setAdapter(new FinanceCategoryAdapter(getApplicationContext(), categories));

        dailyList = new ArrayList<String[][]>();
        String[][] temp1 = {{"Day1"}, {"食物", "$500", "衣服", "$1000"}};
        String[][] temp2 = {{"Day2"}, {"食物", "$800", "衣服", "$400"}};
        dailyList.add(temp1);
        dailyList.add(temp2);

        FinanceDailyAdapter adapter = new FinanceDailyAdapter(this, dailyList);
        dailyListView.setAdapter(adapter);
    }
}
