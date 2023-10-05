package exceptions.homework1;

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] mass = new int[10];
        mass[12] = 4;
    }

    public static void divisionByZero() {
        int a = 14;
        int result = a / 0;

    }

    public static void numberFormatException() {
        int result = Integer.parseInt("vika");

    }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
