package Assignment3_2;

import java.time.LocalDate;

import static Assignment3_2.AccountType.CHECKING;

public class Employee {

    // instance fields
    private String name;
    private String nickName;
    private double salary;
    private LocalDate hireDay;

    private Account checkingAcct;
    private Account savingsAcct;
    private Account retirementAcct;

    // constructor
    Employee(String name, String aNickName, double aSalary, int aYear, int aMonth, int aDay) {
        this.name = name;
        nickName = aNickName;
        salary = aSalary;
        //GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
        hireDay = LocalDate.of(aYear, aMonth, aDay);
    }

    // instance methods
    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String aNickName) {
        nickName = aNickName;
    }

    public double getSalary() {
        return salary;
    }

    // needs to be improved
    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public void createNewChecking(double startAmount) {
        checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
    }

    public void createNewSavings(double startAmount) {
        savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
    }

    public void createNewRetirement(double startAmount) {
        retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
    }


    public void deposit(AccountType acctType, double amt) {
        switch (acctType) {
            case CHECKING -> checkingAcct.makeDeposit(amt);
            case SAVINGS -> savingsAcct.makeDeposit(amt);
            case RETIREMENT -> retirementAcct.makeDeposit(amt);
        }
    }

    public boolean withdraw(AccountType acctType, double amt) {
        return switch (acctType) {
            case CHECKING -> checkingAcct.makeWithdrawal(amt);
            case SAVINGS -> savingsAcct.makeWithdrawal(amt);
            case RETIREMENT -> retirementAcct.makeWithdrawal(amt);
        };
    }

    public String getFormattedAcctInfo() {
        StringBuilder sb = new StringBuilder("ACCOUNT INFO FOR " + name + ":\n\n");
        if (checkingAcct != null) sb.append(checkingAcct).append("\n");
        if (savingsAcct != null) sb.append(savingsAcct).append("\n");
        if (retirementAcct != null) sb.append(retirementAcct).append("\n");
        return sb.toString();
    }

    private String format = "name = %s, salary = %.2f, hireDay = %s";

    public String toString() {
        return String.format(format, name, salary, Util.dateAsString(hireDay));
    }
}
