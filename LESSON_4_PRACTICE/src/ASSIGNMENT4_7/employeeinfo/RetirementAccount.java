package ASSIGNMENT4_7.employeeinfo;

public class RetirementAccount extends ASSIGNMENT4_7.employeeinfo.Account {
	private final double PENALTY_PERCENT = 2.0;

	public RetirementAccount(ASSIGNMENT4_7.employeeinfo.Employee e, double startBalance){
		super(e,startBalance);
	}
	public RetirementAccount(ASSIGNMENT4_7.employeeinfo.Employee e){
		super(e);
	}	
	
	public boolean makeWithdrawal(double amount){
		double bal = getBalance();
		
		double penalty = bal * (PENALTY_PERCENT/100);
		bal = bal - amount - penalty;
		if(bal < 0){
			return false;
		}
		setBalance(bal);
		return true;
	}
	public ASSIGNMENT4_7.employeeinfo.AccountType getAcctType(){
		return ASSIGNMENT4_7.employeeinfo.AccountType.RETIREMENT;
	}	

}
