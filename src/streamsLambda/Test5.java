package streamsLambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        printNamesStartingWith(names, "z");
        printSquaredNumbers(numbers);

        List<Integer> squaredNumbers = printNumbers(numbers);
        System.out.println("Squared Numbers: " + squaredNumbers);

        //filtering
        List<Integer> filtering = squaredNumbers.stream()
                .filter(n -> n > 3)
                .collect(Collectors.toList());
        System.out.println("Filtering: " + filtering);

        int i = sumNumbers(numbers);
        System.out.println("Sum: " + i);

        printShortNames(names);


    }


    private static void printNamesStartingWith(List<String> names, String prefix) {

        boolean hasMatch = names.stream()
                .anyMatch(name -> name.startsWith(prefix));

        if (hasMatch) {
            names.stream()
                    .filter(name -> name.startsWith(prefix))
                    .forEach(System.out::println);
        } else {
            System.out.println("No match found");
        }
    }


    private static void printSquaredNumbers(List<Integer> numbers) {
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(squaredNumbers);
    }


    private static List<Integer> printNumbers(List<Integer> numbers) {
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        return squaredNumbers;
    }


    private static int sumNumbers(List<Integer> numbers) {
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        return sum;
    }


    private static void printShortNames(List<String> names) {
        List<String> shortNames = names.stream()
                .filter(name -> name.length() <= 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(shortNames);
    }



}




