package com.example.fragmentcommunicationapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class InputFragment extends Fragment {
    private EditText etMessage;
    private OnMessageSendListener listener;

    public interface OnMessageSendListener {
        void onMessageSend(String message);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnMessageSendListener) {
            listener = (OnMessageSendListener) context;
        } else {
            throw new RuntimeException(context + " must implement OnMessageSendListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_input, container, false);
        etMessage = view.findViewById(R.id.etMessage);
        Button btnSend = view.findViewById(R.id.btnSend);
        btnSend.setOnClickListener(v -> listener.onMessageSend(etMessage.getText().toString()));
        return view;
    }
}
