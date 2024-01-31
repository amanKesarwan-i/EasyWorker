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

public class EasyWorkerPlusMember extends AppCompatActivity {

    LinearLayout benefits,discount,money_back,i_buy,with_cash,share_membership,cancel_membership,pause_membership;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_worker_plus_member);
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#E73C34"));
        actionBar.setBackgroundDrawable(colorDrawable);

        benefits = (LinearLayout) findViewById(R.id.benefits_of_the_membership);
        discount = (LinearLayout) findViewById(R.id.maximam_discount_that);
        i_buy = (LinearLayout) findViewById(R.id.i_buy_membership);
        money_back = (LinearLayout) findViewById(R.id.money_back_gurantee);
        with_cash = (LinearLayout) findViewById(R.id.membership_with_cash);
        share_membership = (LinearLayout) findViewById(R.id.i_share_membership_family);
        cancel_membership = (LinearLayout) findViewById(R.id.i_cancel_my_membership);
        pause_membership = (LinearLayout) findViewById(R.id.i_pause_membership);


        benefits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EasyWorkerPlusMember.this, "Open", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(EasyWorkerPlusMember.this,BenefitsOfTheMembership.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });

        discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EasyWorkerPlusMember.this, "Open", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(EasyWorkerPlusMember.this,CanGetByUsingPlus.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });
        i_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(EasyWorkerPlusMember.this, "Open", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(EasyWorkerPlusMember.this,IBuyTheMembership.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }

            }
        });
        money_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EasyWorkerPlusMember.this, "Open", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(EasyWorkerPlusMember.this,MoneyBackGurantee.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });

        with_cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EasyWorkerPlusMember.this, "Open", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(EasyWorkerPlusMember.this,IPayMembershipWithCash.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });

        share_membership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EasyWorkerPlusMember.this, "Open", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(EasyWorkerPlusMember.this,IShareMembershipWithFamily.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });
        cancel_membership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EasyWorkerPlusMember.this, "Open", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(EasyWorkerPlusMember.this,HowDoICancelMyMembershipPlan.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });
        pause_membership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EasyWorkerPlusMember.this, "Open", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(EasyWorkerPlusMember.this,CanIPauseMyMembership.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });


    }
}