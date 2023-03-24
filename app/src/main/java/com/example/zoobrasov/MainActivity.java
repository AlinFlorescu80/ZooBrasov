package com.example.zoobrasov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        button1 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });


        button2 = findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });


        button3 = findViewById(R.id.button4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });

    }




    public void openActivity2(){
        Intent intent = new Intent(this, ProgramSiBilete.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this, Animale.class);
        startActivity(intent);
    }


    public void openActivity4(){
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }


    public void openActivity5(){
        Intent intent = new Intent(this, Harta.class);
        startActivity(intent);
    }


}