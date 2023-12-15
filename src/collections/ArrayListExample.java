package collections;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Access elements
        System.out.println("Element at index 1: " + fruits.get(1)); // Output: Banana

        // Modify elements
        fruits.set(2, "Blueberry"); // Changing "Cherry" to "Blueberry"

        // Remove elements
        fruits.remove(3); // Removes "Date"

        // Iterate over ArrayList
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Size of the ArrayList
        System.out.println("Number of fruits in the list: " + fruits.size());
    }

}
