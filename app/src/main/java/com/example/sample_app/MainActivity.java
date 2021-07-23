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
                        "d703a9a3-51ef-403b-a3e5-04ca450f3cd5", // your api key,
                        "60c79cd2e5859f64414f77d889HZXkm0XLGxca8sXVFnjvXq" // your api key secret
                ).login(
                        "email", // can be one of 'email' or 'phone_number_sms'
                        CallbackActivity.class.getName()  // Callback class name
                );
            }

        });
    }



    }
