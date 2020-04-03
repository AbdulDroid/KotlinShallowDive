package com.example.kotlinshallowdive.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinshallowdive.Kotlin
import com.example.kotlinshallowdive.KotlinIntro
import com.example.kotlinshallowdive.R
import com.example.kotlinshallowdive.playGround

class MainActivity : AppCompatActivity() {
    var name: String = "Abdul"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        playGround(multiplier = 100)

        println("Kotlin==>${Kotlin("Abdul")}")
        println("KotlinIntro==>${KotlinIntro()}")
    }
}
