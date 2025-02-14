package map.test.voting.system.test;

import static org.junit.jupiter.api.Assertions.*;

import map.voting.system.VotingSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

class VotingSystemTest {
    private VotingSystem votingSystem;

    @BeforeEach
    void setUp() {
        votingSystem = new VotingSystem();
    }

    @Test
    void testCastVote() {
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        Map<String, Integer> expectedVotes = new HashMap<>();
        expectedVotes.put("Alice", 2);
        expectedVotes.put("Bob", 1);

        assertEquals(expectedVotes, votingSystem.getVoteMap());
    }

    @Test
    void testCastVoteWithMultipleCandidates() {
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");

        Map<String, Integer> expectedVotes = new HashMap<>();
        expectedVotes.put("Alice", 2);
        expectedVotes.put("Bob", 1);
        expectedVotes.put("Charlie", 2);

        assertEquals(expectedVotes, votingSystem.getVoteMap());
    }

    @Test
    void testWinnerDetermination() {
        votingSystem.castVote("Alice");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");

        assertEquals("Alice", votingSystem.getWinner());
    }

    @Test
    void testWinnerWithTie() {
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");


        List<String> possibleWinners = Arrays.asList("Alice", "Bob");
        assertTrue(possibleWinners.contains(votingSystem.getWinner()));
    }


}

