package com.example.mavenimporttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mymaventest.MavenTestUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MavenTestUtils.testLog();
    }
}