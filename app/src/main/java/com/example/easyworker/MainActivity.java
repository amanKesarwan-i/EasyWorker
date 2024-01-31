package com.example.easyworker;

import android.Manifest;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.easyworker.adapters.CategoryAdapter;
import com.example.easyworker.models.CategoryModel;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth auth = FirebaseAuth.getInstance();
    EditText address;
    LinearLayout getLocation;
    FusedLocationProviderClient fusedLocationProviderClient;
    LinearLayout plumberservice, eletricianservice, maidservice, mechanicservice, acservice, carpanter;
    TextView maid,eletrician;

    RecyclerView catRecyclerView;
    CategoryAdapter categoryAdapter;
    List<CategoryModel> categoryModelList;

    private final static int REQUEST_CODE = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if(auth==null){
            startActivity(new Intent(getApplicationContext(),Login.class));
            finish();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        if(auth != null)
        {
            String name = "Welcome! "+auth.getCurrentUser().getEmail();
            TextView username = findViewById(R.id.username);
            username.setText(name);


            //Logout functionality end

        }
        plumberservice = (LinearLayout) findViewById(R.id.plumberservice);
        maidservice = (LinearLayout) findViewById(R.id.maidservice);
        carpanter = (LinearLayout) findViewById(R.id.carpanterservice);
        acservice = (LinearLayout) findViewById(R.id.acservice);
        mechanicservice = (LinearLayout) findViewById(R.id.mechanicservice);
        address = (EditText) findViewById(R.id.address);
        getLocation = (LinearLayout) findViewById(R.id.getLocation);
        maid = (TextView) findViewById(R.id.maids);
        eletrician = (TextView) findViewById(R.id.eletricians);

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);

        ImageView help = (ImageView) findViewById(R.id.help);

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Help", Toast.LENGTH_SHORT).show();
                Intent help = new Intent(MainActivity.this,Help.class);
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

                Toast.makeText(MainActivity.this, "Service", Toast.LENGTH_SHORT).show();
                Intent service = new Intent(MainActivity.this, Service.class);

                if(service.resolveActivity(getPackageManager())!= null) {
                    startActivity(service);
                }
            }
        });

        ImageView share = (ImageView) findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Share", Toast.LENGTH_SHORT).show();
                Intent share = new Intent(MainActivity.this,Share.class);
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
                Toast.makeText(MainActivity.this, "Account", Toast.LENGTH_SHORT).show();
                Intent account = new Intent(MainActivity.this,Account.class);
                if (account.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(account);
                }

            }
        });

        getLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getLastLocation();
            }
        });

        plumberservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Plumber Service", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, PlumberService.class);
                if (intent.resolveActivity(getPackageManager())!= null)
                {
                    startActivity(intent);
                }
            }
        });
        eletricianservice=(LinearLayout) findViewById(R.id.eletricianservice);
        eletricianservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Electrician Services", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, EletricianService.class);
                if (intent.resolveActivity(getPackageManager())!= null)
                {
                    startActivity(intent);
                }
            }
        });
        maidservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Maid Services", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MaidService.class);
                if (intent.resolveActivity(getPackageManager())!= null)
                {
                    startActivity(intent);
                }
            }
        });
        carpanter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Carpanter Services", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, CarpanterService.class);
                if (intent.resolveActivity(getPackageManager())!= null)
                {
                    startActivity(intent);
                }
            }
        });
        mechanicservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Mechanic Services", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MechanicService.class);
                if (intent.resolveActivity(getPackageManager())!= null)
                {
                    startActivity(intent);
                }
            }
        });
        acservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "AC Services", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ACService.class);
                if (intent.resolveActivity(getPackageManager())!= null)
                {
                    startActivity(intent);
                }
            }
        });
        maid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Maid Service", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MaidService.class);
                if (intent.resolveActivity(getPackageManager())!= null)
                {
                    startActivity(intent);
                }
            }
        });
        eletrician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "AC Services", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, EletricianService.class);
                if (intent.resolveActivity(getPackageManager())!= null)
                {
                    startActivity(intent);
                }
            }
        });

    }

    private void getLastLocation()
    {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){

            fusedLocationProviderClient.getLastLocation()
                    .addOnSuccessListener(new OnSuccessListener<Location>() {
                        @Override
                        public void onSuccess(Location location) {

                            if (location != null){

                                try {
                                    Geocoder geocoder = new Geocoder(MainActivity.this, Locale.getDefault());
                                    List<Address> addresses = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);

                                    address.setText(addresses.get(0).getAddressLine(0));

                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    });
        }else {

            askPermission();
        }
        }
    private void askPermission() {

        ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},REQUEST_CODE);


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull @org.jetbrains.annotations.NotNull String[] permissions, @NonNull @org.jetbrains.annotations.NotNull int[] grantResults) {

        if (requestCode == REQUEST_CODE){

            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){


                getLastLocation();

            }else {


                Toast.makeText(MainActivity.this,"Please provide the required permission",Toast.LENGTH_SHORT).show();

            }

        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
    }
