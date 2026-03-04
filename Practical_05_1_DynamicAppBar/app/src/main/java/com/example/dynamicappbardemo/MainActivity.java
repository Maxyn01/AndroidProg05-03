package com.example.dynamicappbardemo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        EditText editTitle = findViewById(R.id.editTitle);
        Button btnChangeTitle = findViewById(R.id.btnChangeTitle);

        btnChangeTitle.setOnClickListener(v -> {
            String newTitle = editTitle.getText().toString().trim();
            if (!newTitle.isEmpty() && getSupportActionBar() != null) {
                getSupportActionBar().setTitle(newTitle);
            }
        });
    }
}
