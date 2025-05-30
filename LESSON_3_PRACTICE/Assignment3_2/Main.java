package Assignment3_2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        employees[0] = new Employee("Mohamed Amine", "Nickname", 12000, 2023, 5, 15);
        employees[1] = new Employee("Leo", "Medina", 12000, 2023, 5, 15);

        employees[0].createNewChecking(10500);
        employees[0].createNewSavings(1000);
        employees[0].createNewRetirement(9300);

        employees[1].createNewChecking(34000);
        employees[1].createNewSavings(27000);

        for (Employee emp : employees) {
            System.out.println(emp.getFormattedAcctInfo());
        }
    }
}