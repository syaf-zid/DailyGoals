package com.example.dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Intent intent = getIntent();
        String[] data = intent.getStringArrayExtra("data");

        TextView tvMaterial = findViewById(R.id.textViewMaterial);
        tvMaterial.setText("Read up on materials before class: " + data[0]);
        TextView tvArrive = findViewById(R.id.textViewArrive);
        tvArrive.setText("Arrive on time so as not to miss important part of the lesson: " + data[1]);
        TextView tvAttempt = findViewById(R.id.textViewAttempt);
        tvAttempt.setText("Attempt the problem myself: " + data[2]);
        TextView tvReflection = findViewById(R.id.textViewReflection);
        tvReflection.setText("Reflection: " + data[3]);
    }
}
