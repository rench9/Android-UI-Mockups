package com.yahoo.r4hu7.mugen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login2.*

class LoginActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        btn.setOnClickListener {
            startActivity(Intent(applicationContext, LoginActivity3::class.java)) }
    }
}
