package com.yahoo.r4hu7.chatapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class LandingActivity : AppCompatActivity() {
    companion object {
        val LOGINDIALOGUE = "twoFactorDialogue"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)
        showLoginDialogue()
    }

    private fun showLoginDialogue() {

        val ft = supportFragmentManager.beginTransaction()
        val prev = supportFragmentManager.findFragmentByTag(LOGINDIALOGUE)
        if (prev != null) {
            ft.remove(prev)
        }
        ft.addToBackStack(null)

        val dialogFragment = LoginDialogFragment()
        dialogFragment.isCancelable = false
        dialogFragment.show(supportFragmentManager, LOGINDIALOGUE)
    }
}
