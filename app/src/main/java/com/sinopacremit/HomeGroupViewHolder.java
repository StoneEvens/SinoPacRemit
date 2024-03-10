package com.sinopacremit;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeGroupViewHolder extends RecyclerView.ViewHolder {
    private TextView name;

    public HomeGroupViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.GroupName);
    }

    public TextView getName() {
        return name;
    }
}
