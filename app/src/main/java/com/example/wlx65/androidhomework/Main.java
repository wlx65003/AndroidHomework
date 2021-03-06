package com.example.wlx65.androidhomework;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Main extends MyActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实例化控件
        Button button_ex1 = findViewById(R.id.button_ex1);
        Button button_ex2_1 = findViewById(R.id.button_ex2_1);
        Button button_ex2_2 = findViewById(R.id.button_ex2_2);
        Button button_ex3 = findViewById(R.id.button_ex3);
        Button button_ex4_1 = findViewById(R.id.button_ex4_1);
        Button button_ex4_2 = findViewById(R.id.button_ex4_2);
        Button button_ex5 = findViewById(R.id.button_ex5);
        Button button_ex7_1 = findViewById(R.id.button_ex7_1);
        Button button_ex7_2 = findViewById(R.id.button_ex7_2);
        Button button_ex7_3 = findViewById(R.id.button_ex7_3);
        Button button_ex8 = findViewById(R.id.button_ex8);
        Button button_ex6 = findViewById(R.id.button_ex6);
        Button button_ex_json = findViewById(R.id.button_ex_json);
        Button button_ex10 = findViewById(R.id.button_ex10);
        Button button_ex11 = findViewById(R.id.button_ex11);
        Button button_ex12 = findViewById(R.id.button_ex12);

        //控件事件
        button_ex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Ex1.class);
                startActivity(intent);
            }
        });
        button_ex2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Ex2_1.class);
                startActivity(intent);
            }
        });
        button_ex2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Ex2_2.class);
                startActivity(intent);
            }
        });
        button_ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Ex3.class);
                startActivity(intent);
            }
        });
        button_ex4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Ex4_1.class);
                startActivity(intent);
            }
        });
        button_ex4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Ex4_2.class);
                startActivity(intent);
            }
        });
        button_ex5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Ex5.class);
                startActivity(intent);
            }
        });
        button_ex7_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Ex7_1.class);
                startActivity(intent);
            }
        });
        button_ex7_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Ex7_2.class);
                startActivity(intent);
            }
        });
        button_ex7_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Ex7_3.class);
                startActivity(intent);
            }
        });
        button_ex8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Ex8.class);
                startActivity(intent);
            }
        });
        button_ex_json.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Ex_json.class);
                startActivity(intent);
            }
        });
        button_ex10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Ex_10.class);
                startActivity(intent);
            }
        });
    }
}
