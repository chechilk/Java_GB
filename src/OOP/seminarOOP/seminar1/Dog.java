package OOP.seminarOOP.seminar1;

// Подкласс для собак
class Dog extends Pet {
    private String breed;
    // Integer MAX_VALUE = 10;

    // Конструктор класса Dog
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Геттер для получения породы собаки
    public String getBreed() {
        return breed;
    }

    // Сеттер для установки породы собаки
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Переопределение метода makeSound()
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }

    // Переопределение метода displayInfo() с дополнительной информацией
    @Override
    public void displayInfo() {
        super.displayInfo(); // Вызов метода базового класса
        System.out.println("Breed: " + breed);
    }
}