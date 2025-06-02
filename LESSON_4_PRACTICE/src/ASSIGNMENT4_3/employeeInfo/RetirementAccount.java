package ASSIGNMENT4_3.employeeInfo;

public class RetirementAccount extends Account {
    private static final double PENALTY = 0.02;

    public RetirementAccount(Employee employee, double balance) {
        super(employee, balance);
    }


    @Override
    public void makeDeposit(double deposit) {
        super.makeDeposit(deposit);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public AccountType getAcctType() {
        return AccountType.RETIREMENT;
    }

    @Override
    public boolean makeWithdrawal(double amount) {
        boolean success = super.makeWithdrawal(amount);
        if (success) {
            super.makeWithdrawal(amount * PENALTY);
        }
        return true;
    }

}
