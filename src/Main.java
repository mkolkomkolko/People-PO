import fraction.CyclicBuffer;
import fraction.Fraction;

public class Main {
    public static void main(String[] args) {

        CyclicBuffer fractions = new CyclicBuffer();
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 4);
        fractions.add(Fraction.add(f1, f2));
        Fraction sum = fractions.get();
        System.out.println(sum);


        Fraction f3 = new Fraction(16, 9);

        System.out.println(sum + " * " + f3 + " = " + Fraction.multiply(sum, f3));
    }
}
