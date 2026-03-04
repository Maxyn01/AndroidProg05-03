package com.example.fragmentcommunicationapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class DisplayFragment extends Fragment {
    private TextView tvDisplay;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_display, container, false);
        tvDisplay = view.findViewById(R.id.tvDisplay);
        return view;
    }

    public void updateMessage(String message) {
        if (tvDisplay != null) {
            tvDisplay.setText(message);
        }
    }
}
