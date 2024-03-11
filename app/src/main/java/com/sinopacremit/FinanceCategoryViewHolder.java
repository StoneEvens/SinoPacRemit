package com.sinopacremit;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FinanceCategoryViewHolder extends RecyclerView.ViewHolder {
    private View colorView;
    private TextView categoryLabel;

    public FinanceCategoryViewHolder(@NonNull View itemView) {
        super(itemView);
        colorView = itemView.findViewById(R.id.CategoryColorView);
        categoryLabel = itemView.findViewById(R.id.CategoryLabel);
    }

    public View getColorView() {
        return colorView;
    }

    public TextView getCategoryLabel() {
        return categoryLabel;
    }
}
