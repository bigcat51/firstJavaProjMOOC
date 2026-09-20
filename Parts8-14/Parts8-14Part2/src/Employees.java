import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person2> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person2 personToAdd) {
        employees.add(personToAdd);
    }

    public void add(List<Person2> peopleToAdd) {
        Iterator<Person2> iterator = peopleToAdd.iterator();
        while(iterator.hasNext()) {
            Person2 nextPerson = iterator.next();
            employees.add(nextPerson);
        }
        //iterator is same as for(val val: list) just is able to remove() while iterating
    }

    public void print() {
        employees.stream().forEach(value -> System.out.println(value));
    }

    public void print(Education education) {
        Iterator<Person2> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person2 person = iterator.next();
            if (person.getEducation().equals(education)) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person2> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person2 person = iterator.next();
            if (person.getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
