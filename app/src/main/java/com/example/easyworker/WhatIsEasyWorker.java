package com.example.easyworker;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class WhatIsEasyWorker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_is_easy_worker);
        ActionBar actionBar =getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#E4473F"));
        actionBar.setBackgroundDrawable(colorDrawable);
    }
}