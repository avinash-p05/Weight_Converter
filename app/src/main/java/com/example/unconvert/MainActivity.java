package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button b,b1;
private TextView textView;
private EditText editText,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.button);
        b1 = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextTextPersonName);
        editText2 = findViewById(R.id.editTextTextPersonName2);

    }
    //function to convert kg to lbs
    public void calculate(View view){
        String s = editText.getText().toString();
        double kg = Double.parseDouble(s);
        double pound = 2.205 * kg;
        editText2.setText(""+Math.round(pound*100.0)/100.0);
    }
    //function to convert lbs to kg
    public void calculate1(View view){
        String s = editText.getText().toString();
        double lbs = Double.parseDouble(s);
        double kg = lbs/2.205;
        editText2.setText(""+Math.round(kg*100.0)/100.0);
    }
}