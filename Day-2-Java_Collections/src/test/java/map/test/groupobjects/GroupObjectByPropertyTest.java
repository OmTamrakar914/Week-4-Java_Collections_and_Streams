package map.test.group.object.test;

import static org.junit.jupiter.api.Assertions.*;

import map.groupobjects.Employee;
import map.groupobjects.GroupObjectByProperty;
import org.junit.jupiter.api.Test;
import java.util.*;

class GroupObjectByPropertyTest {

    @Test
    void testGroupObjectsWithMultipleDepartments() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR"),
                new Employee("David", "Finance")
        );

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("HR", Arrays.asList("Alice", "Carol"));
        expected.put("IT", Arrays.asList("Bob"));
        expected.put("Finance", Arrays.asList("David"));

        assertEquals(expected, GroupObjectByProperty.groupObjects(employees));
    }

    @Test
    void testGroupObjectsWithSingleDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Eve", "Marketing"),
                new Employee("Frank", "Marketing"),
                new Employee("Grace", "Marketing")
        );

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("Marketing", Arrays.asList("Eve", "Frank", "Grace"));

        assertEquals(expected, new GroupObjectByProperty().groupObjects(employees));
    }

    @Test
    void testGroupObjectsWithEmptyList() {
        List<Employee> employees = new ArrayList<>();
        Map<String, List<String>> expected = new HashMap<>();

        assertEquals(expected, new GroupObjectByProperty().groupObjects(employees));
    }

    @Test
    void testGroupObjectsWithUniqueDepartments() {
        List<Employee> employees = Arrays.asList(
                new Employee("Henry", "Sales"),
                new Employee("Ivy", "HR"),
                new Employee("Jack", "IT")
        );

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("Sales", Arrays.asList("Henry"));
        expected.put("HR", Arrays.asList("Ivy"));
        expected.put("IT", Arrays.asList("Jack"));

        assertEquals(expected, new GroupObjectByProperty().groupObjects(employees));
    }

    @Test
    void testGroupObjectsWithSingleEmployee() {
        List<Employee> employees = Arrays.asList(new Employee("Zara", "Admin"));
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("Admin", Arrays.asList("Zara"));

        assertEquals(expected, new GroupObjectByProperty().groupObjects(employees));
    }
}
