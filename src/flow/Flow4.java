package flow;


import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person {
    String name;
    int age;


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}


public class Flow4 {

    public static void main(String[] args) {
        Person john = new Person("John", 30);
        Person jane = new Person("Jane", 20);

        Map<String, Integer> people = Stream.of(john, jane)
                .collect(Collectors.toMap(p -> p.name, p -> p.age));

        BiConsumer<String, Integer> consumer = (s, i) -> {
            if (i > 25) {
                System.out.println(s);
            }

        };

        people.forEach(consumer);

    }

}
