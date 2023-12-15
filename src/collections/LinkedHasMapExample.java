package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class LinkedHasMapExample {

    public static void main(String[] args) {

        Map map = new LinkedHashMap<>();

        BinaryOperator operator = (s1, s2) -> null;

        map.put("John", "Teacher");
        map.merge("John", "Doctor", operator);
        map.merge("Jane", "Doctor", operator);
        System.out.println(map);


        // LinkedHashMap to maintain the order of candidate insertion
        Map<String, Integer> votes = new LinkedHashMap<>();

        // BinaryOperator to add votes
        BinaryOperator<Integer> addVotes = (currentVotes, newVotes) -> currentVotes + newVotes;

        // Simulating votes
        String[] votingBallots = {"Alice", "Bob", "Alice", "Bob", "Charlie", "Alice"};

        for (String vote : votingBallots) {
            // Merging vote counts into the map
            votes.merge(vote, 1, addVotes);
        }

        // Printing the vote counts
        System.out.println("Vote Counts:");
        votes.forEach((candidate, voteCount) -> System.out.println(candidate + ": " + voteCount));

    }




}
