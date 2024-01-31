package com.example.easyworker;

import static androidx.constraintlayout.widget.ConstraintLayoutStates.TAG;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;

public class SignUp extends AppCompatActivity {
    TextView login;
    EditText mname,memail,mpassword,mphone;
//    Button mregisterBtn;
    FirebaseAuth mauth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mname = findViewById(R.id.name);
        memail = findViewById(R.id.email);
        mpassword = findViewById(R.id.password);
        mphone = findViewById(R.id.phone);
        View mregisterBtn = findViewById(R.id.registerBtn);

        mauth = FirebaseAuth.getInstance();


        ActionBar actionBar = getSupportActionBar();

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#E73C34"));
        actionBar.setBackgroundDrawable(colorDrawable);

//        if(mauth.getCurrentUser()!=null){
//            startActivity(new Intent(getApplicationContext(),MainActivity.class));
//            finish();
//        }

        mregisterBtn.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v)
            {
                String email = memail.getText().toString().trim();
                String password = mpassword.getText().toString().trim();
                String name = "Angel";//mname.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    memail.setError("Email is required..");
                    return;
                }
                if(TextUtils.isEmpty(password))
                {
                    mpassword.setError("Password is required..");
                    return;
                }
                if(password.length()<6){
                    mpassword.setError("Password must be 6 characters..");
                    return;
                }

                mauth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                                                                             // Sign in success
                             FirebaseUser user = mauth.getCurrentUser();
                             UserProfileChangeRequest profileUpdates = new UserProfileChangeRequest.Builder()
                                  .setDisplayName(name).build();

                            user.updateProfile(profileUpdates).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()) {
                                        Log.d(TAG, "User profile updated.");
                                    }
                                }
                            });

                                  Toast.makeText(SignUp.this,"User created",Toast.LENGTH_SHORT).show();
                                  startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        }
                        else{
                              Toast.makeText(SignUp.this,"Error ! "+task.getException().getMessage(),Toast.LENGTH_SHORT).show();

                        }
                    }
                }

                );
            }
        });


        login = (TextView) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUp.this, "Login", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignUp.this,Login.class);
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }


        });


    }
}