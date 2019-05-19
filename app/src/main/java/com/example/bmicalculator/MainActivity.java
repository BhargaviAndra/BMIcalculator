package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText weight;
    private EditText height;
    private Button button;
    private TextView bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight=(EditText)findViewById(R.id.weight);
        height=(EditText)findViewById(R.id.height);
        button=(Button)findViewById(R.id.button);
        bmi=(TextView)findViewById(R.id.bmi);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double w=Double.parseDouble(weight.getText().toString());
                double h=Double.parseDouble(height.getText().toString());
                double b=w/(h*h);
                bmi.setText("Your BMI is "+b);
            }
        });
    }
}
