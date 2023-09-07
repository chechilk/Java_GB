package BASE.seminar.seminar3.Solution;

import java.util.ArrayList;
import java.util.List;

/*
Даны следующие строки, cравнить их с помощью == и
        метода equals() класса Object
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
*/
public class Task0 {

    public  static void StringTest(){
        // пакеты - объединение кода
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1; // ССЫЛАЮТСЯ на одно и тоже
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });
        /*
        if (s1 == s2) System.out.println("Test 1 ok"); // true
        if (s3 == s4) System.out.println("Test 2 ok"); // true
        if (s5.equals(s6)) System.out.println("Test 3 ok"); // false // так как под s5 и s6 выделяется новая память,
        // но используя метод equals() сравниваются значения, а не ссылки на них.


        System.out.println("До изменения s2: " + "s1= " + s1 + ",s2= " + s2 + ",s3= " + s3);
        s2="new value";
        System.out.println("После изменения s2: " + "s1= " + s1 + ",s2= " + s2 + ",s3= " + s3);
         */

        List<String> stringList1 = new ArrayList<>(); // первый List
        stringList1.add(s1); // добавили первую строку
        stringList1.add("new value"); // добавили вторую строку
        List<String> stringList2 = stringList1; // Создали второй List с переменными первого
        System.out.println("До: " + "stringList1: "+ stringList1 + ", stringList2: " + stringList2); // Вывод до изменений

        stringList1.add("new value 2"); // Добавили в первый строку
        System.out.println("После: " + "stringList1: "+ stringList1 + ", stringList2: " + stringList2); // После изменений
        // Так же добавляется на второй, так как вместе ссылаются на один объект.

        stringList1 = new ArrayList<>(); // создали ноакю память под List1. Теперь они не связаны с List2
        stringList1.add("new value 2");
        stringList2.add("new value 3");

        System.out.println("stringList1: "+ stringList1);
        System.out.println("stringList2: " + stringList2);
    }

}
