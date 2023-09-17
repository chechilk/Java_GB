package Test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Вика");
        list1.add("Vika");

        System.out.println(list1.contains("Вика"));
    }

}
