package OOP.seminarOOP.seminar3.task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years)";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 22));

        System.out.println("Before sorting:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Создаем компаратор для сортировки по возрасту в порядке возрастания
        Comparator<Person> ageComparator = Comparator.comparingInt(person -> person.age);

        // Сортируем список с помощью компаратора
        Collections.sort(people, ageComparator); // сортировка по возрасту

        System.out.println("\nAfter sorting by age (ascending):");
        for (Person person : people) {
            System.out.println(person);
        }

        // Создаем компаратор для сортировки по имени в алфавитном порядке
        Comparator<Person> nameComparator = Comparator.comparing(person -> person.name);

        // Сортируем список с помощью нового компаратора
        Collections.sort(people, nameComparator); // сортировка по имени

        System.out.println("\nAfter sorting by name (alphabetical):");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
