package com.uniqbha.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;
import com.uniqbha.myapplication.databinding.ActivityHomeBinding;
import com.uniqbha.myapplication.databinding.ActivityMainBinding;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(v -> {
            String email = binding.txtEmailSatu.getText().toString();
            String password = binding.txtPassword.getText().toString();
            if(email.equals("budi@gmail.com") && password.equals("123")) {
                Snackbar.make(binding.getRoot(), "Username dan password benar", Snackbar.LENGTH_SHORT).show();
            } else {
                Snackbar.make(binding.getRoot(), "Username dan password salah", Snackbar.LENGTH_SHORT).show();
            }
        });

        binding.txtEmailSatu.setOnClickListener( __ -> {

        });



    }
}

