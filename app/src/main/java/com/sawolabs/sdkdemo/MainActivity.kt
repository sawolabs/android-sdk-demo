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
            "495705a7-f0ff-4c22-98f4-62896b338bd2", // your api key,
            "5f7a08e816af29f6aad5b7f2WsZPQMaW5oZGNuEXbdewXWGF" // your secret key
        ).login(
            "email", // can be one of 'email' or 'phone_number_sms'
            CallbackActivity::class.java.name // Callback class name
        )
    }
}