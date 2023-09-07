package OOP.seminarOOP.seminar2.task4;

public class Main {
    public static void main(String[] args) {
        BasicMath basicMath = new BasicMath();

        int sum = basicMath.add(5, 3);          // 5 + 3 = 8
        int difference = basicMath.subtract(8, 4); // 8 - 4 = 4

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
