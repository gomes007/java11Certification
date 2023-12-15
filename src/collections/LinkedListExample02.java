package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class LinkedListExample02 {

    public static void main(String[] args) {
        // Create a LinkedList of Employee objects
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Alice", 30, 70000));
        employees.add(new Employee("Bob", 45, 85000));
        employees.add(new Employee("Charlie", 25, 65000));
        employees.add(new Employee("David", 35, 75000));

        // Sort by age
        employees.sort(Comparator.comparingInt(Employee::getAge));

        // Reverse the LinkedList
        Collections.reverse(employees);

        // Filter employees with salary greater than 70000
        LinkedList<Employee> highEarners = employees.stream()
                .filter(e -> e.getSalary() > 70000)
                .collect(Collectors.toCollection(LinkedList::new));

        System.out.println("Employees sorted by age and reversed:");
        employees.forEach(System.out::println);

        System.out.println("\nEmployees with salary greater than 70000:");
        highEarners.forEach(System.out::println);
    }

}
