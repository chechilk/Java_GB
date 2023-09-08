package OOP.seminarOOP.seminar4.task7;

import java.util.List;
//Метод printList теперь использует параметр типа T для с
// писка, позволяя нам работать с элементами конкретного типа,
// который будет определен при создании экземпляра класса.
public class GenericExample<T> {
    public void printList(List<T> list) {
        for (T item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GenericExample<Integer> intPrinter = new GenericExample<>();
        GenericExample<String> stringPrinter = new GenericExample<>();

        List<Integer> intList = List.of(1, 2, 3);
        List<String> stringList = List.of("Привет", "Мир");

        intPrinter.printList(intList);    // Вывод: 1 2 3
        stringPrinter.printList(stringList); // Вывод: Привет Мир
    }
}
