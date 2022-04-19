package com.example.lab_work_smd_section_bscs_6c.ServiceExample.BoundServiceExample;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_work_smd_section_bscs_6c.R;

public class BoundServiceExampleMainActivity extends AppCompatActivity {
    public BoundServiceExampleMainActivity() {
    }

    public boolean myBoundService = false;
    MyBoundService myBoundMediaPlayService;
    public ServiceConnection myServiceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MyBoundService.MyBinder myBinder = (MyBoundService.MyBinder) iBinder;
            myBoundMediaPlayService = myBinder.getServiceMethod();
            myBoundService = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bound_service_example_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = new Intent(this, MyBoundService.class);
        bindService(intent, myServiceConnection, BIND_AUTO_CREATE);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (myBoundService)
            unbindService(myServiceConnection);
    }

    public void Play_Pause(View view) {
        if (myBoundService) {
            if (myBoundMediaPlayService.isPlaying()) {
                myBoundMediaPlayService.Pause();
                Toast.makeText(myBoundMediaPlayService, "Audio Paused", Toast.LENGTH_SHORT).show();
            }
            else
            {
                myBoundMediaPlayService.Play();
                Toast.makeText(myBoundMediaPlayService, "Audio Resumed", Toast.LENGTH_SHORT).show();
            }
        }
    }
}