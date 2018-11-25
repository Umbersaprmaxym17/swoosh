package com.example.max.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.max.swoosh.Model.Player
import com.example.max.swoosh.R
import com.example.max.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBeginnerCliked(view: View){
        ballerScillBtn.isChecked = false
        player.skill ="Beginner"
    }

    fun onBallerClicked(view: View){
        begginerSkillBtn.isChecked = false
        player.skill = "Baller"
    }


    fun onSckillFinishClicked(view: View){
        if (player.skill !=""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select your skill level ", Toast.LENGTH_LONG).show()
        }

    }



}
