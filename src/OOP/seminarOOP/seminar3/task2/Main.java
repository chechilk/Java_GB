package OOP.seminarOOP.seminar3.task2;

public class Main {
    // лямбда выражение ->
    public static void main(String[] args) {
        MyParamValue myParamValue = (n) -> 1.0 / n;   // ссылка на экземпляр myParamValue
        System.out.println("Default " + myParamValue.getValue(2.0));

        MyDoubleParamValue myDoubleParamValue1 = (x,y,z) -> ((15.0 - x) + y) / z;
        System.out.println("Значение Double1 " + myDoubleParamValue1.getValue(5.0, 2.0, 6.0));

        MyDoubleParamValue myDoubleParamValue2 = (a,b,c) -> a + b + c;
        System.out.println("Значение Double2 " + myDoubleParamValue2.getValue(3.0,2.0, 1.0 ));
    }
}
