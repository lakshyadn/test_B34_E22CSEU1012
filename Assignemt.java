import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Employee {
    private String empId;
    private String name;
    private int age;
    private int salary;

    public Employee(String empId, String name, int age, int salary) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return empId + " " + name + " " + age + " " + salary;
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("161E90", "Raman", 41, 56000));
        employees.add(new Employee("161F91", "Himadri", 38, 67500));
        employees.add(new Employee("161F99", "Jaya", 51, 82100));
        employees.add(new Employee("171E20", "Tejas", 30, 55000));
        employees.add(new Employee("171G30", "Ajay", 45, 44000));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sort Employee Table:");
        System.out.println("1. Sort by Age");
        System.out.println("2. Sort by Name");
        System.out.println("3. Sort by Salary");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                employees.sort(Comparator.comparingInt(Employee::getAge));
                break;
            case 2:
                employees.sort(Comparator.comparing(Employee::getName));
                break;
            case 3:
                employees.sort(Comparator.comparingInt(Employee::getSalary));
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("\nSorted Employee Table:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
