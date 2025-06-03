package LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo;

public class SavingsAccount extends LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.Account {
	private final double MONTHLY_INTEREST_RATE = 0.25;
	public SavingsAccount(LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.Employee e, double startBalance){
		super(e,startBalance);
	}
	public SavingsAccount(LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.Employee e){
		super(e);
	}
	
	public void updateBalance() {
		double baseBalance = super.getBalance();
		double interest = (MONTHLY_INTEREST_RATE/100) * baseBalance;
		setBalance(baseBalance + interest);
	}
	public LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.AccountType getAcctType(){
		return LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.AccountType.SAVINGS;
	}

}
