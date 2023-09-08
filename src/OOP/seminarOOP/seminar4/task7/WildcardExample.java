package OOP.seminarOOP.seminar4.task7;
import java.util.List;

public class WildcardExample {
    //    Мы объявляем метод printList с параметром типа List<?>. Это означает, что метод принимает список любого типа
//    данных, но мы не можем выполнять операции, зависящие от конкретного типа элементов списка.
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<String> stringList = List.of("Привет", "Мир");

        printList(intList);    // Вывод: 1 2 3
        printList(stringList); // Вывод: Привет Мир
    }
}
