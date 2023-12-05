package com.example.hw3_albert_5_12_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btn;
    int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
    }

    public void lol(View view) {
        num++;
        if (num == 7)
        {
            num = 0 ;
            btn.setText("Enough to click. Go to new start!");

        }
        else
        btn.setText("This is a click number: "+num);
    }
}