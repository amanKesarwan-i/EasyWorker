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

public class PaymentEasyWorkerCredits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_easy_worker_credits);
        ActionBar actionBar;
        actionBar=getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#E73C34"));
        actionBar.setBackgroundDrawable(colorDrawable);
        LinearLayout walletBalance = (LinearLayout) findViewById(R.id.my_wallet);
        walletBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PaymentEasyWorkerCredits.this, "Open", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(PaymentEasyWorkerCredits.this,MyWalletBalance.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });
        LinearLayout credits = (LinearLayout) findViewById(R.id.credits);
        credits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PaymentEasyWorkerCredits.this, "Open", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(PaymentEasyWorkerCredits.this,MyEasyWorkerCredits.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });
        LinearLayout extendValidity = (LinearLayout) findViewById(R.id.extends_the_validity);
        extendValidity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PaymentEasyWorkerCredits.this, "Open", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(PaymentEasyWorkerCredits.this,ValidityOfTheReward.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });
        LinearLayout referralWork = (LinearLayout) findViewById(R.id.referral_code);
        referralWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PaymentEasyWorkerCredits.this, "Open", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(PaymentEasyWorkerCredits.this,ReferralWork.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });
        LinearLayout receivedReferral = (LinearLayout) findViewById(R.id.reward_for_referral);
        receivedReferral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PaymentEasyWorkerCredits.this, "Open", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(PaymentEasyWorkerCredits.this,RewardForReferral.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });
        LinearLayout savedPayment = (LinearLayout) findViewById(R.id.saved_payment);
        savedPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PaymentEasyWorkerCredits.this, "Open", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(PaymentEasyWorkerCredits.this,ISeeMtSavedPaymentDetails.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });
    }
}