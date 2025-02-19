package annotation.exercise.exercise4;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {

    @Test
    void testTaskInfoAnnotationPresenceAndValues() throws NoSuchMethodException {

        TaskManager task = new TaskManager();
        Method method = task.getClass().getMethod("completedTask");

        assertTrue(method.isAnnotationPresent(TaskInfo.class), "TaskInfo annotation should be present");

        TaskInfo annotation = method.getAnnotation(TaskInfo.class);

        assertEquals("High", annotation.priority(), "Priority should be 'High'");
        assertEquals("Om Tamrakar", annotation.assignedTO(), "AssignedTo should be 'Om Tamrakar'");
    }
}
