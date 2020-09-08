package com.fghilmany.movieapp.presentation.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.rule.ActivityTestRule
import com.fghilmany.movieapp.R
import com.fghilmany.movieapp.core.data.source.local.entity.MovieEntity
import com.fghilmany.movieapp.core.data.source.local.entity.TvSeriesEntity
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Rule
import org.junit.Test

class HomeActivityTest{
    private val movie = listOf<MovieEntity>()
    private val tv = listOf<TvSeriesEntity>()

    @get:Rule
    var activityRule  = ActivityTestRule(HomeActivity::class.java)


    @Test
    fun loadMovie() {
        onView(withId(R.id.rv_movie))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.rv_movie))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(movie.size))
        onView(withId(R.id.rv_movie))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(1,
                click()
            ))

        onView(withId(R.id.btn_favorite)).perform(click())
    }

    @Test
    fun loadTv() {
        onView(withText("Tv Series")).perform(click())
        onView(withId(R.id.rv_tv))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.rv_tv))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(tv.size))
        onView(withId(R.id.rv_tv))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(1,
                click()
            ))

        onView(withId(R.id.btn_favorite)).perform(click())
    }

    @Test
    fun loadDetailMovie(){
        onView(withId(R.id.rv_movie))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0,
                click()
            ))
        onView(withId(R.id.tv_title))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.tv_overview))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.iv_poster_detail))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.btn_favorite)).perform(click())

    }

    @Test
    fun loadDetailTv(){
        onView(withText("Tv Series")).perform(click())
        onView(withId(R.id.rv_tv))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0,
                    click()
                ))
        onView(withId(R.id.tv_title))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.tv_overview))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.iv_poster_detail))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.btn_favorite)).perform(click())

    }

    @Test
    fun loadFavoriteMovie(){
        onView(withId(R.id.action_favorite)).perform(click())
        onView(withId(R.id.rv_favorite_movie))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.rv_favorite_movie))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(movie.size))
        onView(withId(R.id.rv_favorite_movie))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0,
                click()
            ))
    }

    @Test
    fun loadFavoriteTvSeries(){
        onView(withId(R.id.action_favorite)).perform(click())
        onView(withText("Tv Series")).perform(click())
        onView(withId(R.id.rv_favorite_tv))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.rv_favorite_tv))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(movie.size))
        onView(withId(R.id.rv_favorite_tv))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0,
                click()
            ))
    }
}