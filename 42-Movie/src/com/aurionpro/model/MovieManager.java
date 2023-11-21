package com.aurionpro.model;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {
    private List<Movie> movies;
    private static final String FILE_PATH = "D:\\Software\\eclipseOxygen\\42-Movie\\Movie"; 
    
    public MovieManager() {
        movies = new ArrayList<>();
    }
    
    public void loadMovies() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            movies = (List<Movie>) ois.readObject();
            System.out.println("movies loaded from file");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("error loading movies from file "+ e.getMessage());
        }
    }
    
    public void saveMovies() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(movies);
            System.out.println("movies saved to file");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error saving movies to file "+ e.getMessage());
        }
    }
    
    public void addMovie(Movie movie) {
        movies.add(movie);
    }
    
    public void clearMovies() {
        movies.clear();
    }
    
    public List<Movie> getMovies() {
        return movies;
    }
    
    public Movie getMovieById(int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }
    
    public void deleteMovie(Movie movie) {
        movies.remove(movie);
    }
    
//    public static void main(String[] args) {
//        MovieManager manager = new MovieManager();
//        
//        manager.loadMovies();
//        
////        manager.addMovie(new Movie(1, "Movie 1", 2023, "Action"));
////        manager.addMovie(new Movie(2, "Movie 2", 2022, "Comedy"));
//        
//        manager.saveMovies();
//        
//        List<Movie> movieList = manager.getMovies();
//        for (Movie movie : movieList) {
//            System.out.println(movie);
//        }
//        
//        Movie movieById = manager.getMovieById(1);
//        System.out.println("Movie with id 1: " + movieById);
//        
//        manager.deleteMovie(movieById);
//        
//        manager.saveMovies();
//    }
}
