package BASE.homework.hw1;

import java.util.Scanner;

public class Task3 {
    public static void calculate() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
            System.out.print("Введите оператор (+, -, *, /): ");
            char action = scanner.next().charAt(0);
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();
            double result = 0;

            switch (action) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Ошибка ввода");
                    return;
            }
            System.out.println(num1 + " " + action + " " + num2 + " = " + result);
        }
    }
}
