package streamsLambda;

import java.util.List;

public class Test1 {

    public static void main(String[] args) {

        List<String> alphabet = List.of("z", "y", "c", "d");
        synchronized (alphabet) {
            String s = alphabet
                    .parallelStream()
                    .sorted()
                    .findAny()
                    .get();
            System.out.println(s);
        }
    }
}
