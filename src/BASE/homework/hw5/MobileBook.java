package BASE.homework.hw5;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

// Задание

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена
// с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.

// Пример меню:
// 1) Добавить контакт
// 2) Вывести всех
// 3) Выход

// Иванов 123432
// Иванов 546457
// Иванов 788354

public class MobileBook {

    // -----  Метод sortedPrint() сортирует и распечатывает данные по абонентам -----
    static void sortedPrint(Map<String, ArrayList> map) {

        // Получаем набор всех ключей abon
        Set<String> keySet = map.keySet();

        // Находим минимальное и максимальное значение
        int maxCount = 0;
        int minCount = 1_000_000;

        for (var item : map.entrySet()) {
            if (maxCount < item.getValue().size())
                maxCount = item.getValue().size();
            if (minCount > item.getValue().size())
                minCount = item.getValue().size();

        }
        // Формируем стек, начиная с минимального количества номеров
        Stack<String> st = new Stack<>();
        int num = minCount;
        while (num <= maxCount) {
            // System.out.println(map);
            for (var item : map.entrySet()) {
                if (item.getValue().size() == num) {
                    st.push(item.getKey());
                }
            }
            num += 1;
        }
        // Распечатываем пары в порядке ключей, находящихся в стеке
        String name;
        for (int i = 0; i < keySet.size(); i++) {
            name = st.pop();
            for (var item : map.entrySet()) {
                if (name == item.getKey()) {
                    System.out.printf("%8s: ", item.getKey());
                    System.out.println(item.getValue());
                }
            }
        }
        System.out.println();
    }
}