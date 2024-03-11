package com.sinopacremit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FinanceDailyAdapter extends BaseExpandableListAdapter {
    Context context;
    ArrayList<String[][]> dailyList;

    public FinanceDailyAdapter(Context context, ArrayList<String[][]> dailyList) {
        this.context = context;
        this.dailyList = dailyList;
    }

    @Override
    public int getGroupCount() {
        return dailyList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return dailyList.get(groupPosition).length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return dailyList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return dailyList.get(groupPosition)[childPosition];
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
        convertView = inflater.inflate(R.layout.finance_daily_list, null);

        TextView date = convertView.findViewById(R.id.DailyListDate);
        date.setText(dailyList.get(groupPosition)[0][0]);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.finance_daily_category, null);

        TextView category = convertView.findViewById(R.id.DailyListCategory);
        category.setText(dailyList.get(groupPosition)[1][2*childPosition]);

        TextView amount = convertView.findViewById(R.id.DailyListAmount);
        amount.setText(dailyList.get(groupPosition)[1][2*childPosition+1]);

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
