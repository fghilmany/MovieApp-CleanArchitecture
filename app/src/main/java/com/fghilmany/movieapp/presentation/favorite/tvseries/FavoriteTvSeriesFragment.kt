package com.fghilmany.movieapp.presentation.favorite.tvseries

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager

import com.fghilmany.movieapp.R
import com.fghilmany.movieapp.core.ui.FavoriteTvSeriesAdapter
import com.fghilmany.movieapp.presentation.detail.DetailActivity
import kotlinx.android.synthetic.main.fragment_favorite_tv_series.*
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 */
class FavoriteTvSeriesFragment : Fragment() {

    private val viewModel: FavoriteTvSeriesViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorite_tv_series, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity != null) {

            val favoriteAdapter =
                FavoriteTvSeriesAdapter{tv ->
                    val i = Intent(activity, DetailActivity::class.java)
                    i.putExtra(DetailActivity.EXTRA_ID_TV, tv.id.toString())
                    startActivity(i)
                }
            viewModel.getMovies().observe(this, Observer { movie ->
                if (movie != null){
                    favoriteAdapter.setMovies(movie)
                    favoriteAdapter.notifyDataSetChanged()
                }
            })


            rv_favorite_tv.layoutManager = LinearLayoutManager(context)
            rv_favorite_tv.setHasFixedSize(true)
            rv_favorite_tv.adapter = favoriteAdapter
        }
    }

}
