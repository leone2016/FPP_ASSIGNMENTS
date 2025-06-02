package LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo;

public class CheckingAccount extends LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.Account {
	private final double MONTHLY_SERVICE_CHARGE = 5.00;

	public CheckingAccount(LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.Employee e, double startBalance){
		super(e,startBalance);
	}
	public CheckingAccount(LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.Employee e){
		super(e);
	}
	
	public void updateBalance() {
		double baseBalance = super.getBalance();
		setBalance(baseBalance - MONTHLY_SERVICE_CHARGE);
	}
	public LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.AccountType getAcctType(){
		return LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.AccountType.CHECKING;
	}

}
