package com.example.tutorial06;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }
    public void btnLogin(View view) {

        Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(Registration.this,Login.class);
        startActivity(intent);
        finish();
    }
}