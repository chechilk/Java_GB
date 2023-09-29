package exceptions.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
