package OOP.seminarOOP.seminar1;

public class Animal {
    String name;
    int age;

    // Конструктор класса Animal
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public Animal(String name) {
    // this.name = name;
    // }

    // public Animal() {
    // }

    // Метод для издания звука
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    // Метод для вывода информации о животном
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
