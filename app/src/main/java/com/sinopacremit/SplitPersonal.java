package com.sinopacremit;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SplitPersonal extends AppCompatActivity {
    CheckBox selectAll;

    TextView storeName;

    RecyclerView selectionRecyclerView;

    CardView backCardView, nextCardView;

    ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.split_personal);

        selectAll = findViewById(R.id.SelectAll);
        storeName = findViewById(R.id.StoreName_Selection);
        selectionRecyclerView = findViewById(R.id.SelectionRecyclerView);
        backCardView = findViewById(R.id.BackCardView);
        nextCardView = findViewById(R.id.NextCardView);

        items = new ArrayList<String>();
        items.add("Item1");
        items.add("Item2");

        selectionRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        selectionRecyclerView.setAdapter(new SplitSelectionAdapter(getApplicationContext(), items));
    }
}
