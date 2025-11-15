import java.util.*;

class EmployeeManager {
    List<String> employees = new ArrayList<>();
    Set<String> departments = new HashSet<>();
    Map<String, String> empDeptMap = new HashMap<>();

    void addEmployee(String name, String dept) {
        employees.add(name);
        departments.add(dept);
        empDeptMap.put(name, dept);
    }

    void displayEmployees() {
        System.out.println("Employees (Join Order): " + employees);
    }

    void displayDepartments() {
        System.out.println("Departments: " + departments);
    }

    void searchEmployee(String name) {
        if (empDeptMap.containsKey(name))
            System.out.println(name + " works in " + empDeptMap.get(name));
        else
            System.out.println("Employee Not Found!");
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeManager em = new EmployeeManager();

        em.addEmployee("Ravi", "HR");
        em.addEmployee("Kiran", "IT");
        em.addEmployee("Sneha", "Finance");

        em.displayEmployees();
        em.displayDepartments();

        em.searchEmployee("Kiran");
        em.searchEmployee("Rahul");
    }
}
