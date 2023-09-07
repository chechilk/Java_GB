package OOP.seminarOOP.seminar3.task9;

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

        // Создаем компаратор для сортировки по имени в алфавитном порядке
        Comparator<Person> nameComparator = Comparator.comparing(person -> person.name);

        // Создаем компаратор для сортировки по возрастанию возраста
        Comparator<Person> ageComparator = Comparator.comparingInt(person -> person.age);

        // Сортируем список с использованием компараторов
        Collections.sort(people, nameComparator.thenComparing(ageComparator));

        System.out.println("After sorting by name (alphabetical) and age (ascending):");
        for (Person person : people) {
            System.out.println(person);
        }

        // Обратная сортировка по имени
        Collections.sort(people, nameComparator.reversed().thenComparing(ageComparator));

        System.out.println("After sorting by name (reverse alphabetical) and age (ascending):");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
