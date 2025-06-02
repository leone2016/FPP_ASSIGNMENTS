package ASSIGNMENT4_7.employeeinfo;

public class CheckingAccount extends ASSIGNMENT4_7.employeeinfo.Account {
	private final double MONTHLY_SERVICE_CHARGE = 5.00;

	public CheckingAccount(ASSIGNMENT4_7.employeeinfo.Employee e, double startBalance){
		super(e,startBalance);
	}
	public CheckingAccount(ASSIGNMENT4_7.employeeinfo.Employee e){
		super(e);
	}
	
	public void updateBalance() {
		double baseBalance = super.getBalance();
		setBalance(baseBalance - MONTHLY_SERVICE_CHARGE);
	}
	public ASSIGNMENT4_7.employeeinfo.AccountType getAcctType(){
		return ASSIGNMENT4_7.employeeinfo.AccountType.CHECKING;
	}

}
