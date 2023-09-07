package lessons.lesson3.Ex000;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo() {
            @Override
            public void m() {
                System.out.println("m");
            }

            @Override
            public void m1() {
                System.out.println("m1");
            }
        };
        foo.m();
    }
}
