package com.example.pm01tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.pm01tarea1.MathFunctions;

public class MainActivity extends AppCompatActivity {

    private EditText input1, input2;
    private Button addButton, subtractButton, multiplyButton, divideButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = findViewById(R.id.num1);
        input2 = findViewById(R.id.num2);
        addButton = findViewById(R.id.btnsuma);
        subtractButton = findViewById(R.id.btnresta);
        multiplyButton = findViewById(R.id.btnmulti);
        divideButton = findViewById(R.id.btndiv);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = input1.getText().toString();
                String num2Str = input2.getText().toString();
                if (isNumeric(num1Str) && isNumeric(num2Str)) {
                    double num1 = Double.parseDouble(num1Str);
                    double num2 = Double.parseDouble(num2Str);
                    double result = MathFunctions.add(num1, num2);
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("result", result);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Inputs must be numeric", Toast.LENGTH_SHORT).show();
                }
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = input1.getText().toString();
                String num2Str = input2.getText().toString();
                if (isNumeric(num1Str) && isNumeric(num2Str)) {
                    double num1 = Double.parseDouble(num1Str);
                    double num2 = Double.parseDouble(num2Str);
                    double result = MathFunctions.subtract(num1, num2);
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("result", result);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Inputs must be numeric", Toast.LENGTH_SHORT).show();
                }
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = input1.getText().toString();
                String num2Str = input2.getText().toString();
                if (isNumeric(num1Str) && isNumeric(num2Str)) {
                    double num1 = Double.parseDouble(num1Str);
                    double num2 = Double.parseDouble(num2Str);
                    double result = MathFunctions.multiply(num1, num2);
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("result", result);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Inputs must be numeric", Toast.LENGTH_SHORT).show();
                }
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = input1.getText().toString();
                String num2Str = input2.getText().toString();
                if (isNumeric(num1Str) && isNumeric(num2Str)) {
                    double num1 = Double.parseDouble(num1Str);
                    double num2 = Double.parseDouble(num2Str);
                    double result = MathFunctions.divide(num1, num2);
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("result", result);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Inputs must be numeric", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}