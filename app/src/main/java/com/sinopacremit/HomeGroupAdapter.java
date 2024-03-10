package com.sinopacremit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeGroupAdapter extends RecyclerView.Adapter<HomeGroupViewHolder> {
    private Context context;
    private ArrayList<String> groups;

    public HomeGroupAdapter(Context context, ArrayList<String> groups) {
        this.context = context;
        this.groups = groups;
    }

    @NonNull
    @Override
    public HomeGroupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View groupView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_group_button, parent, false);
        return new HomeGroupViewHolder(groupView);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeGroupViewHolder holder, int position) {
        holder.getName().setText(groups.get(position));
    }

    @Override
    public int getItemCount() {
        return groups.size();
    }
}
