package BASE.homework.hw4.Solution;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/*
        1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
           Добавить кейс reverse в consoleProgram

 */

public class ConsoleProgramHW {
    private static LinkedList<String> listData = new LinkedList<>(); // глобальная переменная
    public static void run() { // основная часть программы

        boolean getIteration = true;
        while (getIteration){
            String command = inputData("Введите команду: ");
            String [] cLine = command.toUpperCase().split("~");
            // print~num - распечатать эл на num позиции
            //
            switch (cLine[0]){
                case "EXIT":
                    getIteration = false;
                    break;
                case "PRINT":
                    System.out.println(listData.get(Integer.parseInt(cLine[1])));
                    // cLine - String, Integer.parseInt - преобразование в int
                    break;
                case "LIST":
                    while (listData.size() > 0){
                        System.out.print(listData.pop() + " ");
                    }
                    System.out.println();
                    break;
                case "REVERSE": // Лист в обратном порядке
                    if (listData.size() >= 1){
                        System.out.println("Лист до revers: " + listData);
                        System.out.print("Лист после revers: ");
                        for (int i = listData.size() - 1; i >=0; i--)
                            System.out.print(listData.get(i) + " ");
                    } else
                        System.out.println("Лист пуст!");
                    System.out.println();
                    break;
                default: // добавление данных
                    if (cLine.length > 1) {
                        if (isInt(cLine[1])) {
                            adder(cLine);
                        } else {
                            listData.addFirst(cLine[0]); // addFirst - добавление в начало
                        }
                    } else {
                        listData.addFirst(cLine[0]);
                    }
                    break;
            }
        }
    }

    private static boolean isInt(String text) { // обработка исключений
        try {
            Integer.parseInt(text); // Integer.parseInt - преобразует строку в число
            return true;
        } catch (NumberFormatException e) { // NumberFormatException - неверное преобразование строки в числовой формат.
            return false;
        }
    }
    private static List<String> adder(String[] cLine) {
        if (isInt(cLine[1])) { // провекра на число
            int num = Integer.parseInt(cLine[1]); // перевод в int, num - позиция куда ставим
            if (num > listData.size()) { // если больше размер
                for (int i = listData.size() - num; i < num + 1; ++i) {
                    listData.add(" ");
                }
            }
            listData.add(num, cLine[0]);
        }
        return listData;
    }

    private static String inputData(String message){ // запрос данных у пользователя, считывание ввода
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextLine();
    }
}
