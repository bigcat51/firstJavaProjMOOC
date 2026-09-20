public class UNESCO implements Comparable<UNESCO>{
    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double literacyPercent;

    public UNESCO(String theme, String ageGroup, String gender, String country, int year, double literacyPercent) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }


    @Override
    public int compareTo(UNESCO o) {
        if (this.literacyPercent < o.literacyPercent){
            return -1;
        }else if (this.literacyPercent > o.literacyPercent){
            return 1;
        }else {
            return 0;
        }
    }
}
