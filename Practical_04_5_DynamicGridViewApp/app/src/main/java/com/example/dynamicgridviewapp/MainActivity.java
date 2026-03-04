package com.example.dynamicgridviewapp;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    EditText etItem; Button btnAdd; GridView gridView; ArrayList<String> itemList; ArrayAdapter<String> adapter;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        etItem = findViewById(R.id.etItem); btnAdd = findViewById(R.id.btnAdd); gridView = findViewById(R.id.gridView);
        itemList = new ArrayList<>(); adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList); gridView.setAdapter(adapter);
        btnAdd.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) {
            String item = etItem.getText().toString(); if (!item.isEmpty()) { itemList.add(item); adapter.notifyDataSetChanged(); etItem.setText(""); }
        }});
    }
}
