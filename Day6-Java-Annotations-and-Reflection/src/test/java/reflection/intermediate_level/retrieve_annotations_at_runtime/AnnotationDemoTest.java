package reflection.intermediate_level.retrieve_annotations_at_runtime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnnotationDemoTest {

    @Test
    void testRetrieveAnnotationAtRuntime() {
        // Given
        Class<MyClass> obj = MyClass.class;

        // When
        Author annotation = obj.getAnnotation(Author.class);

        // Then
        assertNotNull(annotation, "The @Author annotation should be present.");
        assertEquals("John Doe", annotation.name(), "The @Author annotation's name should be 'John Doe'.");
    }
}
