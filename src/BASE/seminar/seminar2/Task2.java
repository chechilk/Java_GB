package BASE.seminar.seminar2;

public class Task2 {
    public static String compressLine(String line) {
        // Напишите метод, который сжимает строку.
        // Пример: вход aaaabbbcdd.

        // пустая ли строка

        StringBuilder sb = new StringBuilder();
        char sbLine = line.charAt(0);
        int count = 1;

        for (int i = 1; i < line.length(); i++){ // проходим по заданной строке
            char nextSB = line.charAt(i); // запоминаем символ

            if (nextSB == sbLine){ // если символ совпадает с предыдущим, увеличиваем счётчик
                count++;
            }
            else {
                sb.append(sbLine); // Добавляем символ предыдущий
                sb.append(count); // Добавляем количество этого символа
                sbLine = nextSB; // предыдущим становится следущий символ из заданной строки
                count = 1; // Счётчик обнуляем
            }
        }
        // Для остатков букв
        sb.append(sbLine);
        sb.append(count);
        return sb.toString();
    }
}
