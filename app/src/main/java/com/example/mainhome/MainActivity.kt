package com.example.mainhome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager



class MainActivity : AppCompatActivity() {

    internal lateinit var vp: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vp = findViewById(R.id.vp) as ViewPager
        vp.adapter = A(this)

    }

    inner class PagerRunnable : Runnable {
        override fun run() {
            while (true) {
                Thread.sleep(2000)
            }
        }
    }
}