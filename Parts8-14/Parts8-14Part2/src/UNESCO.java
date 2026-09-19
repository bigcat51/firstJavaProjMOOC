public class UNESCO implements Comparable<UNESCO>{
    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private int literacyPercent;

    public UNESCO(String theme, String ageGroup, String gender, String country, int year, int literacyPercent) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public int getLiteracyPercent() {
        return literacyPercent;
    }


    @Override
    public int compareTo(UNESCO o) {
        return this.literacyPercent - o.getLiteracyPercent();
    }
}
