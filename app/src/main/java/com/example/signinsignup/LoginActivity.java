package com.example.signinsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Set Title
//        getSupportActionBar().setTitle("Login");

        //Toast
        Toast.makeText(LoginActivity.this, "You can login now", Toast.LENGTH_LONG).show();
    }
}