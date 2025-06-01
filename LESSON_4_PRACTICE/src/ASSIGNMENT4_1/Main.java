package ASSIGNMENT4_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jhon Doe", 2023, 5, 15, 2000);
        Professor professor2 = new Professor("Jim Doe", 2019, 5, 15, 3000);
        Professor professor3 = new Professor("Maharishi Doe", 1970, 5, 15, 4000);
        professor1.setNumberOfPublications(10);
        professor2.setNumberOfPublications(5);
        professor3.setNumberOfPublications(50);

        Secretary secretary1 = new Secretary("Diana Smith", 2018, 6, 30, 1000);
        Secretary secretary2 = new Secretary("Evelyn Sadra", 2011, 7, 9, 3000);

        DeptEmployee[] department  = new DeptEmployee[5];

        department[0] = professor1;
        department[1] = professor2;
        department[2] = professor3;
        department[3] = secretary1;
        department[4] = secretary2;

        secretary2.setOvertimeHours(200);
        secretary2.setOvertimeHours(200);
        Scanner sc = new Scanner(System.in);

        System.out.print("Do you want to see the sum of all salaries in the department? (Y/N): ");
        String input = sc.nextLine();

        if (input.equalsIgnoreCase("Y")) {
            double totalSalary = 0;
            for (DeptEmployee emp : department) {
                totalSalary += emp.computeSalary();
            }
            System.out.println("Total salary of all department employees: $ " + totalSalary);
        } else {
            System.out.println("You chose not to display salaries.");
        }

    }
}
