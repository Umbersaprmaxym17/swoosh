package com.example.max.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.max.swoosh.Utilities.EXTRA_LEAGUE
import com.example.max.swoosh.R
import com.example.max.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onBeginnerCliked(view: View){
        ballerScillBtn.isChecked = false
        skill ="Beginner"
    }

    fun onBallerClicked(view: View){
        begginerSkillBtn.isChecked = false
        skill = "Baller"
    }


    fun onSckillFinishClicked(view: View){
        if (skill !=""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select your skill level ", Toast.LENGTH_LONG).show()
        }

    }



}
