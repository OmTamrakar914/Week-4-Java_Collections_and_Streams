package set.test.checking.set.equal.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import set.checking.set.are.equal.CheckIfTwoSetsAreEqual;

import java.util.*;

class CheckIfTwoSetsAreEqualTest {

    @Test
    void testEqualSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        assertTrue(CheckIfTwoSetsAreEqual.checkEqual(set1, set2));
    }

    @Test
    void testDifferentSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6));

        assertFalse(CheckIfTwoSetsAreEqual.checkEqual(set1, set2));
    }

    @Test
    void testSubsetNotEqual() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        assertFalse(CheckIfTwoSetsAreEqual.checkEqual(set1, set2));
    }

    @Test
    void testEmptySets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        assertTrue(CheckIfTwoSetsAreEqual.checkEqual(set1, set2));
    }

    @Test
    void testOneEmptySet() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));

        assertFalse(CheckIfTwoSetsAreEqual.checkEqual(set1, set2));
    }
}
