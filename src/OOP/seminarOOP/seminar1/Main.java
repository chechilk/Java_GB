package OOP.seminarOOP.seminar1;

public class Main {
    public static void main(String[] args) {
        // Создание объектов разных классов
        Mammal lion = new Mammal("Lion", 5, "Yellow");
        Bird sparrow = new Bird("Sparrow", 2, true);

        // Использование методов и вывод информации
        lion.makeSound();
        lion.displayInfo();

        sparrow.makeSound();
        sparrow.displayInfo();
    }

    // Animal animal = new Animal("Petr", 30);
    // animal.displayInfo();

    // Animal animal_2 = new Animal("Ivan");
    // animal_2.displayInfo();

    // Animal animal_3 = new Animal();
    // animal_3.displayInfo();

    // animal_3.age = 30;
    // animal_3.name = "Serj";
    // animal_3.displayInfo();
}
