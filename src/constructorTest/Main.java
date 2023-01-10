package constructorTest;

public class Main {
    public static void main(String[] args) {
        Fraction fr = new Fraction(1, 2);
        fr.add1ToNumerator().add1ToNumerator().add1ToNumerator().add1ToNumerator().add1ToNumerator();

        Person oleg = new Person("Laptev", "Oleg", 'm');
        System.out.println(oleg);
        //  Employee olga = new Employee("Olga","Pupkina",'f'); // ошибка, т.к. конструктор не наследуется от класса Person
        // Idea ожидает 0 аргументов
        Employee olga = new Employee("Olga", "Pupkina", 'f', "Boss");
        olga.tellMeWhoAreYou();
        System.out.println(olga);

/*        Person olga2 = olga; // сложили Employee в Person
        ((Employee) olga2).tellMeWhoAreYou(); //преобразование типов olga2 из Person в Employee
        System.out.println(olga2);*/

        // Employee oleg2 = oleg; // ошибка: нельзя сложить Person в Employee


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

/*    public Fraction getObjectCurrent() {
        return this;
    }*/
}