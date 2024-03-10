package com.sinopacremit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SplitItemAdapter extends RecyclerView.Adapter<SplitItemViewHolder>{
    private Context context;
    private ArrayList<String[]> items;

    public SplitItemAdapter(Context context, ArrayList<String[]> items) {
        this.context = context;
        this.items = items;
    }
    @NonNull
    @Override
    public SplitItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.split_overview_list_item, parent, false);
        return new SplitItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SplitItemViewHolder holder, int position) {
        holder.getItemName().setText(items.get(position)[0]);
        holder.getItemCost().setText(items.get(position)[1]);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
