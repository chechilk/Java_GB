package OOP.homeworkOOP.hw2.task1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

//Enqueue: Вставляет элемент в конец queue.
//Dequeue: Удаляет объект из начала queue и возвращает его, тем самым уменьшая размер queue на единицу.
//Peek: Возвращает объект в начале queue, не удаляя его.
//IsEmpty: Проверяет, пуста queue или нет.
//Size: Возвращает общее количество элементов, присутствующих в queue.
public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<String> queue;
    public Market(){
        this.queue = new LinkedList<>();
    }

    @Override
    public void addPerson(String person) {
        enqueue(person);
    }

    @Override
    public void removePerson(String person) {
        queue.remove(person);
    }

    @Override
    public void update() {
        if (!queue.isEmpty()) {
            Random random = new Random();
            int id = random.nextInt(90000) + 10000;
            String person = dequeue();
            System.out.println("-----------------------");
            System.out.println("Заказ на имя " + person + " принят, № заказа: " + id);
            System.out.println("Обработка заказа №" + id);
            System.out.println("Заказ №" + id + " выдан, получатель: " + person);
            System.out.println("-----------------------");
        } else {
            System.out.println("~~ В очереди нет заказов ~~");
        }
    }

    @Override
    public void enqueue(String person) {
        queue.add(person);
    }

    @Override
    public String dequeue() {
        return queue.remove();
    }
    @Override
    public int size() {
        return queue.size();
    }
}
