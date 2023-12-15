package streamsLambda;

import java.util.function.Function;

public class Test4 {


    static long calculate(Integer factor, Function<Integer, Long> function) {
        return function.apply(factor);
    }

    public static void main(String[] args) {
        int factor = 2;
        System.out.println(calculate(3, x -> Long.valueOf(factor * x)));

    }
}
