package com.sinopacremit;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;

public class SplitOverview extends AppCompatActivity {
    TextView storeName;

    RecyclerView itemRecyclerView;

    CardView speedSplit, advanceSplit;
    ArrayList<String[]> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.split_overview);

        storeName = findViewById(R.id.StoreName);
        itemRecyclerView = findViewById(R.id.ItemRecyclerView);
        speedSplit = findViewById(R.id.SpeedSplitCardView);
        advanceSplit = findViewById(R.id.AdvanceSplitCardView);

        items = new ArrayList<String[]>();
        items.add(new String[]{"品項一", "$100"});
        items.add(new String[]{"品項二", "$150"});
        items.add(new String[]{"品項三", "$387"});
        items.add(new String[]{"品項四", "$208"});

        itemRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        itemRecyclerView.setAdapter(new SplitItemAdapter(getApplicationContext(), items));

    }
}
