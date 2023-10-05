package exceptions.homework1;

import java.util.Arrays;

/**
 * Реализуйте метод subArrays, принимающий в качестве аргументов два целочисленных массива a и b,
 * и возвращающий новый массив c, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны - верните нулевой массив длины 1.
 */
class Answer02 {
    public int[] subArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        int[] c = new int[a.length];
        if (a.length != b.length) {
            return new int[0];
        } else {
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] - b[i];
            }
        }
        return c;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer02 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{4, 5, 6, 5};
            b = new int[]{1, 2, 3};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer02 ans = new Answer02();
        String itresume_res = Arrays.toString(ans.subArrays(a, b));
        System.out.println(itresume_res);
    }
}
