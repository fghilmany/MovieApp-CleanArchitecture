package com.fghilmany.movieapp.presentation.tvseries

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
import com.fghilmany.movieapp.core.ui.TvSeriesAdapter
import com.fghilmany.movieapp.presentation.detail.DetailActivity
import kotlinx.android.synthetic.main.fragment_tv_series.*
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 */
class TvSeriesFragment : Fragment() {

    private val viewModel: TvSeriesViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_series, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity != null) {

            val movieAdapter = TvSeriesAdapter { tv ->
                val i = Intent(activity, DetailActivity::class.java)
                i.putExtra(DetailActivity.EXTRA_ID_TV, tv.id.toString())
                startActivity(i)
            }
            viewModel.getMovies().observe(viewLifecycleOwner, Observer { tv ->
                if (tv != null) {
                    when (tv) {
                        is Resource.Loading -> progress_bar.visibility = View.VISIBLE
                        is Resource.Success -> {
                            progress_bar.visibility = View.GONE
                            movieAdapter.setMovies(tv.data)
                            movieAdapter.notifyDataSetChanged()
                        }
                        is Resource.Error -> {
                            progress_bar.visibility = View.GONE
                            Toast.makeText(context, "Terjadi kesalahan", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            })

            rv_tv.layoutManager = LinearLayoutManager(context)
            rv_tv.setHasFixedSize(true)
            rv_tv.adapter = movieAdapter

        }
    }


}
