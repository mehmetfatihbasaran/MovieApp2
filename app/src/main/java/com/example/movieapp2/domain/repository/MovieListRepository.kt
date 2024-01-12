package com.example.movieapp2.domain.repository

import com.example.movieapp2.domain.model.Movie
import com.example.movieapp2.utils.Resource
import kotlinx.coroutines.flow.Flow

interface MovieListRepository {

    suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<Movie>>>

    suspend fun getMovieById(id: Int): Flow<Resource<Movie>>
}