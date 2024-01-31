package com.example.easyworker;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Share extends AppCompatActivity {

    TextView whatsapp, code;
    String scode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        ActionBar actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#E73C34"));
        actionBar.setBackgroundDrawable(colorDrawable);

        whatsapp = (TextView) findViewById(R.id.whatsapp);
        code = (TextView) findViewById(R.id.sharecode);

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scode = code.getText().toString();

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone="+
                        "&text="+scode));

                if (i.resolveActivity(getPackageManager())!=null){


                    startActivity(i);
                    code.setText("");



                }else {

                    Toast.makeText(Share.this,"Whatsapp is not installed",Toast.LENGTH_SHORT).show();

                }

            }
        });





        ImageView home  = (ImageView) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Share.this, "Home", Toast.LENGTH_SHORT).show();
                Intent home = new Intent(Share.this,MainActivity.class);
                if (home.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(home);
                }
            }
        });

        ImageView help = (ImageView) findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Share.this, "Help", Toast.LENGTH_SHORT).show();
                Intent help = new Intent(Share.this,Help.class);
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
                Toast.makeText(Share.this, "Service", Toast.LENGTH_SHORT).show();
                Intent service = new Intent(Share.this,Service.class);
                if (service.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(service);
                }

            }
        });

        ImageView account = (ImageView) findViewById(R.id.account);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Share.this, "Account", Toast.LENGTH_SHORT).show();
                Intent account = new Intent(Share.this,Account.class);
                if (account.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(account);
                }
            }
        });

    }

//    private boolean isWhatappInstalled(){
//
//        PackageManager packageManager = getPackageManager();
//        boolean whatsappInstalled;
//
//        try {
//
//            packageManager.getPackageInfo("com.whatsapp",PackageManager.GET_ACTIVITIES);
//            whatsappInstalled = true;
//
//
//        }catch (PackageManager.NameNotFoundException e){
//
//            whatsappInstalled = false;
//
//        }
//
//        return whatsappInstalled;
//
//    }
}