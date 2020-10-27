package com.sawolabs.sdkdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sawolabs.androidsdk.Sawo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickLogin(view: View) {
        Sawo(
            this,
            "", // your api key,
            "" // your secret key
        ).login(
            "email", // can be one of 'email' or 'phone_number_sms'
            CallbackActivity::class.java.name // Callback class name
        )
    }
}