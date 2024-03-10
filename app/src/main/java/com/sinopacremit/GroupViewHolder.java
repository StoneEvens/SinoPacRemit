package com.sinopacremit;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class GroupViewHolder extends RecyclerView.ViewHolder {
    private TextView name;

    public GroupViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.GroupName);
    }

    public TextView getName() {
        return name;
    }
}
