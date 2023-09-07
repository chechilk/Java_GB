package BASE.seminar.seminar3.Solution;

import java.util.ArrayList;
import java.util.List;

/*
1. Создать список типа ArrayList<String>.
2. Поместить в него как строки, так и целые числа.
3. Пройти по списку, найти и удалить целые числа.
 */
public class Task3 {
    public static void ObjList() {
        // Использование Object
        List<Object> oList = new ArrayList<>();
        oList.add("Vika");
        oList.add(4);
        oList.add(6.6);
        oList.add("car");
        oList.add("chek");
        oList.add(123);
        oList.add(14);
        oList.add(1);
        Object a = 1;

        System.out.println(oList);

        for (int i = 0; i < oList.size(); i++) {
            if (oList.get(i).getClass() == a.getClass()) {
                oList.remove(i);
            }
        }
        System.out.println(oList);
//        List<Object> oList = new ArrayList<>();
//        oList.add("a");
//        oList.add(1);
//        oList.add(2);
//        oList.add("b");
//        System.out.println(oList);
//
//        for (int i = 0; i <oList.size();i++){
//
//            System.out.println(oList.get(i).getClass());// getClass - метод, который определяет тип переменной.
//            // get(i) - получить значение листа
//        }
//        oList.removeAll(Arrays.asList(1,2)); // удаление 1, 2
//        System.out.println(oList);

    }
}