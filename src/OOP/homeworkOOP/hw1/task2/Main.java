package OOP.homeworkOOP.hw1.task2;

public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        System.out.println("Создали прямоугольник по умолчанию");
        Rectangle rec2 = new Rectangle(5, 7);
        System.out.println("Создали прямоугольник с шириной = " + rec2.getWidth() + " и высотой = " + rec2.getHeight());
        System.out.println("Площадь = " + rec2.calculateArea() + ", периметр = " + rec2.calculatePerimeter());
    }
}
