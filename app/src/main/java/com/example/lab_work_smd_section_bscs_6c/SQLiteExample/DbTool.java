package com.example.lab_work_smd_section_bscs_6c.SQLiteExample;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;

public class DbTool extends SQLiteOpenHelper {
    public DbTool(@Nullable Context context) {
        super(context, "ContactsDB", null, 1);
        Log.d("TA1G", "DATABASE CREATED");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String Query = "CREATE TABLE CONTACTS(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "firstName TEXT," +
                "secondName TEXT," +
                "phoneNumber TEXT," +
                "emailAddress TEXT," +
                "homeAddress TEXT)";
        db.execSQL(Query);
    }

    public void AddContact(HashMap<String, String> contact) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("_id", contact.get("_id"));
        contentValues.put("firstName", contact.get("firstName"));
        contentValues.put("secondName", contact.get("secondName"));
        contentValues.put("phoneNumber", contact.get("phoneNumber"));
        contentValues.put("emailAddress", contact.get("emailAddress"));
        contentValues.put("homeAddress", contact.get("homeAddress"));

        long i = db.insert("CONTACTS", null, contentValues);
        if (i != -1)
            Log.d("TA1G", "NEW CONTACT INSERTED WITH ID" + i);
        else
            Log.d("TA1G", "FAILED TO INSERT CONTACT");
//        db.close();
    }

    public ArrayList<HashMap<String, String>> getAllContacts() {
        SQLiteDatabase db = getReadableDatabase();
        ArrayList<HashMap<String, String>> contactList = new ArrayList<HashMap<String, String>>();
        String Query = "SELECT * FROM CONTACTS";
        Cursor cursor = db.rawQuery(Query, null);
        if (cursor.moveToFirst()) {
            do {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("_id", cursor.getString(0));
                hashMap.put("firstName", cursor.getString(1));
                hashMap.put("secondName", cursor.getString(2));
                hashMap.put("phoneNumber", cursor.getString(3));
                hashMap.put("emailAddress", cursor.getString(4));
                hashMap.put("homeAddress", cursor.getString(5));
                contactList.add(hashMap);
            } while (cursor.moveToNext());
        }
        return contactList;
    }

    public HashMap<String, String> getSingleContact(String id) {
        SQLiteDatabase db = getReadableDatabase();
        HashMap<String, String> singleContact = new HashMap<>();
        String Query = "SELECT * FROM CONTACTS WHERE _id=" + id;
        Cursor cursor = db.rawQuery(Query, null);
        if (cursor.moveToNext()) {
            singleContact.put("_id", cursor.getString(0));
            singleContact.put("firstName", cursor.getString(1));
            singleContact.put("secondName", cursor.getString(2));
            singleContact.put("phoneNumber", cursor.getString(3));
            singleContact.put("emailAddress", cursor.getString(4));
            singleContact.put("homeAddress", cursor.getString(5));
        }
        return singleContact;
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
