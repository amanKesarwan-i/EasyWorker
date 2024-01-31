package com.example.easyworker;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class EasyWorkerSafety extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_worker_safety);
        ActionBar actionBar;
        actionBar= getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#E73C34"));
        actionBar.setBackgroundDrawable(colorDrawable);
        LinearLayout safetyCovid = (LinearLayout) findViewById(R.id.covid19);
        safetyCovid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EasyWorkerSafety.this, "Open", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(EasyWorkerSafety.this,SafetyAndCovid.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });
        LinearLayout vaccinated = (LinearLayout) findViewById(R.id.vaccinated);
        vaccinated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EasyWorkerSafety.this, "Open", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(EasyWorkerSafety.this,ProfessionalsVaccinated.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });

    }
}