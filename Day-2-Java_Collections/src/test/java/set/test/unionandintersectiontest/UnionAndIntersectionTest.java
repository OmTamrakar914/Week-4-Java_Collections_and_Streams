package set.test.union.intersection.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import set.union.and.intersection.UnionAndIntersectionOfTwoSets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class UnionAndIntersectionOfTwoSetsTest {

    @Test
    void testUnionSet() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9, 2, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 5, 4, 10, 12, 4, 18));

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9, 2, 4, 10, 12, 18));
        assertEquals(expected, UnionAndIntersectionOfTwoSets.unionSet(set1, set2));
    }

    @Test
    void testIntersectionSet() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9, 2, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 5, 4, 10, 12, 4, 18));

        Set<Integer> expected = new HashSet<>(Arrays.asList(3, 5, 4));
        assertEquals(expected, UnionAndIntersectionOfTwoSets.intersectionSet(set1, set2));
    }

    @Test
    void testUnionWithEmptySet() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>();

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3));
        assertEquals(expected, UnionAndIntersectionOfTwoSets.unionSet(set1, set2));
    }

    @Test
    void testIntersectionWithEmptySet() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>();

        Set<Integer> expected = new HashSet<>();
        assertEquals(expected, UnionAndIntersectionOfTwoSets.intersectionSet(set1, set2));
    }

    @Test
    void testUnionWithIdenticalSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expected, UnionAndIntersectionOfTwoSets.unionSet(set1, set2));
    }

    @Test
    void testIntersectionWithIdenticalSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expected, UnionAndIntersectionOfTwoSets.intersectionSet(set1, set2));
    }
}
