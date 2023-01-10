package constructorTest;

public class Person {
    protected String firstName; //означает, что наследникам будут доступны эти поля
    protected String lastName;
    protected char gender; // m - male, f - female
/*
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }*/  //getter & setter

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }

/*    public Person() { //конструктор
        this("", "", '-');
    }

    public Person(String lastName) {
        this(lastName, "", '-');

    }*/

    public Person(String lastName, String firstName, char gender) {
        this(lastName, firstName); // 'эта конструкция вызовет конструктор, который описан ниже.
        this.gender = gender; // добавили в уже существующий конструктор еще одно поле.
    }

    public Person(String lastName, String firstName) { //конструктор
        this.firstName = firstName;
        this.lastName = lastName;

    }


}

class Employee extends Person {
    protected String dolzhnost;

    public Employee(String lastName, String firstName, char gender, String dolzhnost) {
        super(lastName, firstName, gender);
        this.dolzhnost = dolzhnost;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender + '\'' +
                ", dolzhnost='" + dolzhnost + '\'' +
                '}';
    }

    public void tellMeWhoAreYou() {
        System.out.println("Hi! I'm employee, and my class is " + this.getClass());
    }
}