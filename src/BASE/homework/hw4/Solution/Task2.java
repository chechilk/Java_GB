package BASE.homework.hw4.Solution;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/*
  2. Реализуйте очередь с помощью LinkedList со следующими методами:
     enqueue() - помещает элемент в конец очереди,
     dequeue() - возвращает первый элемент из очереди и удаляет его,
     first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Task2 {
    public static void result() {
        LinkedList<Integer> myList = new LinkedList<>();
        int sizeList = 10;
        inputList(myList, sizeList); // заполнение List случайными числами + enqueue

        // Удаление элемента по введённому индексу
        System.out.println("Начальный List: " + myList);
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите индекс элемента, который хотим удалить: ");
        int indexDelete = sc.nextInt();
        System.out.println("Удаляем элемент: " + dequeue(myList, indexDelete) + '\n' +
                "List + удалённый элемент: " + myList);

        // Возвращает элемент по введённому индексу
        System.out.print("Введите индекс элемента, который хотим получить: ");
        int indexReturn = sc.nextInt();
        System.out.println("Возвращаем элемент: " + myList.get(indexReturn) + '\n' +
                "List: " + myList);
    }


    private static void inputList(LinkedList<Integer> list, int sizeList) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            enqueue(list, rnd.nextInt(15));
        }
    }

    private static void enqueue(LinkedList<Integer> list, int arg) {
        list.addLast(arg);
    }

    private static Integer dequeue(LinkedList<Integer> list, int index) {
        int indexDel =  list.get(index);
        list.remove(index);
        return indexDel;
    }

    private static Integer first(LinkedList<Integer> list, int index){
        return list.get(index);
    }
}
