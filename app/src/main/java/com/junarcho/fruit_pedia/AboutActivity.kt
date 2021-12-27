package com.junarcho.fruit_pedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.junarcho.buah_pedia.R

class AboutActivity : AppCompatActivity() {

    private var title: String = "About Developer"

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setActionBarTitle(title)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}