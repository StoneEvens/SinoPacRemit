package com.sinopacremit;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    ImageView codeView, accountView;

    RecyclerView groupRecyclerView;

    CardView carrierCardView, financeCardView;

    ArrayList<String> groups;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        codeView = findViewById(R.id.CodeView);
        accountView = findViewById(R.id.AccountView);
        groupRecyclerView = findViewById(R.id.GroupRecyclerView);
        carrierCardView = findViewById(R.id.CarrierCardView);
        financeCardView = findViewById(R.id.FinanceCardView);

        groups = new ArrayList<String>();
        groups.add("Test1");
        groups.add("Test2");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        groupRecyclerView.setLayoutManager(layoutManager);
        groupRecyclerView.setAdapter(new HomeGroupAdapter(getApplicationContext(), groups));


    }
}
