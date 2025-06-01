import java.time.Year;
import java.util.ArrayList;

class Movie{
    private String title;
    private String director;
    private String genre;
    private Year releaseyear;
    private int rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getReleaseyear() {
        return this.releaseyear.getValue();
    }

    public void setReleaseyear(Year releaseyear) {
        this.releaseyear = releaseyear;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Movie(String title, String director, String genre, int releaseyear, int rating) {
        Year y = Year.of(releaseyear);
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.releaseyear = y;
        this.rating = rating;
    }
}

class MovieColeection{
    private ArrayList<Movie> movieList = new ArrayList<>();

    public void addMovie(Movie m){
        movieList.add(m);
    }

    public void filterGenre(String genre){
        for(Movie m : movieList){
            if(m.getGenre().equals(genre)){
                System.out.println("Title : " + m.getTitle() +
                        " director : " + m.getDirector() +
                        " genre : " + m.getGenre() +
                        " release Year: " + m.getReleaseyear());
            }
        }
    }

    public void filterDirector(String Director){
        for(Movie m : movieList){
            if(m.getDirector().equals(Director)){
                System.out.println("Title : " + m.getTitle() +
                        " director : " + m.getDirector() +
                        " genre : " + m.getGenre() +
                        " release Year: " + m.getReleaseyear());
            }
        }
    }

    public void filterReleaseYear(int ReleaseYear){
        for(Movie m : movieList){
            if(m.getReleaseyear().equals(ReleaseYear)){
                System.out.println("Title : " + m.getTitle() +
                        " director : " + m.getDirector() +
                        " genre : " + m.getGenre() +
                        " release Year: " + m.getReleaseyear());
            }
        }
    }

    public ArrayList<Movie> sort(String s){
        if(s.equals("title")){
            movieList.sort(new MovieComparator.byTitle());
            return movieList;
        }
        if(s.equals("year")){
            movieList.sort(new MovieComparator.byYear());
            return movieList;
        }
        if(s.equals("rating")){
            movieList.sort(new MovieComparator.byRating());
            return movieList;
        }
        return movieList;
    }

    public void removeMovie(Movie m){
        movieList.remove(m);
    }

    public void displayMovies(){
        for(Movie m : movieList){
                System.out.println("Title : " + m.getTitle() +
                        " director : " + m.getDirector() +
                        " genre : " + m.getGenre() +
                        " release Year: " + m.getReleaseyear());
            }
    }
}



class q10{
public static void main(String[] args) {
        Movie m1 = new Movie("Ha ha ha","Robert","Comedy",2022,4);
        Movie m2 = new Movie("Ta Ta Ta","Robert","Comedy",2021,3);
        Movie m3 = new Movie("Sa Sa ha","Abu","Horror",2022,5);
        Movie m4 = new Movie("Ha Ta SA","Abu","Horror",2021,4);

        MovieColeection mc = new MovieColeection();
        mc.addMovie(m1);
        mc.addMovie(m2);
        mc.addMovie(m3);
        mc.addMovie(m4);

        mc.filterGenre("Horror");
        System.out.println("\n");
        mc.filterDirector("Robert");
        System.out.println("\n");
        mc.filterReleaseYear(2021);
        System.out.println("\n");

        mc.displayMovies();
        System.out.println("\n");
        mc.sort("title");
        mc.displayMovies();

}
}