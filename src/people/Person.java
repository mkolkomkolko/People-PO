package people;

public class Person {

    protected String name;
    protected String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public void sayHallo() {
        System.out.printf("Hello, my name is %s %s%n", name, surname);
    }
}
