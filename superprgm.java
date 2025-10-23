import java.util.Scanner;

// Employee class
class Employee {
  private String name;

  private double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  // Getter methods for name and salary
  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }
}

// Manager class (subclass of Employee)
class Manager extends Employee {
  private String department;

  public Manager(String name, double salary, String department) {
    super(name, salary); // Call the constructor of the Employee class to
    // initialize name and salary
              // attributes
    this.department = department;
  }

  // Getter method for department
  public String getDepartment() {
    return department;
  }
}

public class superprgm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name and salary of employee");
    String name = sc.next();
    double sal = sc.nextDouble();
    Employee emp = new Employee(name, sal);
    System.out.println("Employee Name: " + emp.getName());
    System.out.println("Employee Salary: " + emp.getSalary());
    Manager manager = new Manager(name, sal, "Marketing");
    System.out.println("Manager Name: " + manager.getName());
    System.out.println("Manager Salary: " + manager.getSalary());
    System.out.println("Manager Department: " + manager.getDepartment());

    sc.close();
  }
}