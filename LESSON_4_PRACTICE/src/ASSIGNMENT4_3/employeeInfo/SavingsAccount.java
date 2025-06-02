package ASSIGNMENT4_3.employeeInfo;

public class SavingsAccount extends Account {
    private static final double SavingInterest = 0.0025;

    public SavingsAccount(Employee emp, double balance) {
        super(emp, balance);
    }

    @Override
    public void makeDeposit(double deposit) {
        super.makeDeposit(deposit);
    }

    @Override
    public boolean makeWithdrawal(double amount) {
        return super.makeWithdrawal(amount);
    }

    @Override
    public double getBalance() {
        double success = super.getBalance();
        return success + success * SavingInterest;
    }

    @Override
    public AccountType getAcctType() {
        return AccountType.SAVINGS;
    }


}
