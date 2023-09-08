package OOP.homeworkOOP.hw3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        Predicate<Integer> countOfPeople;
        boolean result;

        People people1 = new People("Виктория", 2345, 6);
        People people2 = new People("Владимир", 145, 1);
        People people3 = new People("Полина", 432, 3);
        People people4 = new People("Мария", 447, 3);
        People people5 = new People("Сергей", 7808, 19);

        market.addPeople(people1);
        market.addPeople(people2);
        market.addPeople(people3);
        market.addPeople(people4);
        market.addPeople(people5);

        market.fullQueue(); // использование Iterator. Вывод всех посетителей в очереди

        market.removePeople(people3); // удаление из очереди

        for (int i = market.size(); i >= 0; i--) {
            countOfPeople = (n) -> market.size() > n; // функциональный интефейс
            result = countOfPeople.test(0);
            if (result) {
                market.update();
                System.out.println("В очереди " + market.size() + " человек(а)");
                System.out.println("----------------------------");
            } else {
                System.out.println("~~ В очереди нет покупателей ~~");
            }
        }
        market.collectionSort(); // Функция сортировки. Comparator.
    }
}
