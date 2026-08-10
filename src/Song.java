public class Song {
    private String name;
    private String character;
    private int number;

    public Song(String name, String character, int number) {
        this.name = name;
        this.character = character;
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Song)) {
            return false;
        }

        Song thisObject = (Song) obj;
        if (this.name.equals(thisObject.name) &&
            this.character.equals(thisObject.character) &&
            this.number == thisObject.number) {
            return true;
        }
        return false;
    }
}
