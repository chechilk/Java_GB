package OOP.seminarOOP.seminar4.task3;

public class NumberContainer<T extends Number> {
    private T number;

    public NumberContainer(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public double square() {
        return number.doubleValue() * number.doubleValue();
    }

    public static void main(String[] args) {
        NumberContainer<Integer> intContainer = new NumberContainer<>(5);
        NumberContainer<Double> doubleContainer = new NumberContainer<>(3.14);

        System.out.println("Квадрат целого числа: " + intContainer.square());
        System.out.println("Квадрат вещественного числа: " + doubleContainer.square());
    }
}
