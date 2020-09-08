package com.fghilmany.movieapp.core.domain.usecase


import com.fghilmany.movieapp.core.data.Resource
import com.fghilmany.movieapp.core.domain.model.Movie
import com.fghilmany.movieapp.core.domain.model.TvSeries
import com.fghilmany.movieapp.core.domain.repository.IDataRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.junit.Test
import org.junit.Before
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DataUseCaseTest {

    private lateinit var dataUseCase: DataUseCase

    @Mock private lateinit var dataRepository: IDataRepository

    private val movieId = "419704"
    private val tvId = "93533"

    @Before
    fun setUp() {
        dataUseCase = DataInteractor(dataRepository)
        val dummyListMovieResponse : Flow<Resource<List<Movie>>> = flow { Resource.Success(listOf(MOVIE)) }
        val dummyMovieResponse : Flow<Resource<Movie>> = flow { Resource.Success(MOVIE) }
        val dummyListTvResponse : Flow<Resource<List<TvSeries>>> = flow { Resource.Success(listOf(TVSERIES)) }
        val dummyTvResponse : Flow<Resource<TvSeries>> = flow { Resource.Success(listOf(TVSERIES)) }
        val dummyFavoriteMovieResponse : Flow<List<Movie>> = flow { Resource.Success(listOf(MOVIE)) }
        val dummyFavoriteTvResponse : Flow<List<TvSeries>> = flow { Resource.Success(listOf(TVSERIES)) }

        `when`(dataRepository.getListMovie()).thenReturn(dummyListMovieResponse)
        `when`(dataRepository.getListTv()).thenReturn(dummyListTvResponse)
        `when`(dataRepository.getDetailMovie(movieId)).thenReturn(dummyMovieResponse)
        `when`(dataRepository.getDetailTv(tvId)).thenReturn(dummyTvResponse)
        `when`(dataRepository.getFavoriteMovie()).thenReturn(dummyFavoriteMovieResponse)
        `when`(dataRepository.getFavoriteTvSeries()).thenReturn(dummyFavoriteTvResponse)
        `when`(dataRepository.getListMovie()).thenReturn(dummyListMovieResponse)
        `when`(dataRepository.getListMovie()).thenReturn(dummyListMovieResponse)
    }

    @Test
    fun getListMovie() {
        dataUseCase.getListMovie()
        Mockito.verify(dataRepository).getListMovie()
        Mockito.verifyNoMoreInteractions(dataRepository)
    }

    @Test
    fun getListTv() {
        dataUseCase.getListTv()
        Mockito.verify(dataRepository).getListTv()
        Mockito.verifyNoMoreInteractions(dataRepository)
    }

    @Test
    fun getDetailTv() {
        dataUseCase.getDetailTv(tvId)
        Mockito.verify(dataRepository).getDetailTv(tvId)
        Mockito.verifyNoMoreInteractions(dataRepository)
    }

    @Test
    fun getDetailMovie() {
        dataUseCase.getDetailMovie(movieId)
        Mockito.verify(dataRepository).getDetailMovie(movieId)
        Mockito.verifyNoMoreInteractions(dataRepository)
    }

    @Test
    fun getFavoriteMovie() {
        dataUseCase.getFavoriteMovie()
        Mockito.verify(dataRepository).getFavoriteMovie()
        Mockito.verifyNoMoreInteractions(dataRepository)
    }

    @Test
    fun getFavoriteTvSeries() {
        dataUseCase.getFavoriteTvSeries()
        Mockito.verify(dataRepository).getFavoriteTvSeries()
        Mockito.verifyNoMoreInteractions(dataRepository)
    }


    companion object {
        val MOVIE = Movie(0,
            "test",
            "test",
            0f,
            "test",
            "test",
            "test",
            "test",
            false)

        val TVSERIES = TvSeries(0,
            "test",
            "test",
            0f,
            "test",
            "test",
            "test",
            "test",
            "test",
            false)
    }
}