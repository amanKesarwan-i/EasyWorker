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

public class FaqAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq_account);
        ActionBar actionBar;
        actionBar=getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#E73C34"));
        actionBar.setBackgroundDrawable(colorDrawable);

        LinearLayout changeMyNumber = (LinearLayout) findViewById(R.id.want_change_my_phone_no);
        changeMyNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FaqAccount.this, "Open", Toast.LENGTH_SHORT).show();
                Intent changeMyNumber = new Intent(FaqAccount.this,IwantToChangeMyPhoneNumber.class);
                if (changeMyNumber.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(changeMyNumber);
                }
            }
        });
        LinearLayout checkMySavedAddress = (LinearLayout) findViewById(R.id.saved_address);
        checkMySavedAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FaqAccount.this, "Open", Toast.LENGTH_SHORT).show();
                Intent checkMySavedAddress = new Intent(FaqAccount.this,WhereCanCheckMySavedAddress.class);
                if (checkMySavedAddress.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(checkMySavedAddress);
                }
            }
        });
        LinearLayout myEmailAddress = (LinearLayout) findViewById(R.id.my_email_address);
        myEmailAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FaqAccount.this, "Open", Toast.LENGTH_SHORT).show();
                Intent myEmailAddress = new Intent(FaqAccount.this,IWantToChangeMyEmailAddress.class);
                if (myEmailAddress.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(myEmailAddress);
                }
            }
        });
        LinearLayout savedPaymentDetails = (LinearLayout) findViewById(R.id.saved_payment_details);
        savedPaymentDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FaqAccount.this, "Open", Toast.LENGTH_SHORT).show();
                Intent savedPaymentDetails = new Intent(FaqAccount.this,SavedMyPaymentDetails.class);
                if (savedPaymentDetails.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(savedPaymentDetails);
                }
            }
        });



    }
}