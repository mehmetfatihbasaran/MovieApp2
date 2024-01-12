package com.example.movieapp2.presentation

import com.example.movieapp2.domain.model.Movie

data class MovieListState(
    val isLoading: Boolean = false,
    val popularMovieList: List<Movie> = emptyList(),
    val upcomingMovieList: List<Movie> = emptyList(),
    val popularMovieListPage: Int = 1,
    val upcomingMovieListPage: Int = 1,
    val isCurrentPopularScreen: Boolean = true,
    val error: String? = null
)
