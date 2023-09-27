package exceptions.seminar1;

/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
 * Необходимо посчитать и вернуть сумму элементов этого массива.
 * При этом накладываем на метод 2 ограничения:
 * метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
 * и в каждой ячейке может лежать только значение 0 или 1.
 * Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
 */
public class Task02 {

    public static void main(String[] args) {
        Integer[][] array = {{1, 0, 0}, {0, 0, 0}, {1, 1, 1}};
        System.out.println(searchSum(array));
    }

    public static Integer searchSum(Integer[][] mass) {
        int sumMass = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass.length != mass[0].length) {
                throw new RuntimeException("Массив не квадратный. Строки = " + mass.length + ". Столбцы = " + mass[0].length);
            }
            for (int j = 0; j < mass.length; j++) {
                if (mass[i][j] < 0 || mass[i][j] > 1) {
                    throw new RuntimeException("Массив содержит содержит не только числа 1 и 0!");
                }
                sumMass = sumMass + mass[i][j];
            }
        }
        return sumMass;
    }
}
