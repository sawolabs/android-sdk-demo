package com.example.sample_app;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sawolabs.androidsdk.Sawo;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {
Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#FFFFFF"));

        // Set BackgroundDrawable
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(colorDrawable);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.title);
        but = findViewById(R.id.button9);
        but.setOnClickListener(v -> new Sawo(
                MainActivity.this,
                "5c7b09f0-a8a8-4995-87ca-68db8704e00e", // your api key
                "61b84223d364bdfb9b049bd6ZrLVThXPyHRXp2aW6QTqANp4" // your api key secret
        ).login(
                "email", // can be one of 'email' or 'phone_number_sms'
                CallbackActivity.class.getName()  // Callback class name
        ));
    }



    }
