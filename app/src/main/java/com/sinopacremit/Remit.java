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
        accounts.add("永豐銀行 XXX-XXXXXXXXXXXXXXXXX");
        accounts.add("叉叉銀行 XXX-XXXXXXXXXXXXXXXXX");


        accountSpinner = findViewById(R.id.AccountSpinner);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Remit.this, android.R.layout.simple_spinner_dropdown_item, accounts);
        arrayAdapter.setDropDownViewResource(R.layout.remit_account);
        accountSpinner.setAdapter(arrayAdapter);


        storeListView = findViewById(R.id.StoreListView);
        confirmCardView = findViewById(R.id.ConfirmCardView);

        ArrayList<String[][]> stores = new ArrayList<String[][]>();

        String[][] temp1 = {{"店家1"}, {"品項1", "品項2", "品項3"}};
        String[][] temp2 = {{"店家2"}, {"品項1", "品項2", "品項3", "品項4"}};
        String[][] temp3 = {{"店家3"}, {"品項1", "品項2"}};

        stores.add(temp1);
        stores.add(temp2);
        stores.add(temp3);

        RemitStoreAdapter storeAdapter = new RemitStoreAdapter(this, stores);
        storeListView.setAdapter(storeAdapter);
    }
}
