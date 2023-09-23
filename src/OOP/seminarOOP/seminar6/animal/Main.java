package OOP.seminarOOP.seminar6.animal;

/**
 * Главный класс для демонстрации работы с животными.
 */
public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog("Бобик");
        Cat cat = new Cat("Мурзик");

        System.out.println(dog.name + " говорит: " + dog.makeSound());
        System.out.println(cat.name + " говорит: " + cat.makeSound());
    }
}
// /animals
//   Animal.java
//   Dog.java
//   Cat.java
//   Main.java
