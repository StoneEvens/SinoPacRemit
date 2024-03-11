package com.sinopacremit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarrierExpenseAdapter extends RecyclerView.Adapter<CarrierExpenseViewHolder> {
    private Context context;
    private ArrayList<String[]> expenses;

    public CarrierExpenseAdapter(Context context, ArrayList<String[]> expenses) {
        this.context = context;
        this.expenses = expenses;
    }
    @NonNull
    @Override
    public CarrierExpenseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View groupView = LayoutInflater.from(parent.getContext()).inflate(R.layout.carrier_expense_list, parent, false);
        return new CarrierExpenseViewHolder(groupView);
    }

    @Override
    public void onBindViewHolder(@NonNull CarrierExpenseViewHolder holder, int position) {
        holder.getDate().setText(expenses.get(position)[0]);
        holder.getStoreName().setText(expenses.get(position)[1]);
        holder.getAmount().setText(expenses.get(position)[2]);
    }

    @Override
    public int getItemCount() {
        return expenses.size();
    }
}
