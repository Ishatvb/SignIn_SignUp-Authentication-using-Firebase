package com.example.signinsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private EditText editTextRegisterFullName, editTextRegisterEmail, editTextRegisterPhoneNumber, editTextRegisterPassword, editTextRegisterConfirmPassword;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Set Title
//        getSupportActionBar().setTitle("Register");

        //Toast
        Toast.makeText(RegisterActivity.this, "You can register now", Toast.LENGTH_LONG).show();

        // find views
//        editTextRegisterFullName = findViewById(R.id.editTextRegisterFullName);

    }
}