package OOP.seminarOOP.seminar1;

public class Main1 {
    public static void main(String[] args) {
        // Создание объекта собаки
        Dog labrador = new Dog("Buddy", 3, "Labrador");

        // Использование геттеров и сеттеров
        System.out.println("Name: " + labrador.getName());
        System.out.println("Age: " + labrador.getAge());

        // Обновление данных собаки
        labrador.setName("Max");
        labrador.setAge(4);

        // Вывод обновленных данных
        System.out.println("Updated Name: " + labrador.getName());
        System.out.println("Updated Age: " + labrador.getAge());

        // Вызов методов и вывод информации о собаке
        labrador.makeSound();
        labrador.displayInfo();
    }
}