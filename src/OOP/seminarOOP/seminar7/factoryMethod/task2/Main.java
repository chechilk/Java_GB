package OOP.seminarOOP.seminar7.factoryMethod.task2;

// Абстрактный класс Animal, представляющий животных
abstract class Animal {
    abstract void makeSound();

    abstract void displayInfo();

    abstract int getCount(); // Добавляем метод для отслеживания количества созданных животных
}

// Конкретный класс для создания собак
class Dog extends Animal {
    private static int count = 0; // Счетчик собак
    private String name;

    public Dog(String name) {
        this.name = name;
        count++;
    }

    @Override
    void makeSound() {
        System.out.println(name + " гавкает");
    }

    @Override
    void displayInfo() {
        System.out.println("Это собака по имени " + name);
    }

    @Override
    int getCount() {
        return count;
    }
}

// Конкретный класс для создания кошек
class Cat extends Animal {
    private static int count = 0; // Счетчик кошек
    private String name;

    public Cat(String name) {
        this.name = name;
        count++;
    }

    @Override
    void makeSound() {
        System.out.println(name + " мяукает");
    }

    @Override
    void displayInfo() {
        System.out.println("Это кошка по имени " + name);
    }

    @Override
    int getCount() {
        return count;
    }
}

// Абстрактная фабрика для создания животных
abstract class AnimalFactory {
    abstract Animal createAnimal(String name);
}

// Конкретная фабрика для создания собак
class DogFactory extends AnimalFactory {
    @Override
    Animal createAnimal(String name) {
        return new Dog(name);
    }
}

// Конкретная фабрика для создания кошек
class CatFactory extends AnimalFactory {
    @Override
    Animal createAnimal(String name) {
        return new Cat(name);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем фабрику для собак
        AnimalFactory dogFactory = new DogFactory();

        // Создаем несколько собак с помощью фабрики
        Animal dog1 = dogFactory.createAnimal("Барон");
        Animal dog2 = dogFactory.createAnimal("Белла");

        // Создаем фабрику для кошек
        AnimalFactory catFactory = new CatFactory();

        // Создаем несколько кошек с помощью фабрики
        Animal cat1 = catFactory.createAnimal("Мурка");
        Animal cat2 = catFactory.createAnimal("Васька");

        // Выводим информацию о каждом животном
        dog1.displayInfo();
        dog1.makeSound();
        dog2.displayInfo();
        dog2.makeSound();
        cat1.displayInfo();
        cat1.makeSound();
        cat2.displayInfo();
        cat2.makeSound();

        // Выводим количество созданных животных каждого типа
        System.out.println("Количество собак: " + dog1.getCount());
        System.out.println("Количество кошек: " + cat1.getCount());
    }
}
