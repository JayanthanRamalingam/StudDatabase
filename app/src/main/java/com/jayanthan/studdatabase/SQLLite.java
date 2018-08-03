package com.jayanthan.studdatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLLite extends SQLiteOpenHelper {
    public static SQLiteDatabase studdatabase;
    public SQLLite(Context context){
        super(context, "student.db", null, 1);
        studdatabase = this.getWritableDatabase();
        studdatabase.execSQL("create table if not exists student(rno INTEGER,sname TEXT,marks INTEGER)");
    }
    @Override
    public void onCreate(SQLiteDatabase db){
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
    }
}