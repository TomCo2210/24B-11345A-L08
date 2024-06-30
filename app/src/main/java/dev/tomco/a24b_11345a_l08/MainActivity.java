package dev.tomco.a24b_11345a_l08;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import dev.tomco.a24b_11345a_l08.Adapters.MovieAdapter;
import dev.tomco.a24b_11345a_l08.Utilities.DataManager;

public class MainActivity extends AppCompatActivity {
    private RecyclerView main_LST_movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        initViews();
    }

    private void initViews() {
        MovieAdapter movieAdapter = new MovieAdapter(DataManager.getMovies());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        main_LST_movies.setLayoutManager(linearLayoutManager);
        main_LST_movies.setAdapter(movieAdapter);
        movieAdapter.setMovieCallback((movie, position) -> {
            movie.setFavorite(!movie.isFavorite());
            movieAdapter.notifyItemChanged(position);
        });
    }

    private void findViews() {
        main_LST_movies = findViewById(R.id.main_LST_movies);
    }
}