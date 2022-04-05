package com.example.lab_work_smd_section_bscs_6c.StaticFragmentExample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_work_smd_section_bscs_6c.R;

public class MyContactsMainActivity extends AppCompatActivity implements ContactsFragment.ListSelectionListener {

    public static String[] contactsArray;
    public static String[] contactsDetailsArray;

    DetailsFragment detailsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_contacts_main);

        contactsArray = getResources().getStringArray(R.array.contacts_array);
        contactsDetailsArray = getResources().getStringArray(R.array.details_array);
        detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailfragment);
    }

    @Override
    public void onSelection(int position) {
        if (detailsFragment.getShownIndex() != position) {
            detailsFragment.ContactIndex(position);
        }
    }
}