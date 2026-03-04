package com.example.resourcedemoapp;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    boolean isLightMode = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        RelativeLayout mainLayout = findViewById(R.id.main_layout);
        TextView tvMessage = findViewById(R.id.tvMessage);
        Button btnToggle = findViewById(R.id.btnToggle);
        btnToggle.setOnClickListener(v -> {
            if (isLightMode) {
                mainLayout.setBackgroundColor(getResources().getColor(R.color.dark_background));
                tvMessage.setText(getString(R.string.dark_mode_text));
                tvMessage.setTextColor(getResources().getColor(R.color.dark_text));
                btnToggle.setText(getString(R.string.btn_light));
                isLightMode = false;
            } else {
                mainLayout.setBackgroundColor(getResources().getColor(R.color.light_background));
                tvMessage.setText(getString(R.string.light_mode_text));
                tvMessage.setTextColor(getResources().getColor(R.color.light_text));
                btnToggle.setText(getString(R.string.btn_dark));
                isLightMode = true;
            }
        });
    }
}
