package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> cars = new HashSet<>();

        // 1. Adding elements: add(E e)
        cars.add("Toyota");
        cars.add("Ford");
        cars.add("BMW");
        // Trying to add a duplicate element (which will not be added)
        cars.add("Toyota");

        // 2. Checking if an element exists: contains(Object o)
        if (cars.contains("BMW")) {
            System.out.println("BMW is in the set.");
        }

        // 3. Removing an element: remove(Object o)
        cars.remove("Ford");

        // 4. Iterating over elements
        System.out.println("Current set of cars:");
        for (String car : cars) {
            System.out.println(car);
        }

        // 5. Getting the size of the set: size()
        System.out.println("Number of cars in the set: " + cars.size());

        // Bonus: Using an iterator
        System.out.println("Iterating using an iterator:");
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
