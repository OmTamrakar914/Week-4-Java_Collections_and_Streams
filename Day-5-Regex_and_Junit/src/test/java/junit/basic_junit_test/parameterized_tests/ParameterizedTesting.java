package junit.basic_junit_test.parameterized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTesting {

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,7,9})
    void testcase(int number){
        boolean expected = (number % 2 == 0); // True for even, false for odd
        assertEquals(expected, ParameterizedTests.isEven(number));
    }
}
