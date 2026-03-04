package com.example.welcomemessageapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvMessage = findViewById(R.id.tvMessage);
        String name = getIntent().getStringExtra("username");
        if (name == null || name.isEmpty()) {
            name = "User";
        }
        tvMessage.setText("Hello, " + name + "! Welcome to the App.");
    }
}
