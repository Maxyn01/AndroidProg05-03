package com.example.fragmentcommunicationapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements InputFragment.OnMessageSendListener {
    private DisplayFragment displayFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputFragment inputFragment = new InputFragment();
        displayFragment = new DisplayFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container_input, inputFragment)
                .replace(R.id.fragment_container_display, displayFragment)
                .commit();
    }

    @Override
    public void onMessageSend(String message) {
        if (displayFragment != null) {
            displayFragment.updateMessage(message);
        }
    }
}
