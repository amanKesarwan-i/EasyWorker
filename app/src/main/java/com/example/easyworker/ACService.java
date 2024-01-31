package com.example.easyworker;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.easyworker.models.CartModel;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class ACService extends AppCompatActivity {

    Button plumber1,plumber2,plumber3,plumber4,plumber5;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    FirebaseAuth auth = FirebaseAuth.getInstance();
    CartModel cartModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acservice);
        ActionBar actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#E73C34"));
        actionBar.setBackgroundDrawable(colorDrawable);
        plumber1 = findViewById(R.id.plumber1);
        plumber1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                TextView service = findViewById(R.id.plumberService1);
                TextView price = findViewById(R.id.plumberPrice1);
                TextView time = findViewById(R.id.plumberTime1);
                String user = auth.getCurrentUser().getUid();
                addToCart(user,service,price,time);
            }
        });
        plumber3 = findViewById(R.id.plumber3);
        plumber3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                TextView service = findViewById(R.id.plumberService3);
                TextView price = findViewById(R.id.plumberPrice3);
                TextView time = findViewById(R.id.plumberTime3);
                String user = auth.getCurrentUser().getUid();
                addToCart(user,service,price,time);
            }
        });
        plumber2 = findViewById(R.id.plumber2);
        plumber2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                TextView service = findViewById(R.id.plumberService2);
                TextView price = findViewById(R.id.plumberPrice2);
                TextView time = findViewById(R.id.plumberTime2);
                String user = auth.getCurrentUser().getUid();
                addToCart(user,service,price,time);
            }
        });
        plumber4 = findViewById(R.id.plumber4);
        plumber4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                TextView service = findViewById(R.id.plumberService4);
                TextView price = findViewById(R.id.plumberPrice4);
                TextView time = findViewById(R.id.plumberTime4);
                String user = auth.getCurrentUser().getUid();
                addToCart(user,service,price,time);
            }
        });
        plumber5 = findViewById(R.id.plumber5);
        plumber5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                TextView service = findViewById(R.id.plumberService5);
                TextView price = findViewById(R.id.plumberPrice5);
                TextView time = findViewById(R.id.plumberTime5);
                String user = auth.getCurrentUser().getUid();
                addToCart(user,service,price,time);
            }
        });
        ImageView home = (ImageView) findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ACService.this, "Help", Toast.LENGTH_SHORT).show();
                Intent help = new Intent(ACService.this,MainActivity.class);
                if (help.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(help);
                }
            }
        });

        ImageView help = (ImageView) findViewById(R.id.help);

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(ACService.this, "Help", Toast.LENGTH_SHORT).show();
                Intent help = new Intent(ACService.this,Help.class);
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

                Toast.makeText(ACService.this, "Service", Toast.LENGTH_SHORT).show();
                Intent service = new Intent(ACService.this, Service.class);

                if(service.resolveActivity(getPackageManager())!= null) {
                    startActivity(service);
                }
            }
        });

        ImageView share = (ImageView) findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ACService.this, "Share", Toast.LENGTH_SHORT).show();
                Intent share = new Intent(ACService.this,Share.class);
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
                Toast.makeText(ACService.this, "Account", Toast.LENGTH_SHORT).show();
                Intent account = new Intent(ACService.this,Account.class);
                if (account.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(account);
                }

            }
        });
    }

    public void addToCart(String user, TextView service, TextView price, TextView time)
    {
        // Create a new user with a first and last name
        Map<String, Object> cart = new HashMap<>();
        cart.put("userId", user);
        cart.put("service_name", service.getText());
        cart.put("price", price.getText());
        cart.put("time", time.getText());

// Add a new document with a generated ID
        db.collection("cart")
                .add(cart)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Toast.makeText(ACService.this,"Service booked successfully..",Toast.LENGTH_SHORT).show();
                        Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(ACService.this,"Some error occured..",Toast.LENGTH_SHORT).show();
                        Log.w(TAG, "Error adding document", e);
                    }
                });
    }
}