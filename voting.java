import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Map to store candidate names and their corresponding vote counts
        Map<String, Integer> candidateVotes = new HashMap<>();
        
        // Add candidates to the map
        candidateVotes.put("Candidate 1", 0);
        candidateVotes.put("Candidate 2", 0);
        candidateVotes.put("Candidate 3", 0);
        
        System.out.println("Welcome to the voting system!");
        
        while (true) {
            System.out.println("Choose a candidate to vote for (or type 'done' to finish voting):");
            String candidate = scanner.nextLine();
            
            // Check if the user wants to finish voting
            if (candidate.equalsIgnoreCase("done")) {
                break;
            }
            
            // Check if the candidate is valid
            if (!candidateVotes.containsKey(candidate)) {
                System.out.println("Invalid candidate. Please choose a valid candidate.");
                continue;
            }
            
            // Increment the vote count for the chosen candidate
            candidateVotes.put(candidate, candidateVotes.get(candidate) + 1);
            
            System.out.println("Your vote for " + candidate + " has been recorded.");
        }
        
        // Display the final voting results
        System.out.println("\nVoting Results:");
        for (Map.Entry<String, Integer> entry : candidateVotes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
        
        // Determine the winner
        int maxVotes = 0;
        String winner = "";
        for (Map.Entry<String, Integer> entry : candidateVotes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }
        
        System.out.println("\nThe winner is: " + winner);
        
        scanner.close();
    }
}
