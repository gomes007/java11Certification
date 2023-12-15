package streamsLambda;

import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {

        int i = -1;
        Optional<Integer> result = calculate(90, ++i);
        System.out.println(result.orElseThrow());

    }


    private static Optional<Integer> calculate(int a, int b) {
        if (b == 0) {
            return Optional.empty();
        }
        return Optional.of(a / b);
    }

}
