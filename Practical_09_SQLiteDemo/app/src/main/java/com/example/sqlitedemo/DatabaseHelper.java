package com.example.sqlitedemo;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Student.db";
    public static final String TABLE_NAME = "student";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "MARKS";
    public DatabaseHelper(Context context) { super(context, DATABASE_NAME, null, 1); }
    @Override public void onCreate(SQLiteDatabase db) { db.execSQL("CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, MARKS INTEGER)"); }
    @Override public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME); onCreate(db); }
    public boolean insertData(String name, String marks) { SQLiteDatabase db = this.getWritableDatabase(); ContentValues c = new ContentValues(); c.put(COL_2, name); c.put(COL_3, marks); return db.insert(TABLE_NAME, null, c) != -1; }
    public Cursor getAllData() { SQLiteDatabase db = this.getWritableDatabase(); return db.rawQuery("SELECT * FROM " + TABLE_NAME, null); }
    public boolean updateData(String id, String name, String marks) { SQLiteDatabase db = this.getWritableDatabase(); ContentValues c = new ContentValues(); c.put(COL_1, id); c.put(COL_2, name); c.put(COL_3, marks); db.update(TABLE_NAME, c, "ID = ?", new String[]{id}); return true; }
    public Integer deleteData(String id) { SQLiteDatabase db = this.getWritableDatabase(); return db.delete(TABLE_NAME, "ID = ?", new String[]{id}); }
}
