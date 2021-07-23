package com.sawolabs.sdkdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.sawolabs.androidsdk.LOGIN_SUCCESS_MESSAGE
import org.json.JSONObject

class CallbackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_callback)

        val message = intent.getStringExtra(LOGIN_SUCCESS_MESSAGE)
        findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
}