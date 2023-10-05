package exceptions.homework2;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        if (text.isEmpty()) {
            throw new IllegalAccessException("Пустая строка! Повторите ввод!");
        } else {
            System.out.println("Текст: " + text);
            repeat = false;
        }

    }
}
