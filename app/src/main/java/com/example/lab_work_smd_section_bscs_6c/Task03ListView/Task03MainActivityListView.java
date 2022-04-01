package com.example.lab_work_smd_section_bscs_6c.Task03ListView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import com.example.lab_work_smd_section_bscs_6c.R;

public class Task03MainActivityListView extends AppCompatActivity {

    ListView listView;
    String[] citiesArr;
    String[] visitsArr;
    String[] likesArr;

    int img[] = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e};
    int dill[] = {R.drawable.dill,R.drawable.dill,R.drawable.dill,R.drawable.dill,R.drawable.dill};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task03_main_list_view);
        listView = findViewById(R.id.lstviewt3);

        Context context = getApplicationContext();
        citiesArr = context.getResources().getStringArray(R.array.citiesArr);
        visitsArr = context.getResources().getStringArray(R.array.visitsArr);
        likesArr = context.getResources().getStringArray(R.array.likesArr);

        listViewAdapter adapter = new listViewAdapter(this, citiesArr, likesArr, visitsArr, img, dill);
        listView.setAdapter(adapter);

    }
}