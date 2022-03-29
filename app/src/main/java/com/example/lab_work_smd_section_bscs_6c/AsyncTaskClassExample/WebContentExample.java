package com.example.lab_work_smd_section_bscs_6c.AsyncTaskClassExample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.util.concurrent.ExecutionException;

import javax.net.ssl.HttpsURLConnection;

public class WebContentExample extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_content_example);
        textView = findViewById(R.id.multilinetxtwebcontent);
    }

    public void Download_WebContent(View view) {
        WebContentDownload obj = new WebContentDownload();
        try {
            String RecievedData = obj.execute("https://www.bing.com/").get();
            Log.d("TAG","Back in MAIN!");
            textView.setText(RecievedData);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public class WebContentDownload extends AsyncTask<String,Void,String>
    {
        @Override
        protected String doInBackground(String... strings) {
            try {

                Log.d("TAG","doInBackground is in PROGRESS...");

                URL url = new URL(strings[0]);
                HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
                connection.connect();
                InputStream inputStream = connection.getInputStream();
                InputStreamReader reader = new InputStreamReader(inputStream);

                int data = reader.read(); // reader gives asci in int so type casting is necessary
                String webcontent = "";
                while(data != -1)
                {
                    char ch = (char) data;
                    webcontent += ch;
                    data=reader.read();
                }
                return webcontent;

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
