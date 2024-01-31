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

public class GettingStartWithEasyWorker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getting_start_with_easy_worker);
        ActionBar actionbar;
        actionbar=getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#E73C34"));
        actionbar.setBackgroundDrawable(colorDrawable);

        LinearLayout whatIsEasyWorker = (LinearLayout) findViewById(R.id.what_is_easy_worker);
        whatIsEasyWorker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GettingStartWithEasyWorker.this, "Open", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(GettingStartWithEasyWorker.this,WhatIsEasyWorker.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });
        LinearLayout placeBooking  = (LinearLayout) findViewById(R.id.place_a_book);
        placeBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GettingStartWithEasyWorker.this, "Open", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(GettingStartWithEasyWorker.this,HowtoPlaceBooking.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });
        LinearLayout sameProfessional = (LinearLayout) findViewById(R.id.same_professional);
        sameProfessional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GettingStartWithEasyWorker.this, "Open", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(GettingStartWithEasyWorker.this,CanIReBookTheSameProfessional.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });
        LinearLayout myPreferred = (LinearLayout) findViewById(R.id.book_my_preferred);
        myPreferred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GettingStartWithEasyWorker.this, "Open", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(GettingStartWithEasyWorker.this,HowToBookMypreferredProgram.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });
        LinearLayout minimumValue = (LinearLayout) findViewById(R.id.minimum_value_of_service);
        minimumValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GettingStartWithEasyWorker.this, "Open", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(GettingStartWithEasyWorker.this,DoIHvaeToOrderTheminimumValueTo.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });
        LinearLayout cancellationFees = (LinearLayout) findViewById(R.id.cancellation_fees);
        cancellationFees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GettingStartWithEasyWorker.this, "Open", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(GettingStartWithEasyWorker.this,DoesEasyWorkerChangeAnyCancellationFees.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });






    }
}