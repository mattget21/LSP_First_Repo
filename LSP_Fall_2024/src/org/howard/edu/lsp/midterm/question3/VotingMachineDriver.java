package org.howard.edu.lsp.midterm.question3;

/**
 * Driver class to test the VotingMachine functionality.
 * Demonstrates adding candidates, casting votes, and printing results.
 * 
 * @author Matthew Getachew
 * @version 1.0
 */
public class VotingMachineDriver {
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");
        vm.castVote("Hogan");
        vm.castVote("Hogan");
        System.out.println(vm.toString()); 
        // Output example:
        // Alsobrooks: 1 votes
        // Hogan: 2 votes
    }
}
