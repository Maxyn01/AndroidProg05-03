package com.example.collegeeventapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class EventAdapter extends BaseAdapter {
    private final Context context;
    private final String[] events;

    public EventAdapter(Context context, String[] events) {
        this.context = context;
        this.events = events;
    }

    @Override
    public int getCount() {
        return events.length;
    }

    @Override
    public Object getItem(int i) {
        return events[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }
        TextView txt = view.findViewById(R.id.txtEvent);
        txt.setText(events[i]);
        return view;
    }
}
