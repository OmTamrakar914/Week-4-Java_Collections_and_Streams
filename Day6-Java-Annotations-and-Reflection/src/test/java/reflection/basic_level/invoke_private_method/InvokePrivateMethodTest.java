package reflection.basic_level.invoke_private_method;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class InvokePrivateMethodTest {

    @Test
    void testInvokePrivateMethod() throws Exception {
        // Given
        Calculator calculator = new Calculator();
        Class<?> cls = calculator.getClass();

        // Retrieve the private method "multiply"
        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);

        // Invoke method with parameters (5, 2)
        int result = (int) method.invoke(calculator, 5, 2);

        // Verify the output
        assertEquals(10, result, "The private method should return correct multiplication result");
    }
}
