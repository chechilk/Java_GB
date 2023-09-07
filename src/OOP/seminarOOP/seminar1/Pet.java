package OOP.seminarOOP.seminar1;

class Pet {
    private String name;
    private int age;

    // Конструктор класса Pet
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттер для получения имени питомца
    public String getName() {
        return name;
    }

    // Сеттер для установки имени питомца
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для получения возраста питомца
    public int getAge() {
        return age;
    }

    // Сеттер для установки возраста питомца
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Метод для издания звука
    public void makeSound() {
        System.out.println("The pet makes a sound.");
    }

    // Метод для вывода информации о питомце
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}