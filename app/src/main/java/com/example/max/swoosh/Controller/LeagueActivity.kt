package com.example.max.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.max.swoosh.Utilities.EXTRA_LEAGUE
import com.example.max.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }

    fun onMensClicked(view: View){
        womensLeagueBtn.isChecked = false
        coEdBtn.isChecked = false
        selectedLeague = "mens"

    }

    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked = false
        coEdBtn.isChecked = false
        selectedLeague = "womens"

    }

    fun onCoEdBtnClicked(view: View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        selectedLeague = "co-ed"

    }

    fun leagueNextClicked(view: View){
        if(selectedLeague != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Please select a league " , Toast.LENGTH_SHORT).show()
        }


    }










}
