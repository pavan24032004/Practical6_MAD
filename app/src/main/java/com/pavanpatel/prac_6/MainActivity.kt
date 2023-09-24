package com.pavanpatel.prac_6

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pavanpatel.prac_6.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val playbtn=findViewById<FloatingActionButton>(R.id.floatingActionButton3)
        val stopbtn=findViewById<FloatingActionButton>(R.id.floatingActionButton4)

        playbtn.setOnClickListener(){
            play()
        }

        stopbtn.setOnClickListener(){
            stop()
        }
    }
    fun play(){
        val apply =Intent(applicationContext, MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply{startService(this)}
    }
    fun stop(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYRKEY,MyService.PLAYERVALUE).apply{startService(this)}

    }
}