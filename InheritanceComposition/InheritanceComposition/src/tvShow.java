import java.util.ArrayList;

public class tvShow extends Media{
    private int seasons;
    private int episodes;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public tvShow(String title, String rating, String director, ArrayList<String> cast, int seasons, int episodes) {
        super(title, rating, director, cast);
        this.seasons = seasons;
        this.episodes = episodes;

    }
}
