package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;


import java.util.Random;

public class ThirdActivity extends AppCompatActivity {
    private Vopros[] vseVoprosi = new Vopros[]{
            new Vopros("3-2=_","2","3","1",3),
            new Vopros("5+3=_","4","9","8",3),
            new Vopros("_+1=2","1","4","11",1),
            new Vopros("2+8=_","28","10","6",2),

    };
    private TextView zadanieTV;
    private Button otvet1Btn;
    private Button otvet2Btn;
    private Button otvet3Btn;
    private TextView vivodTV;
    private Button dalsheBtn;
    private TextView vernoTV;
    private TextView shetchikTV;
    private int shetchik = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        zadanieTV = findViewById(R.id.zadanie);
        otvet1Btn = findViewById(R.id.otvet1);
        otvet2Btn = findViewById(R.id.otvet2);
        otvet3Btn = findViewById(R.id.otvet3);
        vivodTV = findViewById(R.id.Vivod);
        dalsheBtn = findViewById(R.id.dalshe);
        shetchikTV = findViewById(R.id.verno);
        sledVopros();
    }
    private void pokazatVopros(Vopros v){
        zadanieTV.setText(v.text);
        otvet1Btn.setText(v.otvet1);
        otvet2Btn.setText(v.otvet2);
        otvet3Btn.setText(v.otvet3);
        otvet1Btn.setVisibility(View.VISIBLE);
        otvet2Btn.setVisibility(View.VISIBLE);
        otvet3Btn.setVisibility(View.VISIBLE);
        vivodTV.setVisibility(View.INVISIBLE);
        dalsheBtn.setVisibility(View.INVISIBLE);
        shetchikTV.setText(""+shetchik);
        shetchikTV.setTextColor(Color.GREEN);
    }
    private Vopros vopros;
    private Random random = new Random();
    private void sledVopros(){
        vopros = vseVoprosi[random.nextInt(vseVoprosi.length)];
        pokazatVopros(vopros);
    }
    public void otvet1Clicked(View v){
        if (vopros.pravotvet == 1) {
            vivodTV.setText("Верно");
            vivodTV.setTextColor(Color.GREEN);
            shetchik++;
        }
        else {
            vivodTV.setText("Неверно");
            vivodTV.setTextColor(Color.RED);
        }
        vivodTV.setVisibility(View.VISIBLE);
        dalsheBtn.setVisibility(View.VISIBLE);
        otvet2Btn.setVisibility(View.INVISIBLE);
        otvet3Btn.setVisibility(View.INVISIBLE);
    }
    public void otvet2Clicked(View v){
        if (vopros.pravotvet == 2) {
            vivodTV.setText("Верно");
            vivodTV.setTextColor(Color.GREEN);
            shetchik++;
        }
        else {
            vivodTV.setText("Неверно");
            vivodTV.setTextColor(Color.RED);
        }
        vivodTV.setVisibility(View.VISIBLE);
        dalsheBtn.setVisibility(View.VISIBLE);
        otvet1Btn.setVisibility(View.INVISIBLE);
        otvet3Btn.setVisibility(View.INVISIBLE);
    }
    public void otvet3Clicked(View v){
        if (vopros.pravotvet == 3) {
            vivodTV.setText("Верно");
            vivodTV.setTextColor(Color.GREEN);
            shetchik++;
        }
        else {
            vivodTV.setText("Неверно");
            vivodTV.setTextColor(Color.RED);
        }
        vivodTV.setVisibility(View.VISIBLE);
        dalsheBtn.setVisibility(View.VISIBLE);
        otvet2Btn.setVisibility(View.INVISIBLE);
        otvet1Btn.setVisibility(View.INVISIBLE);
    }
    public void dalsheClicked(View v){
        sledVopros();
    }

}