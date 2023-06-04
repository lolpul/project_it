package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void startMatematikaActivity(View c) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    public void startRussianActivity(View c) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}