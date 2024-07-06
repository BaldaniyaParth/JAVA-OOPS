package in.parth.challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Parth", 21, 25000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Parthu");
        System.out.println(emp.getEmployeeDetails());
    }
}
