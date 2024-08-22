package mate.academy.Service;

import mate.academy.model.Movie;

public interface MovieService {
    Movie add(Movie movie);
    Movie get(Long id);
}
