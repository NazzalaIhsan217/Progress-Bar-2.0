package com.ihsan.progressbar20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var progr = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateProgressBar()
        button_incr.setOnClickListener {
            if (progr <= 90) {
                progr += 10
                updateProgressBar()
            }
        }
        button_decr.setOnClickListener {
            if (progr >= 10) {
                progr -= 10
                updateProgressBar()
            }
        }
    }

    private fun updateProgressBar() {
        Progress.progress = progr
        text_view_progress.text = "$progr%"
    }

}