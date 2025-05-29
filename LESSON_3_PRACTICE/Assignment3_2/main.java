package Assignment3_2;

public class main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "Johnny", 50000, 2020, 5, 15);
        employee.setNickName("Leo");
        System.out.println("Name: " + employee.getNickName());

    }
}
