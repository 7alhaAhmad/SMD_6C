package com.example.lab_work_smd_section_bscs_6c.SQLiteExample;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.HashMap;

public class NewContactActivity extends AppCompatActivity {

    EditText firstName, secondName, phoneNumber, emailAddress, homeAddress;
    DbTool dbTools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_contact);
        firstName = findViewById(R.id.editfirstname);
        secondName = findViewById(R.id.edtsecondname);
        phoneNumber = findViewById(R.id.edtphonenumber);
        emailAddress = findViewById(R.id.edtemail);
        homeAddress = findViewById(R.id.edthomeaddress);
        dbTools = new DbTool(getApplicationContext());
    }

    public void SaveContact(View view) {
        HashMap<String, String> contact = new HashMap<>();
//        contact.put("firstName", firstName.getText().toString());
//        contact.put("secondName", secondName.getText().toString());
//        contact.put("phoneNumber", phoneNumber.getText().toString());
//        contact.put("emailAddress", emailAddress.getText().toString());
//        contact.put("homeAddress", homeAddress.getText().toString());
        contact.put("firstName", "ABC1");
        contact.put("secondName", "ABC1");
        contact.put("phoneNumber", "ABC1");
        contact.put("emailAddress", "ABC1");
        contact.put("homeAddress", "ABC1");
        dbTools.AddContact(contact);
        Log.d("TA1G", "CONTACT ADDED SUCCESSFULLY");
    }
}