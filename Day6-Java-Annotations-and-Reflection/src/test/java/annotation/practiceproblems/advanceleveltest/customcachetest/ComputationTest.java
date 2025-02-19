package annotation.practiceproblems.advanceleveltest.customcachetest;
import annotation.practiceproblems.advancelevel.customcacheingsystem.Computation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputationTest {
     Computation compute = new Computation();

    @Test
    void testFactorialComputation() {
        assertEquals(120, compute.computeFactorial(5));
    }

    @Test
    void testCachedFactorial() {
        compute.computeFactorial(5);
        assertEquals(120, compute.computeFactorial(5));
    }
}
