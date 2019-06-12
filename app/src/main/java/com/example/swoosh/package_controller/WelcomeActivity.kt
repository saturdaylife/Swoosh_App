package com.example.swoosh.package_controller

import android.content.Intent
import android.os.Bundle
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : BaseActivity() {

    // bundles are data objects that contain key value pairs
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedBtn.setOnClickListener {

            // an intent is an object that lets you interact with other applications or your own.
            /* implicit intent = specifies an action type and sends it to android system to respond to an intent (if there
                                  are too many apps, it will leave you with the choices of compatible apps*/
            // explicit intent = these are specific intent to open a specific app
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }

    }
}
