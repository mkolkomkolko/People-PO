package people;

public class CyclicBuffer {

    public static Person[] resizeArray(Person[] array, int newSize) {
        Person[] extended = new Person[newSize];

        for (int i = 0; i < Math.min(array.length, newSize); ++i) {
            extended[i] = array[i];
        }

        return extended;
    }
}
