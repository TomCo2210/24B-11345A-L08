package dev.tomco.a24b_11345a_l08.Adapters;

import android.animation.ObjectAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import dev.tomco.a24b_11345a_l08.Interfaces.MovieCallback;
import dev.tomco.a24b_11345a_l08.Models.Movie;
import dev.tomco.a24b_11345a_l08.R;
import dev.tomco.a24b_11345a_l08.Utilities.ImageLoader;
import dev.tomco.a24b_11345a_l08.Utilities.TimeFormatter;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private final ArrayList<Movie> movies;
    private MovieCallback movieCallback;

    public MovieAdapter(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public void setMovieCallback(MovieCallback movieCallback) {
        this.movieCallback = movieCallback;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_movie_item, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movie = getItem(position);

        ImageLoader.getInstance().load(movie.getPoster(), holder.movie_IMG_poster);
        holder.movie_LBL_name.setText(movie.getName());
        holder.movie_LBL_year.setText(String.valueOf(movie.getReleaseDate().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"))));;
        holder.movie_LBL_duration.setText(TimeFormatter.getTimeFormatted(movie.getLength()));
        holder.movie_LBL_genres.setText(String.join(", ", movie.getGenre()));
        holder.movie_LBL_actors.setText(String.join(", ", movie.getActors()));
        holder.movie_LBL_overview.setText(movie.getOverview());
        holder.movie_RTNG_rating.setRating(movie.getRating() / 2);
        if (movie.isFavorite())
            holder.movie_IMG_favorite.setImageResource(R.drawable.heart);
        else
            holder.movie_IMG_favorite.setImageResource(R.drawable.empty_heart);

        holder.movie_LBL_overview.setOnClickListener(v -> {
            ArrayList<ObjectAnimator> animations = new ArrayList<>();
            if (movie.isCollapsed()) {
                animations.add(ObjectAnimator
                        .ofInt(holder.movie_LBL_actors, "maxLines", holder.movie_LBL_actors.getLineCount())
                        .setDuration((Math.max(holder.movie_LBL_actors.getLineCount() - Movie.MIN_LINES_COLLAPSED, 0)) * 50L));
                animations.add(ObjectAnimator
                        .ofInt(holder.movie_LBL_overview, "maxLines", holder.movie_LBL_overview.getLineCount())
                        .setDuration((Math.max(holder.movie_LBL_overview.getLineCount() - Movie.MAX_LINES_COLLAPSED, 0)) * 50L));
            } else {
                animations.add(ObjectAnimator
                        .ofInt(holder.movie_LBL_actors, "maxLines", Movie.MIN_LINES_COLLAPSED)
                        .setDuration((Math.max(holder.movie_LBL_actors.getLineCount() - Movie.MIN_LINES_COLLAPSED, 0)) * 50L));
                animations.add(ObjectAnimator
                        .ofInt(holder.movie_LBL_overview, "maxLines", Movie.MAX_LINES_COLLAPSED)
                        .setDuration((Math.max(holder.movie_LBL_overview.getLineCount() - Movie.MAX_LINES_COLLAPSED, 0)) * 50L));
            }
            animations.forEach(ObjectAnimator::start);

            movie.setCollapsed(!movie.isCollapsed());
        });
    }

    @Override
    public int getItemCount() {
        return movies == null ? 0 : movies.size();
    }

    public Movie getItem(int position) {
        return movies.get(position);
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        private final ShapeableImageView movie_IMG_poster;
        private final ShapeableImageView movie_IMG_favorite;
        private final MaterialTextView movie_LBL_name;
        private final MaterialTextView movie_LBL_year;
        private final MaterialTextView movie_LBL_duration;
        private final MaterialTextView movie_LBL_genres;
        private final MaterialTextView movie_LBL_actors;
        private final MaterialTextView movie_LBL_overview;
        private final AppCompatRatingBar movie_RTNG_rating;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            movie_IMG_poster = itemView.findViewById(R.id.movie_IMG_poster);
            movie_IMG_favorite = itemView.findViewById(R.id.movie_IMG_favorite);
            movie_LBL_name = itemView.findViewById(R.id.movie_LBL_name);
            movie_LBL_year = itemView.findViewById(R.id.movie_LBL_year);
            movie_LBL_duration = itemView.findViewById(R.id.movie_LBL_duration);
            movie_LBL_genres = itemView.findViewById(R.id.movie_LBL_genres);
            movie_LBL_actors = itemView.findViewById(R.id.movie_LBL_actors);
            movie_LBL_overview = itemView.findViewById(R.id.movie_LBL_overview);
            movie_RTNG_rating = itemView.findViewById(R.id.movie_RTNG_rating);
            movie_IMG_favorite.setOnClickListener(v -> {
                if (movieCallback != null)
                    movieCallback.favoriteButtonClicked(getItem(getAdapterPosition()), getAdapterPosition());
            });


        }
    }
}
