package com.example.movieapp2.presentation

import com.example.movieapp2.domain.model.Movie

data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)
