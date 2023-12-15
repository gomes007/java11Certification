package streamsLambda;


import java.util.function.Predicate;

class Foo {
    int i;
    Foo(int i) {
        this.i = i;
    }
}


public class Test3 {

    static boolean compare(Foo foo, Predicate<Foo> predicate) {
        return predicate.test(foo);
    }


    public static void main(String[] args) {

        Predicate<Foo> p = f -> f.i > 0; //line 1
        p = p.or(f -> f.i > 0).and(f -> f.i < 0); //line 2
        boolean b = compare(new Foo(1), p); //line 3
        System.out.println(b);

    }


}
