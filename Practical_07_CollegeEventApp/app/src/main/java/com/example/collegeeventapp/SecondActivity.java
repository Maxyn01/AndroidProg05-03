package com.example.collegeeventapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txt = findViewById(R.id.txtSelected);
        Button btn = findViewById(R.id.btnRegister);

        String event = getIntent().getStringExtra("event");
        if (event == null || event.isEmpty()) {
            event = "Unknown Event";
        }
        txt.setText("Selected: " + event);

        String finalEvent = event;
        btn.setOnClickListener(v -> Toast.makeText(
                getApplicationContext(),
                "Registered for " + finalEvent,
                Toast.LENGTH_LONG
        ).show());
    }
}
