package com.example.mainhome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import android.os.Handler
import android.os.Looper


class MainActivity : AppCompatActivity() {

    internal lateinit var vp: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vp = findViewById(R.id.vp) as ViewPager
        vp.adapter = A(this)

    }
}