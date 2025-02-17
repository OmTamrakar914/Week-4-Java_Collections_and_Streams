package junit.basic_junit_test.task;

public class Task {
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "Task Completed";
    }
}
