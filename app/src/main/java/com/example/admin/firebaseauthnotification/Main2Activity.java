package com.example.admin.firebaseauthnotification;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "Main2Activity";
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void signOut(View view){

        mAuth = FirebaseAuth.getInstance();
        mAuth.signOut();

        if(mAuth.getCurrentUser() == null){
            Toast.makeText(this, "Signed out", Toast.LENGTH_SHORT).show();
            finish();
        }

    }

    private void signOut() {

    }

}
