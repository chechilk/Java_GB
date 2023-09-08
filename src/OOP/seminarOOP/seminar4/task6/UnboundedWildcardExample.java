package OOP.seminarOOP.seminar4.task6;
import java.util.ArrayList;
import java.util.List;
public class UnboundedWildcardExample {
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(10);

        List<String> stringList = new ArrayList<>();
        stringList.add("Привет");
        stringList.add("Мир");

        printList(intList);
        printList(stringList);
    }
}
