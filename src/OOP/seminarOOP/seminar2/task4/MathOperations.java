package OOP.seminarOOP.seminar2.task4;

public interface MathOperations {
    // int a();
    int add(int a, int b);
    default int subtract(int a, int b) {
        return a - b;
    }
}
