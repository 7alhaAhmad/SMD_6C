package com.example.lab_work_smd_section_bscs_6c.Task04RecyclerView;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.ArrayList;

public class Task4RecyclerViewMainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Task04WhatsappData> recycleList = new ArrayList<>();
    AdapterTask04 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task4_recycler_view_main);

        recyclerView = findViewById(R.id.recyclerviewtask4);
        adapter = new AdapterTask04(recycleList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        addData();
        recyclerView.setAdapter(adapter);


    }

    private void addData() {
        Task04WhatsappData whatsappData = new Task04WhatsappData("Talha", "Roze kese jaa rhe bhai?", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Zaid", "kha hote ho yaar ajkl?", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Abdullah", "iftaari p kb bula rhe ho?", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Saad", "mghe bhook lgi h", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Salman", "larke jldi aaja", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Zaid", "kha hote ho yaar ajkl?", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Abdullah", "iftaari p kb bula rhe ho?", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Saad", "mghe bhook lgi h", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Salman", "larke jldi aaja", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Zaid", "kha hote ho yaar ajkl?", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Abdullah", "iftaari p kb bula rhe ho?", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Saad", "mghe bhook lgi h", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Salman", "larke jldi aaja", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Zaid", "kha hote ho yaar ajkl?", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Abdullah", "iftaari p kb bula rhe ho?", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Saad", "mghe bhook lgi h", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Salman", "larke jldi aaja", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Zaid", "kha hote ho yaar ajkl?", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Abdullah", "iftaari p kb bula rhe ho?", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Saad", "mghe bhook lgi h", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Salman", "larke jldi aaja", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Zaid", "kha hote ho yaar ajkl?", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Abdullah", "iftaari p kb bula rhe ho?", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Saad", "mghe bhook lgi h", R.drawable.dill);
        recycleList.add(whatsappData);

        whatsappData = new Task04WhatsappData("Salman", "larke jldi aaja", R.drawable.dill);
        recycleList.add(whatsappData);

        adapter.notifyDataSetChanged();
    }
}