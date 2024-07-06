package in.parth.challenge114;

import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Parth", 100),
                new Employee("Prince", 1000),
                new Employee("Ram", 10000),
                new Employee("Shyam", 1),
                new Employee("Mohan", 5)
                );

        employees.stream()
                .sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);
    }
}
