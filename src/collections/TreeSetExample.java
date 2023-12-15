package collections;


import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class StaffMember implements Comparable<StaffMember> {
    private String name;
    private int age;

    public StaffMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(StaffMember other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "StaffMember{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}


public class TreeSetExample {

    public static void main(String[] args) {
        // Creating a TreeSet with a custom comparator (by age)
        TreeSet<StaffMember> staff = new TreeSet<>(Comparator.comparingInt(StaffMember::getAge));

        // Adding elements
        staff.add(new StaffMember("Alice", 30));
        staff.add(new StaffMember("Bob", 45));
        staff.add(new StaffMember("Zico", 45));
        staff.add(new StaffMember("Charlie", 25));
        staff.add(new StaffMember("Diana", 40));

        // 1. Iterating over elements
        System.out.println("Staff sorted by age:");
        staff.forEach(System.out::println);

        // 2. Checking if an element exists: contains(Object o)
        System.out.println("Does the set contain Charlie? " + staff.contains(new StaffMember("Charlie", 25)));

        // 3. Working with NavigableSet methods
        // a. Getting the first element: first()
        System.out.println("Youngest staff member: " + staff.first());

        // b. Getting the last element: last()
        System.out.println("Oldest staff member: " + staff.last());

        // c. Getting a subset: headSet(toElement, inclusive)
        NavigableSet<StaffMember> subset = staff.headSet(new StaffMember("Charlie", 25), true);
        System.out.println("Staff members younger than or equal to Charlie:");
        subset.forEach(System.out::println);

        // d. Getting elements in reverse order
        NavigableSet<StaffMember> reverseSet = staff.descendingSet();
        System.out.println("Staff members in reverse order:");
        reverseSet.forEach(System.out::println);

        // 4. Removing an element: remove(Object o)
        staff.remove(new StaffMember("Alice", 30));
        System.out.println("After removing Alice:");
        staff.forEach(System.out::println);

        // 5. Size of the TreeSet: size()
        System.out.println("Number of staff members: " + staff.size());
    }

}
