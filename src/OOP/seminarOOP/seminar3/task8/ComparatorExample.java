package OOP.seminarOOP.seminar3.task8;

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

        // Создаем компаратор для сортировки по имени в обратном алфавитном порядке
        Comparator<Person> nameComparator = (person1, person2) -> person2.name.compareTo(person1.name);

        // Сортируем список с использованием нового компаратора
        Collections.sort(people, nameComparator);

        System.out.println("After sorting by name (reverse alphabetical):");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
