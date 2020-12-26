package com.dunchi.android_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.dunchi.android_view.general.MotionLayoutActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutBtn.setOnClickListener {
            startActivity(Intent(this,MotionLayoutActivity::class.java))
        }

        var spinnerItems = arrayOf("은비","쿠라","혜원","예나","채연","채원","민주","나코","토미","유리","유진","원영")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinnerItems)
        spinner.adapter = adapter
    }
}
