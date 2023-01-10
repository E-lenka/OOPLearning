package InterfaceTest;

public class Main {
    public static void main(String[] args) {
        //создадим интерфейс - позволяет уйти от неудобного наследования -
        Printable book = new Book("The toys", "Barto A."); //обращаемся как к интерфейсу, будем видеть только методы
        book.print();
        book.read("This is run upon the book");

        Journal journal = new Journal("Cosmo");
     //   journal.getName();
        journal.print();

       // Printable printableJournal = journal;
      //  printableJournal.print();
    }


}

class Book implements Printable {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }
}

class Journal implements Printable {
    private String name;

    public String getName() {
        return name;
    }

    public Journal(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}