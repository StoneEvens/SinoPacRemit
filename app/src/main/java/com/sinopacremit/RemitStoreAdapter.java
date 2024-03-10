package com.sinopacremit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;

public class RemitStoreAdapter extends BaseExpandableListAdapter {
    Context context;
    ArrayList<String[][]> storeList;

    public RemitStoreAdapter(Context context, ArrayList<String[][]> storeList) {
        this.context = context;
        this.storeList = storeList;
    }

    @Override
    public int getGroupCount() {
        return storeList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return storeList.get(groupPosition).length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return storeList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return storeList.get(groupPosition)[childPosition];
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.remit_store, null);

        TextView storeName = convertView.findViewById(R.id.StoreName_Remit);
        storeName.setText(storeList.get(groupPosition)[0][0]);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.remit_store_items, null);

        TextView item = convertView.findViewById(R.id.StoreItem);
        item.setText(storeList.get(groupPosition)[1][childPosition]);

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
