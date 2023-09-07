package BASE.seminar.seminar3.Solution;

import java.util.ArrayList;
import java.util.List;
/*
Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных
позициях - названия книг.
Напишите метод для заполнения данной структуры.
 */
public class Task4 {
    public static void task4()
    {
        List<List<String>> library = new ArrayList<>();

        List<String> g1 = new ArrayList<>();
        g1.add("проза: ");
        g1.add("война и мир");
        g1.add("12 стульев");

        library.add(g1);

        List<String> g2 = new ArrayList<>();
        g2.add("поэзия: ");
        g2.add("бородино");
        library.add(g2);

        for (int i = 0; i< library.size();i++){
            System.out.println(library.get(i));
    }
        System.out.println();
    }
}