package BASE.seminar.seminar3.Solution;

import java.util.*;

/*
1. Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
2. Вывести название каждой планеты и количество его повторений в списке.
 */
    public class Task2 {

    public static ArrayList<String> randomFill(String[] plans) { //
        ArrayList<String> planets = new ArrayList<>();
        // Scanner sc = new Scanner(System.in);
        //System.out.println("Enter array size: ");
        int n = 15;
        // sc.nextInt();
        // sc.close();
        for (int i = 0; i < n; ++i) {
            planets.add(plans[(int) (Math.random() * plans.length)]);
        }
        System.out.println("Заполненный лист: " + planets);
        return planets;
    }

    public static HashMap<String, Integer> namesCounts(ArrayList<String> planets) {
        HashMap<String, Integer> dict = new HashMap<>();
        for (String string : planets) { // по всем элементам списка
            if (dict.keySet().contains(string)) { // если есть значения листа в словаре
                dict.put(string, dict.get(string) + 1); // увеличиваем значение
            } else {
                dict.put(string, 1); // если нет - создаём новый экземпляр
            }
        }
        return dict;
    }

    public static void planetsFreq() {
        String[] plans = {"Меркурий", "Венера", "Земля", "Марс",
                "Сатурн", "Юпитер", "Уран", "Нептун", "Плутон", "Марс", "Земля", "Плутон", "Плутон"};
        System.out.print("Массив: ");
        for (String pl:plans){
            System.out.print(pl + ", ");
        }
        System.out.println();
        List<String> planetsList = Arrays.asList(plans); // перевод массива в лист
        System.out.println("Лист: " + planetsList);
        Set <String> planetsSet= new HashSet<>(planetsList); // создаём словарь на основе листа
        System.out.println("Словарь: " + planetsSet);

        System.out.print("Результат: ");
        for (String pl: planetsSet){
            System.out.print(pl + " - " + Collections.frequency(planetsList, pl) + ", ");
        }
        // Выводит название не повторяющихся планет, с помощью Collection.frequency считает сколько
        // встречается планет pl в planetList
    }
}
