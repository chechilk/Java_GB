package exceptions.seminar1;

import BASE.homework.hw5.Sorted;

/**
 Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
 Метод ищет в массиве заданное значение и возвращает его индекс.
 При этом, например:
 -- если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
 -- если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
 -- если вместо массива пришел null, метод вернет -3
 -- придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
 Напишите метод, в котором реализуйте взаимодействие с пользователем.
 То есть, этот метод запросит искомое число у пользователя, вызовет первый,
 обработает возвращенное значение и покажет читаемый результат пользователю.
 Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
 **/
public class Task01 {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6};
        Integer minLength = 4; // Минимальное заданное число
        Integer searchNum = 5; // Искомое число
        System.out.println(printMessage((search(array,searchNum,minLength))));
    }

    public static Integer search(Integer[] array, Integer search, Integer minLength){
        if(array.length < minLength){
            return -1;
        }
        if (array == null) {
            return -3;
        }
        for (int i = 0; i < array.length; i++){
            if(array[i] == search){
                return i;
            }
        }
        return -2;
    }

    public static String printMessage(Integer errorNumber){
        if (errorNumber == -1){
            return "Длина массива меньше заданного числа.";
        } else if (errorNumber == -2) {
            return "Искомый элемент не найден.";
        } else if (errorNumber == -3) {
            return "Массив без значений";
        }
        return "Индекс найденного элемента массива " + errorNumber;
    }
}
