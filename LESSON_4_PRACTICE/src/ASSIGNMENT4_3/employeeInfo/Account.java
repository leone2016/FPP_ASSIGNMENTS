package ASSIGNMENT4_3.employeeInfo;

public abstract class Account {
    private final static double DEFAULT_BALANCE = 0.0;

    private double balance;
    final private Employee employee;

    Account(Employee emp, double balance) {
        employee = emp;
        this.balance = balance;
    }

    public abstract AccountType getAcctType();

    public String toString() {
        return "Account type: " + getAcctType().toString().toLowerCase() + "\n" +
                "Current bal:  " + getBalance();
    }

    public void makeDeposit(double deposit) {
        if (deposit < 0) {
            throw new IllegalArgumentException("Deposit amount must be non-negative");
        }
        balance += deposit;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public boolean makeWithdrawal(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }


    public double getBalance() {
        return balance;
    }
}
