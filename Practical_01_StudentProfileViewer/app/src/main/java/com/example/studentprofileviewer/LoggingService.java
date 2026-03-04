package com.example.studentprofileviewer;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class LoggingService extends Service {
    private static final String TAG = "LoggingService";
    @Override public void onCreate() { super.onCreate(); Log.d(TAG, "Service Created"); }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String name = intent != null ? intent.getStringExtra("NAME") : "";
        String roll = intent != null ? intent.getStringExtra("ROLL") : "";
        Log.d(TAG, "Profile Viewed: " + name + " (Roll: " + roll + ")");
        return START_NOT_STICKY;
    }
    @Override public void onDestroy() { super.onDestroy(); Log.d(TAG, "Service Destroyed"); }
    @Override public IBinder onBind(Intent intent) { return null; }
}
