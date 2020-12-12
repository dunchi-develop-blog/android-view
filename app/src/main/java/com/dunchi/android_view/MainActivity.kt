package com.dunchi.android_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dunchi.android_view.general.MotionLayoutActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutBtn.setOnClickListener {
            startActivity(Intent(this,MotionLayoutActivity::class.java))
        }
    }
}
