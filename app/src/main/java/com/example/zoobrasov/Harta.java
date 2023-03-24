package com.example.zoobrasov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class Harta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harta);


        Fragment fragment =new Map_Fragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,fragment).commit();
    }
}