package com.sinopacremit;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarrierExpenseViewHolder extends RecyclerView.ViewHolder {
    private TextView date, storeName, amount;
    public CarrierExpenseViewHolder(@NonNull View itemView) {
        super(itemView);
        date = itemView.findViewById(R.id.DateTextView);
        storeName = itemView.findViewById(R.id.StoreName_Carrier);
        amount = itemView.findViewById(R.id.AmountTextView);
    }

    public TextView getDate() {
        return date;
    }

    public TextView getStoreName() {
        return storeName;
    }

    public TextView getAmount() {
        return amount;
    }
}
