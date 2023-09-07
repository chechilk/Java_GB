package OOP.seminarOOP.seminar3.task1;

public class Main {
    // лямбда выражение ->
    public static void main(String[] args) {
        MyParamValue myParamValue; // ссылка на экземпляр myParamValue
        myParamValue = () -> 98.6;
        System.out.println(myParamValue.getValue());
    }
}
