package IntelliJ.test2.MovieRating;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MovieRating {

    // Each movie is stored as an ArrayList with: [movie name, ratings list]
    public static ArrayList<ArrayList<Object>> movies = new ArrayList<>();

    public static String addMovie(ArrayList<ArrayList<Object>> movies, String name) {
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy  hh:mm:ss a");
        String date = formatter.format(now);

        ArrayList<Object> movie = new ArrayList<>();
        movie.add(name);
        movie.add(new ArrayList<Integer>()); // empty rating list
        movies.add(movie);

        return "Movie " + name + "added " + date;
    }


    public static String rateMovie(ArrayList<ArrayList<Object>> movies, String name, int rating) {
        for (ArrayList<Object> movie : movies) {
            if (movie.get(0).equals(name)) {
                if (rating >= 1 && rating <= 5) {
                    ArrayList<Integer> ratings = (ArrayList<Integer>) movie.get(1);
                    ratings.add(rating);
                    return "Rating added for " + name + " is " + rating;
                } else {
                    return "Rating must be between 1 and 5";
                }
            }
        }
        return "Movie " + name + " not found";
    }


    public static String getAverageRating(ArrayList<ArrayList<Object>> movies,  String name) {
        for (ArrayList<Object> movie : movies) {
            if (movie.get(0).equals(name)) {
                ArrayList<Integer> ratings = (ArrayList<Integer>) movie.get(1);
                if (ratings.isEmpty()) {
                    return "Movie " + name + " has no ratings yet";
                } else {
                    double average = 0;
                    for (Integer rating : ratings) {
                        average += rating;
                    }
                    average /= ratings.size();
                    return "Average of " + name + " is " + String.format("%.2f", average);                }
            }
        }
        return "Movie " + name + " not found";
    }


    public static String getAllMoviesAverageRating(ArrayList<ArrayList<Object>> movies) {
        if (movies.isEmpty()) {
            return "No movies found";
        }

        String result = "";
        for (ArrayList<Object> movie : movies) {
            String name = (String) movie.get(0);
            ArrayList<Integer> ratings = (ArrayList<Integer>) movie.get(1);
            double average = 0;

            if (!ratings.isEmpty()) {
                for (Integer rating : ratings) {
                    average += rating;
                }
                average /= ratings.size();
            }

            result += name + " - Average rating: " + String.format("%.2f", average) + "\n";

        }

        return result;
    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Object>> movies = new ArrayList<>();

        while (true) {

            System.out.println("""
            1. Add a Movie
            2. Rate a Movie
            3. View average rating of a Movie
            4. View average ratings of all the Movies
            5. Exit
            """);

            System.out.println("Enter your choice: ");
            String choice = input.nextLine();

            switch (choice) {

                case "1":
                    System.out.print("Enter movie name: ");
                    String name = input.nextLine().toLowerCase();
                    System.out.println(addMovie(movies, name));
                    break;

                case "2":
                    System.out.print("Enter movie name: ");
                    String nameRating = input.nextLine().toLowerCase();
                    System.out.print("Enter movie rating(1-5): ");
                    int rating = Integer.parseInt(input.nextLine());
                    System.out.println(rateMovie(movies, nameRating, rating));
                    break;

                case "3":
                    System.out.print("Enter movie name to view average rating: ");
                    String nameView = input.nextLine().toLowerCase();
                    System.out.println(getAverageRating(movies, nameView));
                    break;

                case "4":
                    System.out.println(getAllMoviesAverageRating(movies));
                    break;

                case "5":
                    System.out.println("Goodbye!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice,  please try again");
            }



        }
    }
}
