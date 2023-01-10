package constructorTest;

public class Main {
    public static void main(String[] args) {
        Fraction fr = new Fraction(1, 2);

    }
}

class Fraction {
    int numerator;
    int denominator = 1;

    public Fraction(int numerator, int denominator) {   //конструктор называется также как класс, всегда public
        if (denominator == 0) {
            System.out.println("Denominator can't be zero");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add1ToNumerator() {
        this.numerator++;
        return this;
    }

    public Fraction getObjectCurrent() {
        return this;
    }
}