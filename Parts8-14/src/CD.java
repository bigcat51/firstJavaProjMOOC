public class CD implements Packable{
    private String artist;
    private String songName;
    private int publishYear;
    private double Weight;

    public CD(String artist, String songName, int publishYear) {
        this.artist = artist;
        this.songName = songName;
        this.publishYear = publishYear;
        this.Weight = 0.1;
    }
    @Override
    public double weight() {
        return this.Weight;
    }

    @Override
    public String toString() {
        return artist + ": " + songName + " (" + publishYear + ")";
    }
}
