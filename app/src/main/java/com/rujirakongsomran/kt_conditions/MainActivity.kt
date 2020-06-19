package com.rujirakongsomran.kt_conditions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var text = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlayString.setOnClickListener {
            // Find max with 2 number
            val a = 10 // Use val if value not changed, like final in java
            val b = 20
            val max = if (a>b) a else b
            Log.d("MAX NUMBER", "" + max)

        }
    }
}