package com.sinopacremit;

import android.view.View;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SplitSelectionViewHolder extends RecyclerView.ViewHolder {
    private CheckBox itemCheckBox;

    public SplitSelectionViewHolder(@NonNull View itemView) {
        super(itemView);
        itemCheckBox = itemView.findViewById(R.id.ItemCheckBox);
    }

    public CheckBox getItemCheckBox() {
        return itemCheckBox;
    }
}
