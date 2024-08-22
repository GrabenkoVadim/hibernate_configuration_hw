package mate.academy.Service;

import mate.academy.Dao.MovieDao;
import mate.academy.Exception.DataProcessingException;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow(()-> new DataProcessingException("Can't find movie with id: " + id));
    }
}
