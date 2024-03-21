public class TestEmployee {
    public static void main(String[] args) {

        Employee employee = new Employee("John Doe", 30, 50000.0);

        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());

        employee.setName("Jane Doe");
        employee.setAge(35);
        employee.setSalary(60000.0);

        System.out.println("\nUpdated Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
    }
}
