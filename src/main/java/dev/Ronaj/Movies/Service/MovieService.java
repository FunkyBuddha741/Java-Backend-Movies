package dev.Ronaj.Movies.Service;

import dev.Ronaj.Movies.Models.Movie;
import dev.Ronaj.Movies.Repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

//Business Logic is concerned with this class
@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        System.out.println(movieRepository.findAll().toString());
        return movieRepository.findAll();
    }

   public Optional<Movie> singleMovieByImdb(String imdbId){
        return movieRepository.findByImdbId(imdbId);
   }

}
