package com.example.easyworker;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;


public class FAQIntent extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqintent);
         ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#E73C34"));
        actionBar.setBackgroundDrawable(colorDrawable);

        LinearLayout accountFaq = (LinearLayout) findViewById(R.id.account_question);
        accountFaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FAQIntent.this, "Account", Toast.LENGTH_SHORT).show();
                Intent accountFaq = new Intent(FAQIntent.this,FaqAccount.class);
                if (accountFaq.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(accountFaq);
                }
            }
        });

        LinearLayout gettingStarted = (LinearLayout) findViewById(R.id.getting_start_with_examole);
        gettingStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FAQIntent.this, "Getting Started", Toast.LENGTH_SHORT).show();
                Intent gettingStarted = new Intent(FAQIntent.this,GettingStartWithEasyWorker.class);
                if (gettingStarted.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(gettingStarted);
                }
            }
        });

        LinearLayout paymentsEasyworker = (LinearLayout) findViewById(R.id.payments_credit);
        paymentsEasyworker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FAQIntent.this, "Payment & Credits", Toast.LENGTH_SHORT).show();
                Intent paymentsEasyworker = new Intent(FAQIntent.this,PaymentEasyWorkerCredits.class);
                if (paymentsEasyworker.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(paymentsEasyworker);
                }
            }
        });

        LinearLayout easyWorkerPlusMember = (LinearLayout) findViewById(R.id.membership);
        easyWorkerPlusMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FAQIntent.this, "Plus Membership", Toast.LENGTH_SHORT).show();
                Intent easyWorkerPlusMember = new Intent(FAQIntent.this,EasyWorkerPlusMember.class);
                if (easyWorkerPlusMember.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(easyWorkerPlusMember);
                }
            }
        });

        LinearLayout easyWorkerSafety = (LinearLayout) findViewById(R.id.esayworker_safety);
        easyWorkerSafety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FAQIntent.this, "Safety", Toast.LENGTH_SHORT).show();
                Intent easyworkerSafety = new Intent(FAQIntent.this,EasyWorkerSafety.class);
                if (easyworkerSafety.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(easyworkerSafety);
                }
            }
        });




    }
}