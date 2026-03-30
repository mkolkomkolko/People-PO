package fraction;

public class Fraction {

    private int numerator;
    private int denominator;

    int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    private void simplify() {
        int g = gcd(numerator, denominator);

        numerator /= g;
        denominator /= g;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        simplify();
    }

    public static Fraction add(Fraction a, Fraction b) {
        Fraction result = new Fraction(a.numerator * b.denominator + b.numerator * a.denominator, a.denominator * b.denominator);
        result.simplify();

        return result;
    }

    public static Fraction subtract(Fraction a, Fraction b) {
        Fraction result = new Fraction(a.numerator * b.denominator - b.numerator * a.denominator, a.denominator * b.denominator);
        result.simplify();

        return result;
    }

    public static Fraction multiply(Fraction a, Fraction b) {
        Fraction result = new Fraction(a.numerator * b.numerator, a.denominator * b.denominator);
        result.simplify();

        return result;
    }

    public static Fraction divide(Fraction a, Fraction b) {
        Fraction result = new Fraction(a.numerator * b.denominator, a.denominator * b.numerator);
        result.simplify();

        return result;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
