package map.voting.system;

import java.util.*;

public class VotingSystem {
    private Map<String, Integer> voteMap = new HashMap<>();
    private Map<String, Integer> voteOrderMap = new LinkedHashMap<>();
    private TreeMap<String, Integer> sortedVoteMap = new TreeMap<>();

    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteOrderMap.put(candidate, voteOrderMap.getOrDefault(candidate, 0) + 1);
        sortedVoteMap.put(candidate, sortedVoteMap.getOrDefault(candidate, 0) + 1);
    }

    public void displayVotes() {
        System.out.println("Votes (HashMap): " + voteMap);
        System.out.println("Votes (LinkedHashMap - Order of Voting): " + voteOrderMap);
        System.out.println("Votes (TreeMap - Sorted Order): " + sortedVoteMap);
    }

    public void displayWinner() {
        String winner = Collections.max(voteMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Winner: " + winner + " with " + voteMap.get(winner) + " votes.");
    }

    public Map<String, Integer> getVoteMap() {
        return voteMap;
    }

    public String getWinner() {

        String winner =  Collections.max(voteMap.entrySet(), Map.Entry.comparingByValue()).getKey();
     return winner;
    }
}
