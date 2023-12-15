package collections;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> animals = new LinkedList<>();

        // Adding elements
        animals.add("Dog");
        animals.add("Cat");
        animals.addLast("Horse"); // Add element at the end of the list
        animals.addFirst("Rabbit"); // Add element at the beginning of the list

        // Accessing elements
        System.out.println("First element: " + animals.getFirst());
        System.out.println("Last element: " + animals.getLast());

        // Removing elements
        animals.removeFirst(); // Remove first element (Rabbit)
        animals.removeLast(); // Remove last element (Horse)

        // Iterating through the LinkedList
        System.out.println("Elements in the LinkedList:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // Size of the LinkedList
        System.out.println("Total number of animals in the list: " + animals.size());
    }

}
