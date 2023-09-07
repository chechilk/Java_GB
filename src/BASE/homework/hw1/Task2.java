package BASE.homework.hw1;

public class Task2 {
    public static void task2() {
        // Вывести простые числа от 1 до 1000
        for (int i = 1; i <= 1000; i++) {
            boolean result = searchPrimeNumber(i);
            if (result) {
                System.out.println(i);
            }
        }
    }
    public static boolean searchPrimeNumber(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i % 2 == 0 || i % 3 == 0){
            return false;
        }
        for (int j = 5; j <= Math.sqrt(i); j = j + 6) {
            if (i % j == 0 || i % (j + 2) == 0)
                return false;
        }
        return true;
    }
}
