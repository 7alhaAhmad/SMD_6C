package com.example.lab_work_smd_section_bscs_6c.PermissionExamples;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_work_smd_section_bscs_6c.R;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.DexterError;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.PermissionRequestErrorListener;
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
        Dexter.withContext(this).withPermissions(Manifest.permission.INTERNET,
                Manifest.permission.CAMERA,
                Manifest.permission.ACCESS_FINE_LOCATION)
                .withListener(new MultiplePermissionsListener() {
                    @Override
                    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
                        if(multiplePermissionsReport.areAllPermissionsGranted())
                        {
                            Toast.makeText(PermissionExampleTwoWithDexter.this, "All Permissions are Granted", Toast.LENGTH_SHORT).show();
                        }
                        if(multiplePermissionsReport.isAnyPermissionPermanentlyDenied())
                        {
                            Toast.makeText(PermissionExampleTwoWithDexter.this, "Go To Settings and Grant this Permission", Toast.LENGTH_SHORT).show();
                            showSettingDialog();
                        }
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
                        permissionToken.continuePermissionRequest();
                    }
                }).withErrorListener(new PermissionRequestErrorListener() {
            @Override
            public void onError(DexterError dexterError) {
                Toast.makeText(PermissionExampleTwoWithDexter.this, "Error Occurred.", Toast.LENGTH_SHORT).show();
            }
        }).onSameThread().check();
    }

    private void showSettingDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Need Permission");
        builder.setMessage("This Application needs permission to use this specific feature, You can grant this permission in the App Settings.");
        builder.setPositiveButton("Go To Settings", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent((Settings.ACTION_APPLICATION_DETAILS_SETTINGS)); //does not open settings.
                Uri uri = Uri.fromParts("Package",getPackageName(),null);
                intent.setData(uri);
                startActivityForResult(intent,101);
            }
        });
        builder.show();
    }
}