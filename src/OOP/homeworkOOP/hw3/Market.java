package OOP.homeworkOOP.hw3;

import java.util.*;

public class Market implements MarketBehaviour, QueueBehaviour {
    Queue<People> queue;
    List<People> listQueue;

    public Market() {
        this.queue = new LinkedList<>();
        this.listQueue = new ArrayList<>();
    }

    @Override
    public void addPeople(People people) {
        listQueue.add(people);
        enqueue(people);
    }

    @Override
    public void removePeople(People people) {
        System.out.println("----------------------------");
        System.out.println("Покупатель " + people.getPeopleName() + " вышел(a) из магазина");
        System.out.println("----------------------------");
        this.queue.remove(people);
    }

    @Override
    public void update() {
        if (!queue.isEmpty()) {
            People people = dequeue();
            people.info();
            System.out.println("Покупатель " + people.getPeopleName() + " вышел(a) из магазина");
            System.out.println("----------------------------");
        }
    }

    public void fullQueue() {
        Iterator<People> iter = queue.iterator();
        System.out.println("Очередь: ");
        int index = 1;
        while (iter.hasNext()) {
            System.out.printf("№" + String.valueOf(index) + " ");
            System.out.println(iter.next());
            index++;
        }
    }

    public void collectionSort() {
        System.out.println("До сортировки: ");
        for (People people : listQueue){
            System.out.println(people);
        }
        // Компаратор для сортировки по сумме покупки в порядке возрастания
        Comparator<People> summCompatator = Comparator.comparing(people -> people.summMoney);
        Collections.sort(listQueue, summCompatator);

        System.out.println("После сортировки: ");
        for (People people : listQueue){
            System.out.println(people);
        }
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public People dequeue() {
        return queue.remove();
    }

    @Override
    public void enqueue(People people) {
        queue.add(people);
    }
}
