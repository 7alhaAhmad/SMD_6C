package com.example.lab_work_smd_section_bscs_6c.FileHandlingExample;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_work_smd_section_bscs_6c.R;
import com.google.android.material.snackbar.Snackbar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandlingExampleOne extends AppCompatActivity {

    EditText editText;
    TextView textView;
    String FILE_NAME = "MyTextFile";
    String readData="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_handling_example_one);
        editText=findViewById(R.id.edtwritedata);
        textView=findViewById(R.id.txtfileshowdata);
    }

    public void Save_Text_Into_File(View view) {
        String writeData = editText.getText().toString();
        try {
            FileOutputStream FOS = openFileOutput(FILE_NAME, Context.MODE_PRIVATE);
            FOS.write(writeData.getBytes());
            editText.setText("");
            Snackbar.make(view,"Data Saved",Snackbar.LENGTH_LONG).show();
            FOS.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Show_Data_From_File(View view) {
//        String readData="";
        try {
            FileInputStream FIS = openFileInput(FILE_NAME);
            InputStreamReader inputStreamReader = new InputStreamReader(FIS);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String value = bufferedReader.readLine();
            if( value == null){
                Toast.makeText(this, "File is Empty", Toast.LENGTH_SHORT).show();
            }
            else{
                while(value!= null){
                    readData += value;
                    value=bufferedReader.readLine();
                }
            }
            bufferedReader.close();
            inputStreamReader.close();
            FIS.close();
            textView.setText(readData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}