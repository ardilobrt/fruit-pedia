package com.junarcho.fruit_pedia

import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.bumptech.glide.Glide
import com.junarcho.buah_pedia.R


class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_ENGLISH = "extra_english"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_BENEFIT = "extra_benefit"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val photo: ImageView = findViewById(R.id.tv_img_detail)
        val tvName: TextView = findViewById(R.id.tv_name)
        val tvEnglishName: TextView = findViewById(R.id.tv_english_name)
        val tvDetail: TextView = findViewById(R.id.tv_detail)
        val tvBenefit: TextView = findViewById(R.id.tv_benefit)

        val imgDataReceived = intent.getIntExtra(EXTRA_IMAGE, 0)
        val nameReceived = intent.getStringExtra(EXTRA_NAME)
        val englishReceived = intent.getStringExtra(EXTRA_ENGLISH)
        val detailReceived = intent.getStringExtra(EXTRA_DETAIL)
        val benefitReceived = intent.getStringExtra(EXTRA_BENEFIT)

        Glide.with(this)
            .load(imgDataReceived)
            .into(photo)
        tvName.text = nameReceived
        tvEnglishName.text = englishReceived
        tvEnglishName.isClickable = false
        tvDetail.text = detailReceived
        tvBenefit.text = benefitReceived

        setActionBarTitle()
    }

    private fun setActionBarTitle() {

        supportActionBar?.title = " "
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        window.statusBarColor = Color.TRANSPARENT
        WindowCompat.setDecorFitsSystemWindows(window, false)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}