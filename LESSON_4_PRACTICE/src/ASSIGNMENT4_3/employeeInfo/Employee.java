package ASSIGNMENT4_3.employeeInfo;

import ASSIGNMENT4_3.MyStringList;
import ASSIGNMENT4_3.Util;

import java.time.LocalDate;

public class Employee {
    // instance fields
    private AccountList accounts;
    private String name;
    private LocalDate hireDay;
    private String format = "name = %s, salary = %.2f, hireDay = %s";

    // constructor
    public Employee(String name, int aYear, int aMonth, int aDay) {
        this.name = name;
        hireDay = LocalDate.of(aYear, aMonth, aDay);
        accounts =  new AccountList();

    }

    // instance methods
    public String getName() {
        return name;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void createNewChecking(double startAmount) {
        accounts.add(new CheckingAccount(this, startAmount));

    }

    public void createNewSavings(double startAmount) {
        accounts.add(new SavingsAccount(this, startAmount));

    }

    public void createNewRetirement(double startAmount) {
        accounts.add(new RetirementAccount(this, startAmount));
    }

    public void deposit(int acctIndex, double amt){
        Account selected = accounts.get(acctIndex);
        selected.makeDeposit(amt);
    }
    public boolean withdraw(int acctIndex, double amt){
        Account selected = accounts.get(acctIndex);
        return selected.makeWithdrawal(amt);
    }

    public String getFormattedAcctInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n\nACCOUNT INFO FOR %s:\n", name));
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            sb.append(String.format("Account type: %s\nCurrent bal: %.2f\n",
                    acc.getAcctType().toString().toLowerCase(),
                    acc.getBalance()));
        }
        return sb.toString();
    }

    public String toString() {
        return String.format(format, name, Util.dateAsString(hireDay));
    }

    public MyStringList getNamesOfAccounts() {
        MyStringList list = new MyStringList();
        for (int i = 0; i < accounts.size(); i++) {
            list.add(accounts.get(i).getAcctType().toString().toLowerCase());
        }
        return list;
    }

}