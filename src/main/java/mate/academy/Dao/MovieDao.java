package mate.academy.Dao;

import mate.academy.model.Movie;

import java.util.Optional;

public interface MovieDao {
    Movie add(Movie movie);
    Optional<Movie> get(Long id);
}
