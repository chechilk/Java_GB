package BASE.seminar.seminar4.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
//
public class ListTest {
//    1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//    2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
//    Сравните с предыдущим.
    ////////////////////////
    public static void TimeTest(int size){

        Random rnd = new Random();
        List<Integer> arrList = new ArrayList<>();
        List<Integer> linkList = new LinkedList<>();

        var time = System.currentTimeMillis(); // в начале выполнения кода
        for (int i = 0; i < size; i++){
            arrList.add(i);
        }
        System.out.print("ArrayList конец: ");
        System.out.println(System.currentTimeMillis() - time); // в конце выполнения кода

        time = System.currentTimeMillis();
        for (int i = 0; i < size; i++){
            linkList.add(i);
        }
        System.out.print("LinkedList конец: ");
        System.out.println(System.currentTimeMillis() - time);

        System.out.println("/////////////////////////////////////////////////");
        arrList.clear();
        linkList.clear();

        time = System.currentTimeMillis();
        for (int i = 0; i < size; i++){
            arrList.add(0, i);
        }
        System.out.print("ArrayList начало: ");
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        for (int i = 0; i < size; i++){
            linkList.add(0,i);
        }
        System.out.print("LinkedList начало: ");
        System.out.println(System.currentTimeMillis() - time); // в конце выполнения кода

        System.out.println("/////////////////////////////////////////////////");
//        arrList.clear();
//        linkList.clear();

        time = System.currentTimeMillis();
        for (int i = 0; i < size / 10; i++){
            arrList.add(rnd.nextInt(100_000),i);
        }
        System.out.print("ArrayList середина: ");
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        for (int i = 0; i < size / 10; i++){
            linkList.add(rnd.nextInt(100_000),i);
        }
        System.out.print("LinkedList середина: ");
        System.out.println(System.currentTimeMillis() - time); // в конце выполнения кода
    }
}
