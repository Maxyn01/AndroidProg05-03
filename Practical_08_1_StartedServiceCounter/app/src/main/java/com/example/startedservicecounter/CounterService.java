package com.example.startedservicecounter;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;
public class CounterService extends Service {
    private Handler handler; private Runnable runnable; private int counter = 0; private boolean isRunning = false;
    @Override public int onStartCommand(Intent intent, int flags, int startId) {
        if (isRunning) { Log.d("CounterService", "Service already running"); return START_STICKY; }
        isRunning = true; handler = new Handler();
        runnable = new Runnable() { @Override public void run() { counter++; Log.d("CounterService", "Counter: " + counter); handler.postDelayed(this, 1000);} };
        handler.post(runnable); Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show(); return START_STICKY;
    }
    @Override public void onDestroy() { super.onDestroy(); if (handler != null && runnable != null) handler.removeCallbacks(runnable); isRunning = false; counter = 0; Toast.makeText(this, "Service Stopped", Toast.LENGTH_SHORT).show(); Log.d("CounterService", "Service Destroyed"); }
    @Override public IBinder onBind(Intent intent) { return null; }
}
