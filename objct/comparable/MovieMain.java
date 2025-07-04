package objct.comparable;
//Create a Movie class with fields title and rating. Sort movies by rating in ascending order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Movie implements Comparable<Movie>{

    private  String title;
    private int rating ;

        public Movie(String title, int rating) {
            this.title = title;
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        @Override
        public String toString() {
            return "Title : "+title+" Rating : " +rating;
        }


        @Override
        public int compareTo(Movie movie) {
            return this.rating-movie.rating;
        }
    }
public class MovieMain {

    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Fast and Furious Tokyo ",5));
        movies.add(new Movie("Singham",3));
        movies.add(new Movie("War",4));

        Collections.sort(movies);
        for (Movie m : movies){
            System.out.println(m);
        }
    }
}
