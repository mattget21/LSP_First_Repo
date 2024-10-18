package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

/**
 * A simple voting machine that tracks candidates and their votes.
 * Uses a HashMap to store candidate names and their vote counts.
 * 
 * @author Matthew Getachew
 * @version 1.0
 */
public class VotingMachine {
    private Map<String, Integer> candidates = new HashMap<>();

    /**
     * Adds a candidate to the voting machine.
     * If the candidate already exists, no action is taken.
     * 
     * @param name The name of the candidate to add.
     */
    public void addCandidate(String name) {
        candidates.putIfAbsent(name, 0);
    }

    /**
     * Casts a vote for the specified candidate.
     * If the candidate does not exist, no vote is cast.
     * 
     * @param name The name of the candidate to receive a vote.
     */
    public void castVote(String name) {
        candidates.put(name, candidates.getOrDefault(name, 0) + 1);
    }

    /**
     * Returns a string representation of all candidates and their vote counts.
     * 
     * @return A string listing each candidate and the number of votes they have received.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString().trim();
    }
}
