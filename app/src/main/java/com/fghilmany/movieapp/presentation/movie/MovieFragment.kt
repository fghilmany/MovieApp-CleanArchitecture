package com.fghilmany.movieapp.presentation.movie

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.fghilmany.movieapp.R
import com.fghilmany.movieapp.core.data.Resource
import com.fghilmany.movieapp.core.ui.MovieAdapter
import com.fghilmany.movieapp.presentation.detail.DetailActivity
import kotlinx.android.synthetic.main.fragment_movie.*
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 */
class MovieFragment : Fragment() {

    private val viewModel: MovieViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity != null) {
            /*val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[MovieViewModel::class.java]
*/
            val movieAdapter = MovieAdapter { movie ->
                val i = Intent(activity, DetailActivity::class.java)
                i.putExtra(DetailActivity.EXTRA_ID_MOVIE, movie.id.toString())
                startActivity(i)
            }
            viewModel.getMovies().observe(viewLifecycleOwner, Observer { movie ->
                if (movie != null) {
                    when (movie) {
                        is Resource.Loading -> progress_bar.visibility = View.VISIBLE
                        is Resource.Success -> {
                            progress_bar.visibility = View.GONE
                            movieAdapter.setMovies(movie.data)
                            movieAdapter.notifyDataSetChanged()
                        }
                        is Resource.Error -> {
                            progress_bar.visibility = View.GONE
                            Toast.makeText(context, "Terjadi kesalahan", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            })


            rv_movie.layoutManager = LinearLayoutManager(context)
            rv_movie.setHasFixedSize(true)
            rv_movie.adapter = movieAdapter
        }
    }
}
