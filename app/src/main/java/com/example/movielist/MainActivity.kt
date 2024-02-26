package com.example.movielist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var movieList: List<Movie>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        movieList = listOf(Movie("Interstellar", "Christopher Nolan",
            listOf("Matthew McConaughey", "Anne Hathaway", "Jessica Chastain"), R.drawable.interstellar,
            listOf("Adventure", "Drama", "Sci-fi"), 169),
            Movie("Pulp Fiction", "Quentin Tarantino",
                listOf("John Travolta", "Uma Thurman", "Samuel L. Jackson"), R.drawable.pulpfiction,
                listOf("Crime", "Drama"), 154),
            Movie("Star Wars: Episode V - The Empire Strikes Back", "Irvin Kershner",
                listOf("Mark Hamill", "Harrison Ford", "Carrie Fisher"), R.drawable.starwars,
                listOf("Adventure", "Action", "Fantasy"), 124),
            Movie("Avengers: Infinity War", "Anthony Russo, Joe Russo",
                listOf("Robert Downey Jr", "Chris Hemsworth", "Chris Evans"), R.drawable.avengers,
                listOf("Adventure", "Action", "Sci-fi"), 149),
            Movie("Gladiator", "Ridley Scott",
                listOf("Russel Crowe", "Joaquin Phoenix", "Connie Nielsen"), R.drawable.gladiator,
                listOf("Adventure", "Drama", "Action"), 155),
            Movie("Terminator", "James Cameron",
                listOf("Arnold Schwarzenegger", "Linda Hamilton", "Michael Biehn"), R.drawable.terminator,
                listOf("Action", "Sci-fi"), 107),
            Movie("Inception", "Christopher Nolan",
                listOf("Leonardo Di Caprio", "Joseph Gordon-Levitt", "Elliot Page"), R.drawable.inception,
                listOf("Adventure", "Adventure", "Sci-fi"), 148),
            Movie("The Lord of the Rings: The Return of the King", "Peter Jackson",
                listOf("Elijah Wood", "Viggo Mortensen", "Ian Mckellen"), R.drawable.lotr,
                listOf("Adventure", "Drama", "Action"), 201),
        )
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = MovieAdapter(movieList)
    }
}