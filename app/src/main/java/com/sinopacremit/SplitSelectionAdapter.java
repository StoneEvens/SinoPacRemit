package com.sinopacremit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SplitSelectionAdapter extends RecyclerView.Adapter<SplitSelectionViewHolder> {
    private Context context;
    private ArrayList<String> items;

    public SplitSelectionAdapter(Context context, ArrayList<String> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public SplitSelectionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View selectionView = LayoutInflater.from(parent.getContext()).inflate(R.layout.split_personal_list_item, parent, false);
        return new SplitSelectionViewHolder(selectionView);
    }

    @Override
    public void onBindViewHolder(@NonNull SplitSelectionViewHolder holder, int position) {
        holder.getItemCheckBox().setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
