package encapsulationTest;

public class Main {
    public static final Integer MAGNIFIER = 1000; //неизменяемое число, доступное отовсюду, имеющиеся еще до загрузки класса

    public static void main(String[] args) throws Exception {  // static - сохранить в памяти до создания объектов
        Person person = new Person("Elena", 18, "Earth", "88001234567");

        Person.getCounter();
       // Fraction fraction = new Fraction(1, 10); //конструктор по умолчанию, не принимающий параметров
    }
}

class Person {
    int id; //номер человека в списке
    private String name;
    private int age;
    private static int counter = 0; //статическая переменная для счетчика, инициализируется до создания класса Person

    /*    static {  // static - будет вызван по умолчанию, когда мы запусим программу
            //  name = "Unknown"; // ошибка - name тоже должен быто static
            System.out.println(counter);
        }*/
    public static int getCounter() {
        return counter;
    }

    public Person(String name, int age, String address, String phone) {
        id = counter++;
        this.name = name;
        this.age = age;

    }

    public void displayName() {
        System.out.printf("Name %s \n", name); // %s - строка, printf - форматированный вывод
    }

    void displayAge() {
        System.out.printf("Age %d \n", age); // %d - число, printf - форматированный вывод

    }

    public String getName() { //вставка по Alt+Ins getter и setter
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 110)
            this.age = age;
    }


}

/*class Fraction {
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

}*/