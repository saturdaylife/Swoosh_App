package com.example.swoosh.package_controller

import android.os.Bundle
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_LEAGUE

class SkillActivity : BaseActivity() {
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill2)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }
}
