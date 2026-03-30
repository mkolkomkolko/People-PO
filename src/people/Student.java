package people;

public class Student extends Person {

    private int id;

    public Student(String name, String surname, int id) {
        super(name, surname);
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + id;
    }

    @Override
    public void sayHallo() {
        System.out.printf("Hi, my name is %s %s, my student id is %d%n", name, surname, id);
    }
}
