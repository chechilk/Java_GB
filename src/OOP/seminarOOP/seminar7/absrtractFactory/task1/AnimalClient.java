package OOP.seminarOOP.seminar7.absrtractFactory.task1;

// Абстрактный класс животного
abstract class Animal {
    abstract String getName();
}

// Конкретный класс для собаки
class Dog extends Animal {
    @Override
    String getName() {
        return "Собака";
    }
}

// Конкретный класс для кошки
class Cat extends Animal {
    @Override
    String getName() {
        return "Кошка";
    }
}

// Абстрактный класс для фабрики животных
abstract class AnimalFactory {
    abstract Animal createAnimal();
}

// Фабрика для создания собак
class DogFactory extends AnimalFactory {
    @Override
    Animal createAnimal() {
        return new Dog();
    }
}

// Фабрика для создания кошек
class CatFactory extends AnimalFactory {
    @Override
    Animal createAnimal() {
        return new Cat();
    }
}

public class AnimalClient {
    public static void main(String[] args) {
        // Создаем фабрику для создания собак
        AnimalFactory dogFactory = new DogFactory();

        // Создаем собаку
        Animal dog = dogFactory.createAnimal();
        System.out.println("Создано: " + dog.getName()); // Вывод: Создано: Собака

        // Создаем фабрику для создания кошек
        AnimalFactory catFactory = new CatFactory();

        // Создаем кошку
        Animal cat = catFactory.createAnimal();
        System.out.println("Создано: " + cat.getName()); // Вывод: Создано: Кошка
    }
}
