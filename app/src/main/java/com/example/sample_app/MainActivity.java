package com.example.sample_app;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sawolabs.androidsdk.Sawo;


public class MainActivity extends AppCompatActivity {
Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#FFFFFF"));

        // Set BackgroundDrawable
        getSupportActionBar().setBackgroundDrawable(colorDrawable);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.title);
        but = findViewById(R.id.button9);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Sawo(
                        MainActivity.this,
                        "f9b742de-bb6e-4c33-91f5-c8a62852e0c2", // your api key
                        "61b71d2ed364bdfb9b049af0gwONZmYmm9avP6IAj1cmmqC0" // your api key secret
                ).login(
                        "email", // can be one of 'email' or 'phone_number_sms'
                        CallbackActivity.class.getName()  // Callback class name
                );
            }

        });
    }



    }
