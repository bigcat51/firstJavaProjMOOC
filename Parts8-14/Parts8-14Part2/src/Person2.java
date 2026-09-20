public class Person2 {
    private String name;
    private Education education;

    public Person2(String name, Education education) {
        this.name = name;
        this.education = education;
    }

    public Education getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return name + ", " + education;
    }
}
