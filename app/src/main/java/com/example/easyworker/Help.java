package com.example.easyworker;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        ActionBar actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#E73C34"));
        actionBar.setBackgroundDrawable(colorDrawable);

        TextView browswe_service = (TextView) findViewById(R.id.browser_service);

        browswe_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Help.this, "Home", Toast.LENGTH_SHORT).show();

                Intent browser_service = new Intent(Help.this,MainActivity.class);

                if (browser_service.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(browser_service);
                }
            }
        });

        ImageView home = (ImageView) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Help.this, "Home", Toast.LENGTH_SHORT).show();

                Intent home = new Intent(Help.this,MainActivity.class);
                if (home.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(home);
                }
            }
        });

        ImageView service = (ImageView) findViewById(R.id.sevice);

        service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Help.this, "Service", Toast.LENGTH_SHORT).show();

                Intent service = new Intent(Help.this,Service.class);
                if (service.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(service);
                }
            }
        });

        ImageView share = (ImageView) findViewById(R.id.share);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Help.this, "Share", Toast.LENGTH_SHORT).show();

                Intent share = new Intent(Help.this,Share.class);
                if (share.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(share);
                }
            }
        });

        ImageView account = (ImageView) findViewById(R.id.account);

        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Help.this, "Account", Toast.LENGTH_SHORT).show();

                Intent account = new Intent(Help.this,Account.class);
                if (account.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(account);
                }
            }
        });

        TextView faq = (TextView) findViewById(R.id.faq);
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Help.this, "FAQ", Toast.LENGTH_SHORT).show();
                Intent faq = new Intent(Help.this,FAQIntent.class);
                if (faq.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(faq);
                }
            }
        });


    }
}