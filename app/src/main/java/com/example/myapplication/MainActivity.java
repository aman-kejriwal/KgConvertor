package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
//import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button button;
private TextView textview;
private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textview = findViewById(R.id.textView4);
        editText = findViewById(R.id.editTextNumber);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                String s=editText.getText().toString();
//                Toast.makeText(MainActivity.this, "program executed", Toast.LENGTH_SHORT).show();
//                int n=Integer.parseInt(s);
//                double pound =2.205*n;
//                textview.setText("The Corresponding Of Value Of Pound Is "+ pound);
//                        }
//  });
    }
        public void calculate(View view) {
            String s=editText.getText().toString();
                Toast.makeText(MainActivity.this, "program executed", Toast.LENGTH_SHORT).show();
                int n=Integer.parseInt(s);
                double pound =2.205*n;
                textview.setText("The Corresponding Value Of Pound Is "+ pound);
        }
    }
