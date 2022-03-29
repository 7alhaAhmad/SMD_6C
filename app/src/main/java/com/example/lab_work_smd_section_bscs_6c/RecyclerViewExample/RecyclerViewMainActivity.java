package com.example.lab_work_smd_section_bscs_6c.RecyclerViewExample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.ArrayList;

public class RecyclerViewMainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Mobiles> mobileList = new ArrayList<>();
    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_main);
        recyclerView = findViewById(R.id.myrecyclerview);
        adapter = new MyRecyclerViewAdapter(mobileList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        Insert();
    }

    public void Insert() {
        Mobiles mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        mobiles = new Mobiles("iPhone 12", "Apple™", "90000");
        mobileList.add(mobiles);
        adapter.notifyDataSetChanged();
    }
}