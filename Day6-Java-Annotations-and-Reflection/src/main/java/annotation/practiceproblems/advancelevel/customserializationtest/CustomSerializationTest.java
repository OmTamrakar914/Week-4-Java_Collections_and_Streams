package annotation.practiceproblems.advanceleveltest.customserializationtest;
import annotation.practiceproblems.advancelevel.customserializationannotation.JsonSerializer;
import annotation.practiceproblems.advancelevel.customserializationannotation.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomSerializationTest {
    @Test
    void testJsonSerialization() throws IllegalAccessException {
        User user1 = new User("JohnDoe", 20,"john@example.com");
        String expectedJson = "{\"user_email\":\"john@example.com\",\"user_name\":\"JohnDoe\",\"user_age\":\"20\"}";
        assertEquals(expectedJson, JsonSerializer.serialize(user1));
    }

    @Test
    void testEmptyUserSerialization() throws IllegalAccessException {
        User user2 = new User("","");
        String expectedJson = "{\"user_email\":\"\",\"user_name\":\"\",\"user_age\":\"\"}";
        assertEquals(expectedJson, JsonSerializer.serialize(user2));
    }
}
