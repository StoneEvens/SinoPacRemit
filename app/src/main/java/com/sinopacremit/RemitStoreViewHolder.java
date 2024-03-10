package com.sinopacremit;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RemitStoreViewHolder extends RecyclerView.ViewHolder {
    private TextView item;

    public RemitStoreViewHolder(@NonNull View itemView) {
        super(itemView);
        item = itemView.findViewById(R.id.StoreItem);
    }

    public TextView getItem() {
        return item;
    }
}
