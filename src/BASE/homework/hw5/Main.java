package BASE.homework.hw5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Инициализация начального списка
        Map<String, ArrayList> abon = new HashMap<>() {
            {
                put("Иванов", new ArrayList<Integer>() {
                    {
                        add(876787);
                        add(888876);
                        add(922381);
                    }
                });
                put("Кузьмина", new ArrayList<Integer>() {
                    {
                        add(123123);
                    }
                });
                put("Петров", new ArrayList<Integer>() {
                    {
                        add(838383);
                        add(232377);

                    }
                });
                put("Лапкина", new ArrayList<Integer>() {
                    {
                        add(886644);
                        add(555222);
                        add(182830);
                        add(999999);
                    }
                });
            }
        };
        System.out.println();
        // Печатаем исходный набор данных
        System.out.println("Исходные данные: ");
        MobileBook.sortedPrint(abon);

        // Создаем циклическое меню
        Scanner scan = new Scanner(System.in, "cp866");
        Boolean getOut = false;
        String st;
        while (!getOut) {
            System.out.println("Выберите действие: \n1 - добавить абонента.\n9 - выйти из программы.");
            st = scan.nextLine();
            String name = "";
            String phString;
            switch (st) {
                case "1": {
                    System.out.println("Введите фамилию абонента:");
                    name = scan.nextLine();
                    if (abon.containsKey(name)) {
                        System.out.println("Такая фамилия уже есть.");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Введите номера телефонов через запятую: ");
                        phString = scan.nextLine();
                        String[] arr = phString.split(",");
                        ArrayList<Integer> arrInt = new ArrayList<>();
                        for (String item : arr) {
                            arrInt.add(Integer.parseInt(item.trim()));
                        }
                        abon.put(name, arrInt);
                        System.out.println();
                        MobileBook.sortedPrint(abon);
                        break;
                    }
                }
                case "9": {
                    getOut = true;
                    System.out.println();
                    System.out.println("Вы вышли из программы!");
                    System.out.println();
                    break;
                }
            }
        }

        /// Задача 2.
        int [] array = new int[] {45, 239, 5, 8869, 786, 14, 45};
        int n = array.length;
        System.out.print("Заданный массив: ");
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");

        System.out.println();
        Sorted.sort(array);
        System.out.print("Отсортированный массив :");
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
    }
}
