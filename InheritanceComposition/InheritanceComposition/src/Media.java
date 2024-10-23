import java.util.ArrayList;

public class Media {
    String title;
    String rating;
    private Director director;
    ArrayList<Actor>cast;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Media(Director director) {
        this.director = director;
    }
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setCast(ArrayList<Actor> cast) {
        this.cast = cast;
    }

    public Media(String title, String rating, String director, ArrayList<String> cast) {
        this.title = title;
        this.rating = rating;

    }
}

