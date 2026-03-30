package people;

public class Agent extends Person {

    public Agent(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Special agent " + this.hashCode();
    }

    @Override
    public void sayHallo() {
        System.out.println("Hi, nice to meet you");
    }
}
