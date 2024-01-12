package com.example.movieapp2.data.mappers

import com.example.movieapp2.data.local.movie.MovieEntity
import com.example.movieapp2.data.remote.model.MovieDTO
import com.example.movieapp2.domain.model.Movie


fun MovieDTO.toMovieEntity(category: String): MovieEntity {
    return MovieEntity(
        adult = adult ?: false,
        backdrop_path = backdrop_path ?: "",
        genre_ids = try {
            genre_ids?.joinToString(",") ?: "-1,-2,-3"
        } catch (e: Exception) {
            "-1,-2,-3"
        },
        id = id ?: 0,
        original_language = original_language ?: "",
        original_title = original_title ?: "",
        overview = overview ?: "",
        popularity = popularity ?: 0.0,
        poster_path = poster_path ?: "",
        release_date = release_date ?: "",
        title = title ?: "",
        video = video ?: false,
        vote_average = vote_average ?: 0.0,
        vote_count = vote_count ?: 0,
        category = category
    )
}

fun MovieEntity.toMovie(category: String): Movie {
    return Movie(
        adult = adult,
        backdrop_path = backdrop_path,
        genre_ids = try {
            genre_ids.split(",").map { it.toInt() }
        } catch (e: Exception) {
            listOf(-1, -2, -3)
        },
        id = id,
        original_language = original_language,
        original_title = original_title,
        overview = overview,
        popularity = popularity,
        poster_path = poster_path,
        release_date = release_date,
        title = title,
        video = video,
        vote_average = vote_average,
        vote_count = vote_count,
        category = category
    )
}