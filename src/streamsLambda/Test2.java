package streamsLambda;

import java.util.stream.Stream;

public class Test2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; ++i) {
            System.out.println(i);
        }


        Stream<Integer> nums1 = Stream.iterate(1, n -> n <= 10, n -> n + 2);
        nums1.forEach(System.out::println);

        Stream<Integer> nums2 = Stream.iterate(1, n -> n < 10, n -> n + 1);
        nums2.forEach(System.out::println);

        //Stream<Integer> nums3 = Stream.iterate(1; n -> n < 10, n -> n + 1);
        //nums3.forEach(System.out::println);

        Stream.iterate(1, n -> n <= 10, n -> n + 1).forEach(System.out::println);

        //Stream.iterate(1; n -> n <= 10, n -> n + 1).forEach(System.out::println);

    }

}
