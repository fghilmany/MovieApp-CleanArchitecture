package com.fghilmany.movieapp.presentation.favorite

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fghilmany.movieapp.R
import kotlinx.android.synthetic.main.activity_home.*

class FavoriteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        val sectionPagerAdapter = FavoriteSectionPagerAdapter(this, supportFragmentManager)
        view_pager.adapter = sectionPagerAdapter
        tabs.setupWithViewPager(view_pager)

    }
}
