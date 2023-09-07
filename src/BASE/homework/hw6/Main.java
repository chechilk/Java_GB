package BASE.homework.hw6;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
// Заполнение через конструктор экземпляров класса ноутбуков
        LaptopConfig laptop1 = new LaptopConfig(1, "DEXP Aquilon", "Черный",
                "Intel Celeron N4020", 2.2, 4, 128, "Intel UHD Graphics 600", "Windows 11");
        LaptopConfig laptop2 = new LaptopConfig(2, "Irbis NB257", "Серебристый",
                "Intel Celeron 3350", 2.2, 8, 256, "Intel UHD Graphics 600", "Windows 10");
        LaptopConfig laptop3 = new LaptopConfig(3, "Digma EVE 14 C414", "Серый",
                "Intel Celeron N4020", 2.4, 4, 128, "Intel UHD Graphics 600", "Windows 10");
        LaptopConfig laptop4 = new LaptopConfig(4, "Razer Blade 18", "Черный",
                "Intel Core i9-13950HX", 32, 32, 1000, "GeForce RTX 4080", "MacOS");
        LaptopConfig laptop5 = new LaptopConfig(5, "MSI Titan GT77 HX 13VI-096RU", "Черный",
                "Intel Core i9-13950HX", 32, 32, 1000, "GeForce RTX 4080", "macOS");

        // Создание HashSet ноутбуков и добавление элементов
        HashSet<LaptopConfig> setLaptops = new HashSet<>();

        setLaptops.add(laptop1);
        setLaptops.add(laptop2);
        setLaptops.add(laptop3);
        setLaptops.add(laptop4);
        setLaptops.add(laptop5);

        // Вывод HashSet ноутбуков на экран
        System.out.print(setLaptops.toString());

        // Сравнение экземпляров объектов через метод equals
        System.out.println("\nСравнение экземпляров объектов через метод equals: ");
        System.out.println(laptop1.equals(laptop2));
        System.out.println(laptop3.equals(laptop3));

        // Сравнивнение экземпляров объектов через метод hashCode
        System.out.println("\nСравнивнение экземпляров объектов через метод hashCode: ");
        System.out.println(laptop3.hashCode());
        System.out.println(laptop5.hashCode());

        // Поиск экземпляра объекта в HashSet
        System.out.println("\nЭкземпляр объекта в HashSet: " + setLaptops.contains(laptop5));
    }
}