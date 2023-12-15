package dataTypes;

import java.util.List;
import java.util.function.Function;

public class Test1 {

    static int calculate (List<String> list, Function<List<String>, Integer> function) {
        return function.apply(list);
    }



    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        calculate(list, s -> s.indexOf("a"));
        System.out.println(calculate(list, s -> s.indexOf("a")));


    }


}
