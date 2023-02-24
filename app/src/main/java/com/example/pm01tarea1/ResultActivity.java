package com.example.pm01tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        double result = getIntent().getDoubleExtra("result", 0.0);

        TextView resultadoop = findViewById(R.id.operacionresult);
        resultadoop.setText(String.valueOf(result));
    }
}