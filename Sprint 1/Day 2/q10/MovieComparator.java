import java.util.Comparator;

public class MovieComparator {

    public static class byTitle implements Comparator<Movie>{
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getTitle().compareTo(m2.getTitle());
    }
        }

    public static class byYear implements Comparator<Movie>{
    @Override
    public int compare(Movie m1, Movie m2) {
        return Integer.compare(m1.getReleaseyear(),m2.getReleaseyear());
    }
        }

    public static class byRating implements Comparator<Movie>{
    @Override
    public int compare(Movie m1, Movie m2) {
        return Integer.compare(m1.getRating(),m2.getRating());
    }
        }

}
