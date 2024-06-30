package dev.tomco.a24b_11345a_l08.Models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Movie {
    public static final int MAX_LINES_COLLAPSED = 3;
    public static final int MIN_LINES_COLLAPSED = 1;

    private String name = "";
    private ArrayList<String> genre = null;
    private ArrayList<String> actors = null;
    private int length = 0;
    private String poster = "";
    private String overview = "";
    private LocalDate releaseDate = null;
    private float rating = 0.0f;
    private boolean isFavorite = false;
    private boolean isCollapsed = true;


    public Movie() {
    }

    public String getName() {
        return name;
    }

    public Movie setName(String name) {
        this.name = name;
        return this;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public Movie setGenre(ArrayList<String> genre) {
        this.genre = genre;
        return this;
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public Movie setActors(ArrayList<String> actors) {
        this.actors = actors;
        return this;
    }

    public int getLength() {
        return length;
    }

    public Movie setLength(int length) {
        this.length = length;
        return this;
    }

    public String getPoster() {
        return poster;
    }

    public Movie setPoster(String poster) {
        this.poster = poster;
        return this;
    }

    public String getOverview() {
        return overview;
    }

    public Movie setOverview(String overview) {
        this.overview = overview;
        return this;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Movie setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public float getRating() {
        return rating;
    }

    public Movie setRating(float rating) {
        this.rating = rating;
        return this;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public Movie setFavorite(boolean favorite) {
        isFavorite = favorite;
        return this;
    }

    public boolean isCollapsed() {
        return isCollapsed;
    }

    public Movie setCollapsed(boolean collapsed) {
        isCollapsed = collapsed;
        return this;
    }
}
