import people.Agent;
import people.CyclicBuffer;
import people.Person;
import people.Student;

public class Main {
    public static void main(String[] args) {

        CyclicBuffer people = new CyclicBuffer();
        people.add(new Person("Adam", "Kowalski"));
        people.add(new Student("Hubert", "Makowski", 123));
//        people.add(new Agent("James", "Bond"));

        people.print();
        while (!people.isEmpty()) {
            Person p = people.get();
            p.sayHallo();
        }

        System.out.println();

        for (int i = 0; i < 20; ++i)
            people.add(new Person("Ala", "Kowalska" + i));

        people.print();
    }
}
