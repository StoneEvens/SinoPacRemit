package com.sinopacremit;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Carrier extends AppCompatActivity {
    Button homeButton, lastButton, nextButton;

    TextView monthTextView;

    RecyclerView expenseRecyclerView;

    ArrayList<String[]> expenses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrier);

        lastButton = findViewById(R.id.LastButton);
        nextButton = findViewById(R.id.NextButton);
        homeButton = findViewById(R.id.HomeButton_Carrier);
        monthTextView = findViewById(R.id.MonthTextView);
        expenseRecyclerView = findViewById(R.id.ExpenseRecyclerView);

        expenses = new ArrayList<String[]>();
        expenses.add(new String[]{"3-10-24", "Store1", "$100"});
        expenses.add(new String[]{"3-11-24", "Store2", "$500"});

        expenseRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        expenseRecyclerView.setAdapter(new CarrierExpenseAdapter(getApplicationContext(), expenses));
    }
}
