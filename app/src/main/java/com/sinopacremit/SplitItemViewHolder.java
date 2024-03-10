package com.sinopacremit;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SplitItemViewHolder extends RecyclerView.ViewHolder {
    private TextView itemName, itemCost;

    public SplitItemViewHolder(@NonNull View itemView) {
        super(itemView);
        itemName = itemView.findViewById(R.id.ItemName);
        itemCost = itemView.findViewById(R.id.ItemPrice);
    }

    public TextView getItemCost() {
        return itemCost;
    }

    public TextView getItemName() {
        return itemName;
    }
}
