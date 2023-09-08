package Test.Iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//Enqueue: Вставляет элемент в конец queue.
//Dequeue: Удаляет объект из начала queue и возвращает его, тем самым уменьшая размер queue на единицу.
//Peek: Возвращает объект в начале queue, не удаляя его.
//IsEmpty: Проверяет, пуста queue или нет.
//Size: Возвращает общее количество элементов, присутствующих в queue.
public class Test {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Vika");
        queue.add("Tanya");
        queue.add("Vova");
        queue.add("Polina");

        Iterator iterator = queue.iterator();
        System.out.print("Очередь: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
