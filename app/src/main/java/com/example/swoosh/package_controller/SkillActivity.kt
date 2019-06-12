package com.example.swoosh.package_controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import kotlinx.android.synthetic.main.activity_skill2.*

class SkillActivity : BaseActivity() {
    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill2)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onSkillFinishClicked(view: View) {
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level." ,Toast.LENGTH_SHORT).show()
        }
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        skill = "baller"
    }

    fun onBeginnerClicked(view: View){
        ballerSkillBtn.isChecked = false
        skill = "beginner"
    }


}
