package OOP.homeworkOOP.hw4.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PrintArray printArray = new PrintArray();

        Integer array1[] = {1,2,3,4,5};
        String array2[] = {"Я"," ","делаю"," ","домашнее"," ","задание"};

        printArray.printArrays(array1);
        System.out.println();
        printArray.printArrays(array2);
    }
}
