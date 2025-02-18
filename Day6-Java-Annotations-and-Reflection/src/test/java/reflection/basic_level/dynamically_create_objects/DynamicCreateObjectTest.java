package reflection.basic_level.dynamically_create_objects;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.*;

class DynamicCreateObjectTest {

    @Test
    void testDynamicObjectCreation() throws Exception {
        String classPath = "reflection.basic_level.dynamically_create_objects.Student";
        Class<?> cls = Class.forName(classPath);

        // Get the constructor with parameters (String, int)
        Constructor<?> constructor = cls.getConstructor(String.class, int.class);

        // Create instance dynamically
        Object studentObject = constructor.newInstance("Anush", 20);

        // Verify the created object's class
        assertNotNull(studentObject);
        assertEquals(cls, studentObject.getClass());

        // Verify fields using reflection
//        assertEquals("Anush", cls.getDeclaredField("name").get(studentObject));
//        assertEquals(20, cls.getDeclaredField("age").get(studentObject));
    }
}
