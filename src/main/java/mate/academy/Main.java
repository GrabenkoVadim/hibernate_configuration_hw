package mate.academy;

import mate.academy.Service.MovieService;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("The Cars 4");
        movie.setDescription("Car's races");
        movieService.add(movie);
        System.out.println(movieService.get(movie.getId()));
    }
}
