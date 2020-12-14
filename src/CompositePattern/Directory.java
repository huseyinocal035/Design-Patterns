package CompositePattern;

import java.util.ArrayList;
import java.util.List;

// Composite
public class Directory implements Employee {

    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public void displayEmployeeDetails() {
        for (Employee employee : employeeList) {
            employee.displayEmployeeDetails();
        }
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

}
