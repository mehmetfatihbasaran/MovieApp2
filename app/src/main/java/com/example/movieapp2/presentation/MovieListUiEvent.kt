package com.example.movieapp2.presentation

sealed interface MovieListUiEvent {

    data class Paginate(val category: String) : MovieListUiEvent
    data object Navigate: MovieListUiEvent

}