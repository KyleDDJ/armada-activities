import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    String name;
    int employeeID;
    double salary;
    String department;

    public Employee () {
        name = "Unknown";
        employeeID = 0;
        salary = 0.0;
        department = "Not assigned";
    }

    public Employee (String name, int employeeID, double salary, String department) {
        this.name =  name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.department = department;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeID);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
    }

    double calculateAnnualSalary() {
        return salary * 12;
    }

    public void raiseSalary(double percentage) {
        salary += salary * (percentage / 100);
        System.out.printf("Salary updated successfully! New salary: $%.2f\n", salary);
    }
}
public class EmployeePayrollManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        int choice;

        while (true) {
            System.out.println("\nWelcome to the Employee Payroll Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employess");
            System.out.println("3. Calculate Annual Salary");
            System.out.println("4. Give Salary Raise");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter employee ID: ");
                    int employeeID = scanner.nextInt();
                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter department: ");
                    String department = scanner.nextLine();

                    employees.add(new Employee(name, employeeID, salary, department));
                    System.out.println("Employee added successfully!");
                    break;
    
                case 2:
                if (employees.isEmpty() ) {
                    System.out.println("No employees found.");
                } else {
                    System.out.println("--- Employee Records ---");
                    for (Employee employee : employees) {
                        employee.displayInfo();
                        System.out.println("");
                    }
                }
                break;
    
                case 3:
                System.out.print("Enter employee ID to calculate salary: ");
                employeeID = scanner.nextInt();
                boolean found = false;
    
                for (Employee employee : employees) {
                    if (employee.employeeID == employeeID) {
                        System.out.printf("Annual salary of %s: $%.2f\n", employee.name, employee.calculateAnnualSalary());
                        found = true;
                        break;
                    }
                }
                
                if(!found) {
                    System.out.println("Employee not found");
                }
                break;
    
                case 4:
                System.out.print("Enter employee ID to raise salary: ");
                employeeID = scanner.nextInt();
                found = false;
    
                for (Employee employee : employees) {
                    if (employee.employeeID == employeeID) {
                        System.out.print("Enter percentage increase: ");
                        double percentage = scanner.nextDouble();
                        employee.raiseSalary(percentage);
                        found = true;
                        break;
                    }
                }
    
                if (!found) {
                    System.out.println("Employee not found.");
                }
                break;
    
                case 5:
                System.out.println("Exiting program...");
                return;
    
                default: 
                System.out.println("Invalid choice. Please try again");
            }
        }
    }
}