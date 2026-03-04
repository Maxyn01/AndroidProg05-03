package com.example.activitylifecycledemo;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView tvLifecycle;
    private static final String TAG = "ActivityLifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLifecycle = findViewById(R.id.tvLifecycle);
        tvLifecycle.setText("onCreate() called");
        Log.d(TAG, "onCreate() executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        tvLifecycle.setText("onStart() called");
        Log.d(TAG, "onStart() executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        tvLifecycle.setText("onResume() called");
        Log.d(TAG, "onResume() executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() executed");
    }
}
