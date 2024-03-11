package com.sinopacremit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FinanceCategoryAdapter extends RecyclerView.Adapter<FinanceCategoryViewHolder> {

    private Context context;
    private ArrayList<String[]> categories;

    public FinanceCategoryAdapter(Context context, ArrayList<String[]> categories) {
        this.context = context;
        this.categories = categories;
    }

    @NonNull
    @Override
    public FinanceCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View groupView = LayoutInflater.from(parent.getContext()).inflate(R.layout.finance_color_list, parent, false);
        return new FinanceCategoryViewHolder(groupView);
    }

    @Override
    public void onBindViewHolder(@NonNull FinanceCategoryViewHolder holder, int position) {
        holder.getColorView().setBackgroundColor(Integer.parseInt(categories.get(position)[0]));
        holder.getCategoryLabel().setText(categories.get(position)[1]);
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}
