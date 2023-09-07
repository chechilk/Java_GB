package BASE.homework.hw1;

import java.util.Scanner;
public class Task1 {
    public static void task1() {
        // Сумма цифр от 1 до n
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number N = ");
        int count = keyboard.nextInt();
        int summ = 0;
        for (int i = 1; i <= count; i++) {
            summ = summ + i;
        }
        System.out.println("Sum of the number from 1 to " + count + " = " + summ);
    }
}
