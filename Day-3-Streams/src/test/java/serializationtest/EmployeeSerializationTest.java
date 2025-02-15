package serializationtest;

import org.junit.jupiter.api.Test;
import serialization.Employee;
import serialization.EmployeeSerialization;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeSerializationTest {

    @Test
    public void testFileCreatedAfterSave() {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 50000),
                new Employee(2, "Bob", "IT", 60000)
        );
        EmployeeSerialization.saveEmployees(employees);
        File file = new File("employees.dat");
        assertTrue(file.exists()); // Check if file is created
    }

    @Test
    public void testEmployeeDataIntegrity() {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 50000),
                new Employee(2, "Bob", "IT", 60000)
        );
        EmployeeSerialization.saveEmployees(employees);
        List<Employee> loadedEmployees = EmployeeSerialization.loadEmployees();
        assertEquals(employees.size(), loadedEmployees.size()); // Check if size matches
        assertEquals(employees.get(0).name, loadedEmployees.get(0).name); // Check first employee
        assertEquals(employees.get(1).department, loadedEmployees.get(1).department); // Check second employee
    }
}
