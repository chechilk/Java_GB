package OOP.seminarOOP.seminar7.factoryMethod.task3;

// Абстрактный класс Animal, представляющий животных
abstract class Animal {
    abstract void makeSound();

    abstract void displayInfo();

    abstract int getCount(); // Добавляем метод для отслеживания количества созданных животных

    abstract int getAge(); // Добавляем метод для получения возраста животного
}

// Конкретный класс для создания собак
class Dog extends Animal {
    private static int count = 0; // Счетчик собак
    private String name;
    private int age; // Возраст собаки

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    @Override
    void makeSound() {
        System.out.println(name + " гавкает");
    }

    @Override
    void displayInfo() {
        System.out.println("Это собака по имени " + name + ", возраст: " + age + " лет");
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    int getAge() {
        return age;
    }
}

// Конкретный класс для создания кошек
class Cat extends Animal {
    private static int count = 0; // Счетчик кошек
    private String name;
    private int age; // Возраст кошки

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    @Override
    void makeSound() {
        System.out.println(name + " мяукает");
    }

    @Override
    void displayInfo() {
        System.out.println("Это кошка по имени " + name + ", возраст: " + age + " лет");
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    int getAge() {
        return age;
    }
}

// Абстрактная фабрика для создания животных
abstract class AnimalFactory {
    abstract Animal createAnimal(String name, int age);

    abstract boolean isLimitReached(); // Добавляем метод для проверки ограничения
}

// Конкретная фабрика для создания собак
class DogFactory extends AnimalFactory {
    private static final int MAX_DOGS = 3; // Максимальное количество собак
    private int createdDogs = 0; // Количество созданных собак

    @Override
    Animal createAnimal(String name, int age) {
        if (createdDogs < MAX_DOGS) {
            createdDogs++;
            return new Dog(name, age);
        } else {
            System.out.println("Достигнуто максимальное количество собак.");
            return null; // Возвращаем null, чтобы указать на ограничение
        }
    }

    @Override
    boolean isLimitReached() {
        return createdDogs >= MAX_DOGS;
    }
}

// Конкретная фабрика для создания кошек
class CatFactory extends AnimalFactory {
    private static final int MAX_CATS = 3; // Максимальное количество кошек
    private int createdCats = 0; // Количество созданных кошек

    @Override
    Animal createAnimal(String name, int age) {
        if (createdCats < MAX_CATS) {
            createdCats++;
            return new Cat(name, age);
        } else {
            System.out.println("Достигнуто максимальное количество кошек.");
            return null; // Возвращаем null, чтобы указать на ограничение
        }
    }

    @Override
    boolean isLimitReached() {
        return createdCats >= MAX_CATS;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем фабрику для собак
        AnimalFactory dogFactory = new DogFactory();

        // Создаем несколько собак с помощью фабрики
        Animal dog1 = dogFactory.createAnimal("Барон", 3);
        Animal dog2 = dogFactory.createAnimal("Белла", 2);
        Animal dog3 = dogFactory.createAnimal("Рекс", 4);

        // Создаем фабрику для кошек
        AnimalFactory catFactory = new CatFactory();

        // Создаем несколько кошек с помощью фабрики
        Animal cat1 = catFactory.createAnimal("Мурка", 5);
        Animal cat2 = catFactory.createAnimal("Васька", 4);
        Animal cat3 = catFactory.createAnimal("Лиза", 2);

        // Выводим информацию о каждом животном
        dog1.displayInfo();
        dog1.makeSound();
        dog2.displayInfo();
        dog2.makeSound();
        dog3.displayInfo();
        dog3.makeSound();
        cat1.displayInfo();
        cat1.makeSound();
        cat2.displayInfo();
        cat2.makeSound();
        cat3.displayInfo();
        cat3.makeSound();

        // Выводим количество созданных животных каждого типа и их возраст
        System.out.println("Количество собак: " + dog1.getCount());
        System.out.println("Количество кошек: " + cat1.getCount());
        System.out.println("Возраст собак: " + dog1.getAge() + ", " + dog2.getAge() + ", " + dog3.getAge());
        System.out.println("Возраст кошек: " + cat1.getAge() + ", " + cat2.getAge() + ", " + cat3.getAge());
    }
}
