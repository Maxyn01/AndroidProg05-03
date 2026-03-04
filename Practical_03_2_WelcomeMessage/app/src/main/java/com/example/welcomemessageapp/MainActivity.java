package com.example.welcomemessageapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText etName;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(view -> {
            String name = etName.getText().toString().trim();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("username", name);
            startActivity(intent);
        });
    }
}
