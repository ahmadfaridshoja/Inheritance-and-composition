import java.util.ArrayList;

public class Movie extends Media {
    private int length;
    private String description;
    private double grossing;
    public Director director;

    @Override
    public Director getDirector() {
        return director;
    }

    @Override
    public void setDirector(Director director) {
        this.director = director;
    }

    public Movie(String title, String rating, String director, ArrayList<String> cast, int length, String description, double grossing, Director director1) {
        super(title, rating, director, cast);
        this.length = length;
        this.description = description;
        this.grossing = grossing;
        this.director = director1;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getGrossing() {
        return grossing;
    }

    public void setGrossing(double grossing) {
        this.grossing = grossing;
    }
}
