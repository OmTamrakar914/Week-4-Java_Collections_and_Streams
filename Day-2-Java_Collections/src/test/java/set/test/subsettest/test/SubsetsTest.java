package set.test.subset.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import set.subsets.FindSubsets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class FindSubsetsTest {

    @Test
    void testSubsetTrue() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        assertTrue(FindSubsets.checkSubset(set1, set2));
    }

    @Test
    void testSubsetFalse() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(5, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        assertFalse(FindSubsets.checkSubset(set1, set2));
    }

    @Test
    void testEmptySetIsSubset() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        assertTrue(FindSubsets.checkSubset(set1, set2));
    }

    @Test
    void testSameSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        assertTrue(FindSubsets.checkSubset(set1, set2));
    }

    @Test
    void testLargerSetAsSubset() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        assertFalse(FindSubsets.checkSubset(set1, set2));
    }
}

