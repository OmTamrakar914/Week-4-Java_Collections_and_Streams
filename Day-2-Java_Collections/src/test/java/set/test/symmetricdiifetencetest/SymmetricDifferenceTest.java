package set.test.symmetric.difference.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import set.symmetricdiiference.SymmetricDifference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class SymmetricDifferenceTest {

    @Test
    void testSymmetricDifference() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 4, 5));
        assertEquals(expected, SymmetricDifference.symmetricSet(set1, set2));
    }

    @Test
    void testSymmetricDifferenceWithEmptySet() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>();

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3));
        assertEquals(expected, SymmetricDifference.symmetricSet(set1, set2));
    }

    @Test
    void testSymmetricDifferenceWithIdenticalSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));

        Set<Integer> expected = new HashSet<>();
        assertEquals(expected, SymmetricDifference.symmetricSet(set1, set2));
    }

    @Test
    void testSymmetricDifferenceWithDisjointSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6));

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(expected, SymmetricDifference.symmetricSet(set1, set2));
    }
}

