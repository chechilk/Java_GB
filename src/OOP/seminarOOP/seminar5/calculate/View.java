package OOP.seminarOOP.seminar5.calculate;

public class View {
    public void printResult(double result) {
        System.out.println("Результат: " + result);
    }
    public void printError(String errorMessage) {
        System.err.println("Ошибка: " + errorMessage);
    }
}
