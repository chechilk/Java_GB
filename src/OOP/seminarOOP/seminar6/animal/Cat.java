package OOP.seminarOOP.seminar6.animal;

/**
 * Класс Cat наследует класс Animal и представляет собой конкретное животное -
 * кошку.
 */
public class Cat extends Animal {

    /**
     * Конструктор для создания кошки с именем.
     *
     * @param name Имя кошки.
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * @return Звук, который издает кошка (мяу-мяу).
     */
    @Override
    public String makeSound() {
        return "мяу-мяу";
    }
}
