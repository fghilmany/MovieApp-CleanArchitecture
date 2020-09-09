package com.fghilmany.movieapp.presentation.favorite.movie

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.fghilmany.movieapp.R
import com.fghilmany.movieapp.core.ui.FavoriteMovieAdapter
import com.fghilmany.movieapp.presentation.detail.DetailActivity
import kotlinx.android.synthetic.main.fragment_favorite_movie.*
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 */
class FavoriteMovieFragment : Fragment() {

    private val viewModel: FavoriteMovieViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorite_movie, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity != null) {

            val favoriteAdapter = FavoriteMovieAdapter { movie ->
                val i = Intent(activity, DetailActivity::class.java)
                i.putExtra(DetailActivity.EXTRA_ID_MOVIE, movie.id.toString())
                startActivity(i)
            }
            viewModel.getMovies().observe(viewLifecycleOwner, Observer { movie ->
                if (movie != null) {
                    view_empty.visibility = if (movie.isNotEmpty()) View.GONE else View.VISIBLE
                    favoriteAdapter.setMovies(movie)
                    favoriteAdapter.notifyDataSetChanged()
                }
            })


            rv_favorite_movie.layoutManager = LinearLayoutManager(context)
            rv_favorite_movie.setHasFixedSize(true)
            rv_favorite_movie.adapter = favoriteAdapter
        }
    }

}
