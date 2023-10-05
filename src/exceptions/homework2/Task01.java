package exceptions.homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task01 {
    public static void main(String[] args) {
        boolean repeat = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (repeat){
            System.out.print("Введите число: ");
            try{
                // Проверка на тип float
                Float number = Float.parseFloat(reader.readLine());
                System.out.println("Введённое число : " + number);
                repeat = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Неверный ввод данных.");;
            }
        }
    }
}

    /**
     *     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     *
     *     InputStream a = System.in;
     *     InputStreamReader b = new InputStreamReader(a);
     *     BufferedReader reader = new BufferedReader(b);
     */

