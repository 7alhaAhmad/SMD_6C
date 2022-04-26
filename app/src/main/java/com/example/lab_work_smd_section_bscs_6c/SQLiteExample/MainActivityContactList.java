package com.example.lab_work_smd_section_bscs_6c.SQLiteExample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivityContactList extends AppCompatActivity {
    DbTool dbTools;
    ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_one_main);
        dbTools = new DbTool(getApplicationContext());
        listView = findViewById(R.id.listdbtools);
        ArrayList<HashMap<String, String>> contactList = dbTools.getAllContacts();
        SimpleAdapter adapter = new SimpleAdapter(this, contactList, R.layout.activity_contact_entery,
                new String[]{"_id", "firstName", "secondName"},
                new int[]{R.id.textViewID, R.id.textViewFirstName, R.id.textViewLastName});
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivityContactList.this, EditContactEntery.class);
                intent.putExtra("id", String.valueOf(i + 1));
                startActivity(intent);
            }
        });
    }

    public void AddContact(View view) {
        Intent intent = new Intent(this, NewContactActivity.class);
        startActivity(intent);
    }
}
