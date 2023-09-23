package OOP.seminarOOP.seminar6.animal;

/**
 * Класс Dog наследует класс Animal и представляет собой конкретное животное -
 * собаку.
 */
public class Dog extends Animal {

    /**
     * Конструктор для создания собаки с именем.
     *
     * @param name Имя собаки.
     */
    public Dog(String name) {
        super(name);
    }

    /**
     * @return Звук, который издает собака (гав-гав).
     */
    @Override
    public String makeSound() {
        return "гав-гав";
    }
}
