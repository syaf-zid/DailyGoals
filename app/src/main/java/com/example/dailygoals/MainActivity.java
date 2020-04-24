package com.example.dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOK = findViewById(R.id.button);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioGroup rg1 = findViewById(R.id.radioGroup1);
                int selectedBtnId1 = rg1.getCheckedRadioButtonId();
                RadioButton rb1 = findViewById(selectedBtnId1);
                String rb1Text = rb1.getText().toString();

                RadioGroup rg2 = findViewById(R.id.radioGroup2);
                int selectedBtnId2 = rg2.getCheckedRadioButtonId();
                RadioButton rb2 = findViewById(selectedBtnId2);
                String rb2Text = rb2.getText().toString();

                RadioGroup rg3 = findViewById(R.id.radioGroup3);
                int selectedBtnId3 = rg3.getCheckedRadioButtonId();
                RadioButton rb3 = findViewById(selectedBtnId3);
                String rb3Text = rb3.getText().toString();

                EditText etReflection = findViewById(R.id.editText);
                String etText = etReflection.getText().toString();
                
                String[] data = {rb1Text, rb2Text, rb3Text, etText};
                Intent intent = new Intent(MainActivity.this, Summary.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });
    }
}
