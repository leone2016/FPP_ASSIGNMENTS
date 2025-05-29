package Assignment3_1;

public class Main {

    /**
     * Create a class Main having a main method that does the following:
     * a. It creates a new Employee object employee (you can invent your own name,
     * hireday, salary, etc., to be used in the constructor)
     * b. Then it creates a checking account, savings account and retirement account for
     * employee, each with a starting balance of $300.
     * c. Then it prints to the console the account data for each of these accounts (making
     * use of the toString() method that has been provided in Account)
     * @param args
     */
    public static void main(String[] args) {

        Employee employee = new Employee("Leonel Messi", "GOAT", 500000, 2023, 5, 15);
        System.out.println("Employee: " + employee);

        // Create accounts for the employee
        Account checkingAccount = new Account(employee, AccountType.CHECKING.toString(), 300);
        Account savingsAccount = new Account(employee, AccountType.SAVINGS.toString(), 300);
        Account retirementAccount = new Account(employee, AccountType.RETIREMENT.toString(), 300);

        // Print account details
        System.out.println("Checking Account: " + checkingAccount);
        System.out.println("Savings Account: " + savingsAccount);
        System.out.println("Retirement Account: " + retirementAccount);
    }
}
