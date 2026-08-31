public class Student extends Person {
    protected int studyCredits;

    public Student(String name, String Adress) {
        super(name, Adress);
        studyCredits = 0;
    }

    public int credits() {
        return studyCredits;
    }

    public void study() {
        studyCredits++;
    }

    //toString not needed because the definition is super.toString(), but you can edit it

    @Override
    public String toString() {
        return super.toString() + "\n" + "Study Credits: " + studyCredits;
    }
}
