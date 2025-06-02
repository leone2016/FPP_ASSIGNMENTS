package ASSIGNMENT4_3.employeeInfo;

public class CheckingAccount extends Account {
    private static final double SERVICE_CHARGE = 5;

    public CheckingAccount(Employee emp, double balance) {
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
        return super.getBalance() - SERVICE_CHARGE;
    }

    @Override
    public AccountType getAcctType() {
        return AccountType.CHECKING;
    }

}
