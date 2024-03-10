package com.sinopacremit;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.sql.Array;
import java.util.ArrayList;

public class Remit extends AppCompatActivity {
    Spinner accountSpinner;

    ExpandableListView storeListView;

    CardView confirmCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.remit);

        ArrayList<String> accounts = new ArrayList<String>();
        ArrayList<String> banks = new ArrayList<String>();
        accounts.add("111306075");
        accounts.add("111306111");


        accountSpinner = findViewById(R.id.AccountSpinner);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Remit.this, android.R.layout.simple_spinner_dropdown_item, accounts);
        arrayAdapter.setDropDownViewResource(R.layout.remit_account);
        accountSpinner.setAdapter(arrayAdapter);


        storeListView = findViewById(R.id.StoreListView);
        confirmCardView = findViewById(R.id.ConfirmCardView);

        ArrayList<String[][]> stores = new ArrayList<String[][]>();

        String[][] temp1 = {{"Store1"}, {"Item1", "Item2", "Item3"}};
        String[][] temp2 = {{"Store2"}, {"Item1", "Item2", "Item3"}};

        stores.add(temp1);
        stores.add(temp2);

        RemitStoreAdapter storeAdapter = new RemitStoreAdapter(this, stores);
        storeListView.setAdapter(storeAdapter);
    }
}
