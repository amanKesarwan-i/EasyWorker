package com.example.easyworker;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Account extends AppCompatActivity {
    FirebaseAuth auth = FirebaseAuth.getInstance();
    LinearLayout login,about,share;
    TextView logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        ActionBar actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#E73C34"));
        actionBar.setBackgroundDrawable(colorDrawable);

        if(auth != null)
        {
            String name = ""+auth.getCurrentUser().getEmail();
            TextView username = findViewById(R.id.useremail);
            username.setText(name);


            //Logout functionality end

        }



       about = (LinearLayout) findViewById(R.id.about_urban_company);
       share = (LinearLayout) findViewById(R.id.share_easyworker);
       logout = (TextView) findViewById(R.id.logout);
       logout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               FirebaseAuth.getInstance().signOut();
               startActivity(new Intent(getApplicationContext(),Login.class));
               finish();
           }
       });


       about.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(Account.this, "About", Toast.LENGTH_SHORT).show();
               Intent intent = new Intent(Account.this,WhatIsEasyWorker.class);
               if (intent.resolveActivity(getPackageManager())!=null)
               {
                   startActivity(intent);
               }
           }
       });
       share.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(Account.this, "Share", Toast.LENGTH_SHORT).show();
               Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
               if (intent.resolveActivity(getPackageManager())!=null)
               {
                   startActivity(intent);
               }
           }
       });




        ImageView help = (ImageView) findViewById(R.id.help);

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Account.this, "Help", Toast.LENGTH_SHORT).show();
                Intent help = new Intent(Account.this,Help.class);
                if (help.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(help);
                }
            }
        });

        ImageView service = (ImageView) findViewById(R.id.sevice);
        service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Account.this, "Service", Toast.LENGTH_SHORT).show();
                Intent service = new Intent(Account.this, Service.class);

                if(service.resolveActivity(getPackageManager())!= null) {
                    startActivity(service);
                }
            }
        });

        ImageView share = (ImageView) findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Account.this, "Share", Toast.LENGTH_SHORT).show();
                Intent share = new Intent(Account.this,Share.class);
                if (share.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(share);
                }

            }
        });

        ImageView home = (ImageView) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Account.this, "Home", Toast.LENGTH_SHORT).show();
                Intent account = new Intent(Account.this,MainActivity.class);
                if (account.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(account);
                }

            }
        });




    }
}