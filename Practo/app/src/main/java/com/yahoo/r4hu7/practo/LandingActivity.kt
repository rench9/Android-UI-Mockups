package com.yahoo.r4hu7.practo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_landing.*

class LandingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setDisplayUseLogoEnabled(true)
        supportActionBar!!.setIcon(R.drawable.icon)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

        btnRegLogin.setOnClickListener {
            startActivity(Intent(applicationContext, LoginActivity::class.java))
        }


    }
}
