package com.example.lab_work_smd_section_bscs_6c.CardViewExamples;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab_work_smd_section_bscs_6c.R;
import com.example.lab_work_smd_section_bscs_6c.databinding.ActivityScrollingMainBinding;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class ScrollingActivityMain extends AppCompatActivity {

    public List<My_Model> my_modelList;
    public My_CardViewAdapter adapter;
    public RecyclerView recyclerView;
    private ActivityScrollingMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityScrollingMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());

        FloatingActionButton fab = binding.fab;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        recyclerView = findViewById(R.id.my_cardrecyclerview);
        my_modelList = new ArrayList<>();
        adapter = new My_CardViewAdapter(this, my_modelList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        insertFunction();
    }

    public void insertFunction() {
        int[] myImages = new int[]{
                R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e
        };
        My_Model my_model = new My_Model("First", 40, myImages[0]);
        my_modelList.add(my_model);
        my_model = new My_Model("Second", 30, myImages[1]);
        my_modelList.add(my_model);
        my_model = new My_Model("Third", 20, myImages[2]);
        my_modelList.add(my_model);
        my_model = new My_Model("Fourth", 10, myImages[3]);
        my_modelList.add(my_model);
        my_model = new My_Model("Five", 00, myImages[0]);
        my_modelList.add(my_model);
        adapter.notifyDataSetChanged();
    }
}