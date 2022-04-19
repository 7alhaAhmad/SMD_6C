package com.example.lab_work_smd_section_bscs_6c.ServiceExample.BoundServiceExample;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.example.lab_work_smd_section_bscs_6c.R;

public class MyBoundService extends Service {
    public MyBoundService() {
    }

    public Binder myBinder = new MyBinder();
    public MediaPlayer mediaPlayer;

    public MyBoundService(Binder myBinder) {
        this.myBinder = myBinder;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return myBinder;
    }

    @Override
    public void onCreate() {
        mediaPlayer = MediaPlayer.create(this, R.raw.smallaudio);
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mediaPlayer.release();
    }

    public void Play() {
        mediaPlayer.start();
    }

    public void Pause() {
        mediaPlayer.pause();
    }

    public boolean isPlaying() {
        return mediaPlayer.isPlaying();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    public class MyBinder extends Binder {
        MyBoundService getServiceMethod() {
            return MyBoundService.this;
        }
    }
}
