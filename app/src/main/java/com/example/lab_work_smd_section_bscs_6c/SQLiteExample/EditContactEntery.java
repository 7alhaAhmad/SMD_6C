package com.example.lab_work_smd_section_bscs_6c.SQLiteExample;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.HashMap;

public class EditContactEntery extends AppCompatActivity {

    DbTool dbTools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_contact_entery);
        dbTools = new DbTool(getApplicationContext());
        Intent intent = getIntent();
        String id = intent.getExtras().getString("id");
        HashMap<String, String> singleRecord = dbTools.getSingleContact(id);
    }
}