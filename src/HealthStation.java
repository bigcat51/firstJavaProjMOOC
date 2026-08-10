public class HealthStation {
    private int weighings;
    public HealthStation() {
        weighings = 0;
    }
    public int Weight(Person person) {
        weighings++;
        return person.getWeight();

    }
    public void feedPerson(Person person) {
        person.setWeight(this.Weight(person) + 1);

    }
    public int weighings() {
        return weighings;
    }
}
