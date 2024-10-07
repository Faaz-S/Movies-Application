package dev.faaz.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service   //marks the class as a Service Layer component
public class MovieService {

    @Autowired     // will instantiate the MovieRepository class for us
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();   //the findAll method is defined in the MongoRepository class
    }
    // we put Optional as there might be no movie with the provided id
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }

}
