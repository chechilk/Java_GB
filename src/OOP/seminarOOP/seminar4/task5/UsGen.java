package OOP.seminarOOP.seminar4.task5;

public class UsGen {

    //    static void test(Gen<? extends D> o) {
//        // ...
//    }
    static void test(Gen<? super B> o) {
        // ...
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> genA = new Gen<A>(a);
        Gen<B> genB = new Gen<B>(b);
        Gen<C> genC = new Gen<C>(c);
        Gen<D> genD = new Gen<D>(d);

        test(genA);
        test(genB);
//        test(genC);
//        test(genD);
    }
}
