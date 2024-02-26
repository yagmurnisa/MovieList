package com.example.movielist

data class Movie(val name: String, val director: String, val cast: List<String>, val image: Int,
                 val genres: List<String>, val duration: Int)
