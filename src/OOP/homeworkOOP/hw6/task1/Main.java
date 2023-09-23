package OOP.homeworkOOP.hw6.task1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employee man = new Employee("Vika", new Date(),10);

        System.out.println(man.getEmpInfo());
    }
}
