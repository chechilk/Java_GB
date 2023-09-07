package BASE.seminar.seminar3.Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
1. Заполнить список десятью случайными числами.
2. Отсортировать список методом sort() и вывести его на экран.
 */
public class Task1 {
//    static Random random = new Random(); // Создание рандома
//    public static List<Integer> generateRandomIntegers(int count){
//        return Stream.generate(random::nextInt).limit(count).collect(Collectors.toList());
//    }
//    public static void execute() {
//        List<Integer> integers = generateRandomIntegers(10);
//        System.out.println(integers);
//        integers.sort(Integer::compareTo);
//        System.out.println(integers);
//    }
    public static void filler(){
        ArrayList<Integer> array = new ArrayList<>(); // Обявъяление Lista
        Random rnd = new Random();
        for (int i = 0; i < 10; ++i){ // Заполнение массива рандомными числами
            array.add(rnd.nextInt(100)); // bound -
        }
        System.out.println(array);
        Collections.sort(array);
        System.out.println(array);
    }
}
