package ASSIGNMENT4_3;

import ASSIGNMENT4_3.employeeInfo.Employee;
import java.util.Scanner;

public class Main {
    static Employee[] emps = new Employee[3];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initializeEmployees();
        System.out.println("A. See a report of all accounts.\nB. Make a deposit.\nC. Make a withdrawal.");
        System.out.print("Make a selection (A/B/C): ");
        String choice = sc.nextLine().trim().toUpperCase();

        if (choice.equals("A")) {
            System.out.println(getFormattedAccountInfo());
        } else if (choice.equals("B")) {
            makeDeposit();
        } else if (choice.equals("C")) {
            makeWithdrawal();
        } else {
            System.out.println("Invalid choice.");
        }
    }

    static void initializeEmployees() {
        emps[0] = new Employee("Jim Daley", 2000, 9, 4);
        emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
        emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

        emps[0].createNewChecking(10500);
        emps[0].createNewSavings(1000);
        emps[0].createNewRetirement(9300);

        emps[1].createNewChecking(34000);
        emps[1].createNewSavings(27000);

        emps[2].createNewChecking(10038);
        emps[2].createNewSavings(12600);
        emps[2].createNewRetirement(9000);
    }

    static String getFormattedAccountInfo() {
        StringBuilder sb = new StringBuilder();
        for (Employee emp : emps) {
            sb.append(emp.getFormattedAcctInfo());
        }
        return sb.toString();
    }

    static void makeDeposit() {
        showEmployees();
        System.out.print("Select an employee: ");
        int empIndex = sc.nextInt();
        sc.nextLine(); // clear

        showAccounts(empIndex);
        System.out.print("Select an account: ");
        int accIndex = sc.nextInt();
        sc.nextLine(); // clear

        System.out.print("Deposit amount: ");
        double amount = sc.nextDouble();
        sc.nextLine(); // clear

        emps[empIndex].deposit(accIndex, amount);
        System.out.printf("$%.2f has been deposited in the %s account of %s.\n",
                amount,
                emps[empIndex].getNamesOfAccounts().get(accIndex),
                emps[empIndex].getName());
    }

    static void makeWithdrawal() {
        showEmployees();
        System.out.print("Select an employee: ");
        int empIndex = sc.nextInt();
        sc.nextLine(); // clear

        showAccounts(empIndex);
        System.out.print("Select an account: ");
        int accIndex = sc.nextInt();
        sc.nextLine(); // clear

        System.out.print("Withdrawal amount: ");
        double amount = sc.nextDouble();
        sc.nextLine(); // clear

        boolean success = emps[empIndex].withdraw(accIndex, amount);
        if (success) {
            System.out.printf("$%.2f has been withdrawn from the %s account of %s.\n",
                    amount,
                    emps[empIndex].getNamesOfAccounts().get(accIndex),
                    emps[empIndex].getName());
        } else {
            System.out.println("Withdrawal failed. Not enough balance.");
        }
    }

    static void showEmployees() {
        for (int i = 0; i < emps.length; i++) {
            System.out.println(i + ". " + emps[i].getName());
        }

    }

    static void showAccounts(int empIndex) {
        MyStringList accountNames = emps[empIndex].getNamesOfAccounts();
        for (int i = 0; i < accountNames.size(); i++) {
            System.out.println(i + ". " + accountNames.get(i));
        }
    }
}
