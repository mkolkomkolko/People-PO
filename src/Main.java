import people.Agent;
import people.CyclicBuffer;
import people.Person;
import people.Student;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Adam", "Kowalski");
        people[1] = new Student("Hubert", "Makowski", 123);
        people[2] = new Agent("James", "Bond");

        for (Person person : people) {
            System.out.println(person);
            person.sayHallo();
        }

        System.out.println();

        people = CyclicBuffer.resizeArray(people, 4);
        people[3] = new Person("Ala", "Kowalska");

        for (Person person : people) {
            System.out.println(person);
            person.sayHallo();
        }

        System.out.println();

        people = CyclicBuffer.resizeArray(people, 2);

        for (Person person : people) {
            System.out.println(person);
            person.sayHallo();
        }
    }
}
