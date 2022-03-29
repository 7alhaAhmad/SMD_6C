package com.example.lab_work_smd_section_bscs_6c.PermissionExamples;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_work_smd_section_bscs_6c.R;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import java.util.List;

public class PermissionExampleTwoWithDexter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission_example_two_with_dexter);
    }

    public void CheckMyPermission(View view) {
        Check_My_Permissions();
    }

    private void Check_My_Permissions() {
        Dexter.withContext(this).withPermissions(android.Manifest.permission.INTERNET,
                android.Manifest.permission.CAMERA,
                android.Manifest.permission.ACCESS_FINE_LOCATION)
                .withListener(new MultiplePermissionsListener() {
                    @Override
                    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
                        if(multiplePermissionsReport.areAllPermissionsGranted())
                        {
                            Toast.makeText(PermissionExampleTwoWithDexter.this, "All Permissions are Grated", Toast.LENGTH_SHORT).show();
                        }
                        if(multiplePermissionsReport.isAnyPermissionPermanentlyDenied())
                        {
                            Toast.makeText(PermissionExampleTwoWithDexter.this, "Go To Settings and Grant this Permission", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {

                    }
                });
    }
}