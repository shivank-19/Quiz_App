package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button startbutton, aboutbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startbutton = findViewById(R.id.start);
        aboutbutton = findViewById(R.id.about);

        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryintent = new Intent(MainActivity.this, CategoriesActivity.class);
                startActivity(categoryintent);
            }
        });

    }
}
