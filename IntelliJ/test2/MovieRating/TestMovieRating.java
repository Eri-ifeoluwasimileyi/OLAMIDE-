package IntelliJ.test2.MovieRating;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMovieRating {



    @Test
    public void testMovieRatingCanAddMovie() {
        MovieRating movieTitle = new MovieRating();
        movieTitle.addMovie("Kill Mr Chi");
        assertTrue(movieTitle.contains("Movie Kill Mr Chi added"));

    }

}
