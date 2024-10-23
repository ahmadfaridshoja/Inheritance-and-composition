import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Director director =new Director("MR beast", 45);
        Actor actor = new Actor("Robert", 30);
        ArrayList<String> movieCast= new ArrayList<>();
        movieCast.add("actor 1");
        movieCast.add("actor 2");

        Movie movie = new Movie("spiderman 1", "pg 13", "Mr I don't know",movieCast,123,
                "a young boy who turn to spider", 8.3, director);
        ArrayList<String> tvShowCast=new ArrayList<>();
        tvShowCast.add("actor 3");
        tvShowCast.add("actor 4");
        tvShow tv_show =new tvShow("Luck game", "Y", "Ahmad",tvShowCast,1, 10);
        System.out.println("movie rating: " + movie.getRating());
        System.out.println("movie director: " +  movie.getDirector());
        System.out.println("TV Show Tit is: "+ tv_show.getTitle());
        System.out.println("tv show episode is: "+tv_show.getEpisodes());
    }
}
//4. In your Main class, create instances of each class and print two data from each object.