package com.example.practical2_1_customcolors;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        TextView txt = findViewById(R.id.txtSample);
        txt.setBackgroundColor(getResources().getColor(R.color.myBackground));
        txt.setTextColor(getResources().getColor(R.color.myTextColor));
    }
}
