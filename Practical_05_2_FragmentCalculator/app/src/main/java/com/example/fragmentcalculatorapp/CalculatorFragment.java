package com.example.fragmentcalculatorapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class CalculatorFragment extends Fragment {
    private EditText num1;
    private EditText num2;
    private TextView txtResult;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);

        num1 = view.findViewById(R.id.num1);
        num2 = view.findViewById(R.id.num2);
        txtResult = view.findViewById(R.id.txtResult);
        Button btnAdd = view.findViewById(R.id.btnAdd);
        Button btnSub = view.findViewById(R.id.btnSub);
        Button btnMul = view.findViewById(R.id.btnMul);
        Button btnDiv = view.findViewById(R.id.btnDiv);

        View.OnClickListener listener = v -> calculate(v.getId());
        btnAdd.setOnClickListener(listener);
        btnSub.setOnClickListener(listener);
        btnMul.setOnClickListener(listener);
        btnDiv.setOnClickListener(listener);

        return view;
    }

    private void calculate(int id) {
        if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
            txtResult.setText("Please enter both numbers");
            return;
        }

        double a = Double.parseDouble(num1.getText().toString());
        double b = Double.parseDouble(num2.getText().toString());
        double result;

        if (id == R.id.btnAdd) {
            result = a + b;
        } else if (id == R.id.btnSub) {
            result = a - b;
        } else if (id == R.id.btnMul) {
            result = a * b;
        } else {
            if (b == 0) {
                txtResult.setText("Division by zero not allowed");
                return;
            }
            result = a / b;
        }

        txtResult.setText("Result: " + result);
    }
}
