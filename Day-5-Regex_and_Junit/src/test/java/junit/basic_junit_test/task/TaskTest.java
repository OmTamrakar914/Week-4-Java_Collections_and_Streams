package junit.basic_junit_test.task;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Fails if execution exceeds 2 seconds
    void testLongRunningTask() throws InterruptedException {
        Task task = new Task();
        assertEquals("Task Completed", task.longRunningTask());
    }

}
