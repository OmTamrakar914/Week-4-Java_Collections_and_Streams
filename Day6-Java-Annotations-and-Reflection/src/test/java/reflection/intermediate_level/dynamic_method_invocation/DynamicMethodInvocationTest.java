package reflection.intermediate_level.dynamic_method_invocation;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class DynamicMethodInvocationTest {

    @Test
    void testCallingSpecificMethod() throws Exception {
        // Given
        MathOperations mathOperations = new MathOperations();
        Class<?> cls = mathOperations.getClass();

        // Test Add method
        Method addMethod = cls.getMethod("add", int.class, int.class);
        int resultAdd = (int) addMethod.invoke(mathOperations, 5, 3);
        assertEquals(8, resultAdd, "Add method should return correct sum");

        // Test Subtract method
        Method subtractMethod = cls.getMethod("subtract", int.class, int.class);
        int resultSubtract = (int) subtractMethod.invoke(mathOperations, 5, 3);
        assertEquals(2, resultSubtract, "Subtract method should return correct difference");

        // Test Multiply method
        Method multiplyMethod = cls.getMethod("multiply", int.class, int.class);
        int resultMultiply = (int) multiplyMethod.invoke(mathOperations, 5, 3);
        assertEquals(15, resultMultiply, "Multiply method should return correct product");
    }
}
