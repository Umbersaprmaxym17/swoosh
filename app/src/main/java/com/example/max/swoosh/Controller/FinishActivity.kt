package com.example.max.swoosh.Controller


import android.os.Bundle
import android.os.Parcelable
import com.example.max.swoosh.Model.Player
import com.example.max.swoosh.R
import com.example.max.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*


class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)



        searchLeaguesText.text = " Looking for ${player.league} ${player.skill} league near you ..."
    }
}
