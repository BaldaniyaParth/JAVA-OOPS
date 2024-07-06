# Employee Payroll System

## Description
The Employee Payroll System is a Java-based application designed to manage and calculate salaries for both full-time and part-time employees. The system supports the addition, removal, and display of employee details.

## Features
- **Full-Time Employee Management**: Supports calculation of monthly salary.
- **Part-Time Employee Management**: Supports calculation of salary based on hours worked and hourly rate.
- **Employee Management**: Add, remove, and display employee details.

## Classes and Methods
### `Employee`
Abstract class representing a general employee.
- **Fields**:
    - `name` (String): Name of the employee.
    - `id` (int): Unique identifier for the employee.
- **Methods**:
    - `getName()`: Returns the name of the employee.
    - `getId()`: Returns the ID of the employee.
    - `calculateSalary()`: Abstract method to be implemented by subclasses for salary calculation.
    - `toString()`: Returns a string representation of the employee.

### `FullTimeEmployee`
Subclass of `Employee` representing a full-time employee.
- **Fields**:
    - `monthlySalary` (double): Monthly salary of the employee.
- **Methods**:
    - `calculateSalary()`: Returns the monthly salary.

### `PartTimeEmployee`
Subclass of `Employee` representing a part-time employee.
- **Fields**:
    - `hoursWorked` (int): Number of hours worked by the employee.
    - `hourlyRate` (double): Hourly rate of pay.
- **Methods**:
    - `calculateSalary()`: Returns the salary based on hours worked and hourly rate.

### `PayrollSystem`
Class managing a list of employees.
- **Fields**:
    - `employeeList` (List<Employee>): List of employees.
- **Methods**:
    - `addEmployee(Employee employee)`: Adds an employee to the list.
    - `removeEmployee(int id)`: Removes an employee from the list by ID.
    - `displayEmployees()`: Displays details of all employees.

## Usage
```java
public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();

        FullTimeEmployee emp1 = new FullTimeEmployee("Parth Baldaniya", 101, 50000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Prince Baldaniya", 102, 50, 50.0);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Details:");
        payrollSystem.displayEmployees();

        System.out.println("\nRemoving Employee...");
        payrollSystem.removeEmployee(102);

        System.out.println("\nRemaining Employee Details:");
        payrollSystem.displayEmployees();
    }
}
```

### Author
- Parth Baldaniya