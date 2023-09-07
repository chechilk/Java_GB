package OOP.seminarOOP.seminar3.task3;

public class Main {
    public static void main(String[] args) {
        MyParamValue myParamValue = (val) -> {
            for (int i = 0; i < val; i++){
                System.out.println(val);
            }
            return val + 10;
        };
        System.out.println(myParamValue.getValue(20));
    }
}
