package com.egci428.mobileproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_log_in.*

class logInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

      /*  mainLoginBtn.setOnClickListener{
            var intent = Intent(this, rankingActivity::class.java)
            startActivity(intent)
        }*/
    }
}
