package com.example.tutorial06;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    EditText edtUsername, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
    }
    public void btnLoginClick(View view){
        String valUsername= edtUsername.getText().toString();
        String valPassword= edtPassword.getText().toString();
        if (valUsername.equals("")){
            Toast.makeText(this, "Username can be empty.", Toast.LENGTH_SHORT).show();
            return;
        }
        if (valPassword.equals("")){
            Toast.makeText(this, "Password can be empty.", Toast.LENGTH_SHORT).show();
            return;
        }
        if (valPassword.length() < 6){
            Toast.makeText(this, "Password must be of minimum 6 character.", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(valUsername).matches() ){
            Toast.makeText(this, "Username must be upper email address.", Toast.LENGTH_SHORT).show();
            return;
        }
        if(valUsername.equals("jparmar474@rku.ac.in")&& valPassword.equals("123456")){
            Intent intent =new Intent(Login.this,Welcome.class);
            Intent intent1 = intent.putExtra("username", valUsername);
            startActivity(intent);
            Toast.makeText(this, "Login Successfully", Toast.LENGTH_SHORT).show();
            finish();
        }else{
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }
    public void getRegister(View view)
    {
        startActivity(new Intent(Login.this,Registration.class));
    }
}
