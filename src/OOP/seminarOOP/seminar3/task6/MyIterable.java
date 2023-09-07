package OOP.seminarOOP.seminar3.task6;

import java.util.Iterator;

// класс MyIterable реализовывает интерфейс Iterable<Integer> (указывает на перебор элементов типа Integer)
public class MyIterable implements Iterable<Integer> {

    private int[] data;

    public MyIterable(int[] data) { // добавление конструктора и массива данных. Конструктор принимает массив данных и сохраняет
        this.data = data;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator(); // создание нового объекта
    }

    private class MyIterator implements Iterator<Integer> { // внутренний класс. Логика перебора элементов массива data

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < data.length; // возвращает остались ли ещё элементы в data
        }

        @Override
        public Integer next() { // возвращает следующий элемент массива data
            return data[index++];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        MyIterable iterable = new MyIterable(numbers);

        for (int num : iterable) {
            System.out.println(num);
        }
    }
}
