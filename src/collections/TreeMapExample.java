package collections;


import java.util.NavigableMap;
import java.util.TreeMap;

class TeamMember {
    private String name;
    private String department;
    private double salary;

    public TeamMember(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "TeamMember{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}


public class TreeMapExample {

    public static void main(String[] args) {
        // TreeMap to hold team members with a unique ID for each team member
        TreeMap<Integer, TeamMember> teamMembers = new TreeMap<>();

        // Adding team members to the TreeMap
        teamMembers.put(1003, new TeamMember("Alice", "HR", 70000));
        teamMembers.put(1001, new TeamMember("Bob", "IT", 80000));
        teamMembers.put(1002, new TeamMember("Charlie", "Sales", 65000));

        // Searching for a team member by ID
        int memberIdToFind = 1002;
        if (teamMembers.containsKey(memberIdToFind)) {
            System.out.println("Found team member: " + teamMembers.get(memberIdToFind));
        } else {
            System.out.println("No team member found with ID: " + memberIdToFind);
        }

        // Displaying all team members in sorted order
        System.out.println("\nAll team members in the company:");
        teamMembers.forEach((id, member) -> System.out.println("ID: " + id + " - " + member));

        // Finding a subset of team members (e.g., IDs from 1001 to 1002 inclusive)
        NavigableMap<Integer, TeamMember> subMap = teamMembers.subMap(1001, true, 1002, true);
        System.out.println("\nTeam members with IDs 1001 to 1002:");
        subMap.forEach((id, member) -> System.out.println("ID: " + id + " - " + member));

        // Removing a team member
        int memberIdToRemove = 1003;
        teamMembers.remove(memberIdToRemove);
        System.out.println("\nAfter removing team member ID " + memberIdToRemove + ", company has:");
        teamMembers.forEach((id, member) -> System.out.println("ID: " + id + " - " + member));


        // Finding the first and last team members in the sorted order
        System.out.println("\nFirst team member in the company: " + teamMembers.firstEntry());
        System.out.println("\nLast team member in the company: " + teamMembers.lastEntry());


    }
}
