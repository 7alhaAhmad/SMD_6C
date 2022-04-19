package com.example.lab_work_smd_section_bscs_6c.SensorExamples;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_work_smd_section_bscs_6c.R;

public class ProximityMainActivity extends AppCompatActivity {
    TextView textView;
    SensorManager sensorManager;
    Sensor sensor;
    SensorEventListener proximityEventListener = new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == Sensor.TYPE_PROXIMITY) {
                if (sensorEvent.values[0] == 0)
                    textView.setText("Object is Near");
                else
                    textView.setText("Object is Away");
            }
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int i) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximity_main);

        textView = findViewById(R.id.txtproximity);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        if (sensor == null)
            textView.setText("No Sensor Available");
        else {
            sensorManager.registerListener(proximityEventListener, sensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }
}