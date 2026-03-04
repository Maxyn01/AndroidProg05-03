package com.example.contactlistviewapp;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    EditText edtName; Button btnAdd; ListView listView; ArrayList<String> contactList; ArrayAdapter<String> adapter;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edtName); btnAdd = findViewById(R.id.btnAdd); listView = findViewById(R.id.listView);
        contactList = new ArrayList<>(); adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, contactList); listView.setAdapter(adapter);
        btnAdd.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) {
            String name = edtName.getText().toString(); if (!name.isEmpty()) { contactList.add(name); adapter.notifyDataSetChanged(); edtName.setText(""); }
        }});
    }
}
