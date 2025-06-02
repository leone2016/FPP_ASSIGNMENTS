package ASSIGNMENT4_7.employeeinfo;

public class SavingsAccount extends ASSIGNMENT4_7.employeeinfo.Account {
	private final double MONTHLY_INTEREST_RATE = 0.25;
	public SavingsAccount(ASSIGNMENT4_7.employeeinfo.Employee e, double startBalance){
		super(e,startBalance);
	}
	public SavingsAccount(ASSIGNMENT4_7.employeeinfo.Employee e){
		super(e);
	}
	
	public void updateBalance() {
		double baseBalance = super.getBalance();
		double interest = (MONTHLY_INTEREST_RATE/100) * baseBalance;
		setBalance(baseBalance + interest);
	}
	public ASSIGNMENT4_7.employeeinfo.AccountType getAcctType(){
		return ASSIGNMENT4_7.employeeinfo.AccountType.SAVINGS;
	}

}
