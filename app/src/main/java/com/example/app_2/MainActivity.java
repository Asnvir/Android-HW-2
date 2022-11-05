package com.example.app_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {


    private EditText main_INPUT_name;
    private EditText main_INPUT_salary;
    private MaterialButton main_BTN_calculate;
    private MaterialTextView main_OUTPUT_name;
    private MaterialTextView main_OUTPUT_salary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_INPUT_name = findViewById(R.id.main_INPUT_name);
        main_INPUT_salary = findViewById(R.id.main_INPUT_salary);
        main_BTN_calculate = findViewById(R.id.main_BTN_calculate);
        main_OUTPUT_name = findViewById(R.id.main_OUTPUT_name);
        main_OUTPUT_salary = findViewById(R.id.main_OUTPUT_salary);

        main_BTN_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });
    }


    private void calculate() {
        main_OUTPUT_name.setText(main_INPUT_name.getText().toString());
        main_OUTPUT_salary.setText(main_INPUT_salary.getText().toString());
    }
}