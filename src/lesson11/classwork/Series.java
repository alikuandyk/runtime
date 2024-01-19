package lesson11.classwork;

public class Series extends Film {
    int numOfEpisodes;

    public Series(double rating, double duration, int numOfEpisodes) {
        super(rating, duration);
        this.numOfEpisodes = numOfEpisodes;
    }
}
