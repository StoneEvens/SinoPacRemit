package com.sinopacremit;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Array;
import java.util.ArrayList;

public class Remit extends AppCompatActivity {
    Spinner accountSpinner;

    ExpandableListView storeListView;

    Button confirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.remit);

        accountSpinner = findViewById(R.id.AccountSpinner);
        storeListView = findViewById(R.id.StoreListView);
        confirmButton = findViewById(R.id.ConfirmButton);

        ArrayList<String[][]> stores = new ArrayList<String[][]>();

        String[][] temp1 = {{"Store1"}, {"Item1", "Item2", "Item3"}};
        String[][] temp2 = {{"Store2"}, {"Item1", "Item2", "Item3"}};

        stores.add(temp1);
        stores.add(temp2);

        RemitStoreAdapter storeAdapter = new RemitStoreAdapter(this, stores);
    }
}
