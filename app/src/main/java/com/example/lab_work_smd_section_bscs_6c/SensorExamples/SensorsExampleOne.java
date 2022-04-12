package com.example.lab_work_smd_section_bscs_6c.SensorExamples;

import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_work_smd_section_bscs_6c.R;

public class SensorsExampleOne extends AppCompatActivity implements SensorEventListener {

    SensorManager sensorManager;
    boolean color = false;
    View view;
    long lastTimeUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensors_example_one);

        lastTimeUpdate = System.currentTimeMillis();
        view = findViewById(R.id.txtsensorvalue);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            getMyAccelerometerValues(sensorEvent);
        }
    }

    private void getMyAccelerometerValues(SensorEvent sensorEvent) {
        float[] value = sensorEvent.values;
        float x, y, z;
        x = value[0];
        y = value[1];
        z = value[2];

        float acceleration = (x * x + y * y + z * z) / (SensorManager.GRAVITY_EARTH * SensorManager.GRAVITY_EARTH);
        long actualTime = sensorEvent.timestamp;
        if (acceleration >= 2) {
            if (actualTime - lastTimeUpdate < 150) {
                return;
            }
            lastTimeUpdate = actualTime;
            Toast.makeText(this, "Device was Moved", Toast.LENGTH_SHORT).show();
            if (color) {
                view.setBackgroundColor(Color.RED);
            }
            else
                view.setBackgroundColor(Color.GREEN);
            color = !color;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this,sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),sensorManager.SENSOR_DELAY_NORMAL);
        sensorManager.unregisterListener(this);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}