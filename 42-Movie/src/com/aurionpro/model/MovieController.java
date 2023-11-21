package com.aurionpro.model;

import java.util.Scanner;

public class MovieController {
    private MovieManager movieManager;
    private Scanner scanner;

    public MovieController() {
        movieManager = new MovieManager();
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the Movie Store!");
        displayMenu();
    }

    public void displayMenu() {
        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Movie");
            System.out.println("2. List Movies");
            System.out.println("3. Clear Movies");
            System.out.println("4. Get Movie by ID");
            System.out.println("5. Load Movies");
            System.out.println("6. Save Movies");
            System.out.println("7. Delete Movie by ID");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    setMovieDetails();
                    break;
                case 2:
                    listMovies();
                    break;
                case 3:
                    clearMovies();
                    break;
                case 4:
                    getMovieById();
                    break;
                case 5:
                    loadMovies();
                    break;
                case 6:
                    saveMovies();
                    break;
                case 7:
                    deleteMovieById();
                    break;
                case 8:
                    running = false;
                    System.out.println("Exiting the Movie Store. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }

    public void setMovieDetails() {
        System.out.print("Enter Movie ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Movie Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Movie Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Movie Genre: ");
        String genre = scanner.nextLine();

        Movie movie = new Movie(id, name, year, genre);
        movieManager.addMovie(movie);
        System.out.println("Movie added successfully!");
    }
    
    public void listMovies() {
        System.out.println("\nList of Movies:");
        for (Movie movie : movieManager.getMovies()) {
            System.out.println(movie);
        }
    }

    public void clearMovies() {
        movieManager.clearMovies();
        System.out.println("All movies have been cleared.");
    }

    public void getMovieById() {
        System.out.print("Enter Movie ID to get details: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Movie movie = movieManager.getMovieById(id);
        if (movie != null) {
            System.out.println("Movie Details:");
            System.out.println(movie);
        } else {
            System.out.println("Movie with ID " + id + " not found.");
        }
    }

    public void loadMovies() {
        movieManager.loadMovies();
//        System.out.println("Movies loaded from file.");
    }

    public void saveMovies() {
        movieManager.saveMovies();
//        System.out.println("Movies saved to file.");
    }

    public void deleteMovieById() {
        System.out.print("Enter Movie ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Movie movie = movieManager.getMovieById(id);
        if (movie != null) {
            movieManager.deleteMovie(movie);
            System.out.println("Movie with ID " + id + " has been deleted.");
        } else {
            System.out.println("Movie with ID " + id + " not found.");
        }
    }

    public static void main(String[] args) {
        MovieController movieController = new MovieController();
        movieController.start();
    }
}
