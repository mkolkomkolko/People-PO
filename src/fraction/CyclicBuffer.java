package fraction;

public class CyclicBuffer {

    private Fraction[] people = new Fraction[4];
    private int start = 0;
    private int end = 0;

    private void resize() {
        Fraction[] resized = new Fraction[Math.max(1, end - start) * 2];

        for (int i = 0; i < end - start; ++i)
            resized[i] = people[start + i];

        end -= start;
        start = 0;
        people = resized;
    }

    public boolean isEmpty() {
        return start == end;
    }

    public void add(Fraction person) {
        if (end >= people.length)
            resize();

        people[end] = person;
        ++end;
    }

    public Fraction get() {
        if (isEmpty()) return null;

        Fraction p = people[start];
        ++start;

        if (4 * (end - start) < people.length)
            resize();
        return p;
    }

    public void print() {
        for (int i = start; i < end; ++i)
            System.out.println(people[i]);
    }
}
