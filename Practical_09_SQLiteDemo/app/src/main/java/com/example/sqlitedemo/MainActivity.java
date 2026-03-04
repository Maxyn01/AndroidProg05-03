package com.example.sqlitedemo;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    DatabaseHelper myDb; EditText editName, editMarks, editId; Button btnAddData, btnViewAll, btnUpdate, btnDelete;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        myDb = new DatabaseHelper(this); editId = findViewById(R.id.editId); editName = findViewById(R.id.editName); editMarks = findViewById(R.id.editMarks);
        btnAddData = findViewById(R.id.btnAdd); btnViewAll = findViewById(R.id.btnView); btnUpdate = findViewById(R.id.btnUpdate); btnDelete = findViewById(R.id.btnDelete);
        addData(); viewAll(); updateData(); deleteData();
    }
    public void addData() { btnAddData.setOnClickListener(v -> { boolean isInserted = myDb.insertData(editName.getText().toString(), editMarks.getText().toString()); Toast.makeText(MainActivity.this, isInserted ? "Data Inserted" : "Data Not Inserted", Toast.LENGTH_LONG).show(); }); }
    public void viewAll() { btnViewAll.setOnClickListener(v -> { Cursor res = myDb.getAllData(); if (res.getCount() == 0) { Toast.makeText(MainActivity.this, "No Data Found", Toast.LENGTH_LONG).show(); return; } StringBuilder b = new StringBuilder(); while (res.moveToNext()) { b.append("ID :").append(res.getString(0)).append("\n"); b.append("Name :").append(res.getString(1)).append("\n"); b.append("Marks :").append(res.getString(2)).append("\n\n"); } Toast.makeText(MainActivity.this, b.toString(), Toast.LENGTH_LONG).show(); }); }
    public void updateData() { btnUpdate.setOnClickListener(v -> { boolean isUpdate = myDb.updateData(editId.getText().toString(), editName.getText().toString(), editMarks.getText().toString()); Toast.makeText(MainActivity.this, isUpdate ? "Data Updated" : "Data Not Updated", Toast.LENGTH_LONG).show(); }); }
    public void deleteData() { btnDelete.setOnClickListener(v -> { Integer deletedRows = myDb.deleteData(editId.getText().toString()); Toast.makeText(MainActivity.this, deletedRows > 0 ? "Data Deleted" : "Data Not Deleted", Toast.LENGTH_LONG).show(); }); }
}
