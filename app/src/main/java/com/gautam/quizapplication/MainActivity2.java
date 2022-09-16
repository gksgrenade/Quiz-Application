package com.gautam.quizapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String marks = intent.getStringExtra(MainActivity.EXTRA_NAME);
        txt = findViewById(R.id.textView);
        txt.setText("Your Score is " + marks);
    }
}