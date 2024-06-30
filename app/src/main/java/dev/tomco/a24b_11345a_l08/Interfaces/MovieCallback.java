package dev.tomco.a24b_11345a_l08.Interfaces;

import dev.tomco.a24b_11345a_l08.Models.Movie;

public interface MovieCallback {
    void favoriteButtonClicked(Movie movie, int position);
}
