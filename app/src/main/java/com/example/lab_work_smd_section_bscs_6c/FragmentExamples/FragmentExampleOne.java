package com.example.lab_work_smd_section_bscs_6c.FragmentExamples;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.lab_work_smd_section_bscs_6c.R;

public class FragmentExampleOne extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fragment_example_one);


        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        Configuration config = getResources().getConfiguration();
        if (config.orientation == Configuration.ORIENTATION_PORTRAIT)
        {
            PM_Fragment pm_fragment = new PM_Fragment();
            FT.replace(android.R.id.content,pm_fragment);
        }
        else //if (config.orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            LM_Fragment lm_fragment = new LM_Fragment();
            FT.replace(android.R.id.content,lm_fragment);
        }
        FT.commit();
    }
}